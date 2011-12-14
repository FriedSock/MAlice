package malice;

import malice.symbols.SymbolTable;
import malice.symbols.Register;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import malice.commands.Command;
import malice.commands.CommandVisitor;
import malice.commands.DecrementCommand;
import malice.commands.IncrementCommand;
import malice.commands.SpeakCommand;
import malice.commands.VariableAssignmentCommand;
import malice.commands.VariableDeclarationCommand;
import malice.expressions.ArithmeticExpression;
import malice.expressions.CharacterExpression;
import malice.expressions.Expression;
import malice.symbols.MemoryLocation;
import malice.symbols.Storage;

public class CodeGenerator implements CommandVisitor {

    private List<Command> commands;
    private SymbolTable symbolTable;
    private List<String> assemblyCommands;
    private Queue<Register> freeRegisters;
    private Map<String, Command> variablesUsedLastInCommand;
    private Set<String> freeMemoryLocationVariables;
    private Set<String> comparisonTests;
    private int nextFreeMemoryAddress;
    private int nextComparisonNumber;

    public CodeGenerator(List<Command> commands, SymbolTable symbolTable) {
        this.commands = commands;
        this.symbolTable = symbolTable;

        assemblyCommands = new ArrayList<String>();
        freeRegisters = new LinkedList<Register>();
        freeRegisters.addAll(Arrays.asList(Register.values()));
        variablesUsedLastInCommand = new HashMap<String, Command>();
        freeMemoryLocationVariables = new HashSet<String>();
        nextFreeMemoryAddress = 1;

        findLiveRanges();
    }

    private void findLiveRanges() {
        Set<String> allVariables = new HashSet<String>();
        for (Command command : commands) {
            allVariables.addAll(command.getUsedVariables());
        }

        for (Command command : commands) {
            for (String variableName : allVariables) {
                if (command.usesVariable(variableName)) {
                    variablesUsedLastInCommand.put(variableName, command);
                }
            }
        }
    }

    public List<String> generateCode() {
        assemblyCommands.add("extern malloc");
        assemblyCommands.add("");
        assemblyCommands.add("segment .text");
        assemblyCommands.add("");
        assemblyCommands.add("global main");
        assemblyCommands.add("main:");

        for (Command command : commands) {
            command.acceptVisitor(this);

            // free storage used by variables which is not needed in later commands
            for (Map.Entry<String, Command> entry : variablesUsedLastInCommand.entrySet()) {
                if (command == entry.getValue()) {
                    Storage storage = symbolTable.getVariableStorage(entry.getKey());
                    freeStorage(storage);
                }
            }
        }

        assemblyCommands.add("mov rax 0");
        assemblyCommands.add("int 0x80");

        addPrint();
        makeDataSegment();

        return assemblyCommands;
    }

    @Override
    public void visitDecrement(DecrementCommand command) {
        Storage storage = symbolTable.getVariableStorage(command.getVariableName());
        assemblyCommands.add("dec " + storage);
    }

    @Override
    public void visitIncrement(IncrementCommand command) {
        Storage storage = symbolTable.getVariableStorage(command.getVariableName());
        assemblyCommands.add("inc " + storage);
    }

    @Override
    public void visitSpeak(SpeakCommand command) {
        // No need to push and pop ebx and eax as this is the end of the program
        generateExpressionCode(Register.rbx, command.getExpression());
        // If the last command just does rbx=rbx remove it
        if (("mov " + Register.rbx + ", " + Register.rbx).equals(assemblyCommands.get(assemblyCommands.size() - 1))) {
            assemblyCommands.remove(assemblyCommands.size() - 1);
        }
        assemblyCommands.add("mov " + Register.rax + ", 1");
        assemblyCommands.add("int 0x80");
    }

    @Override
    public void visitVariableAssignment(VariableAssignmentCommand command) {
        Storage storage = symbolTable.getVariableStorage(command.getVariableName());
        if (storage == Register.NONE) {
            storage = allocateStorage();
            symbolTable.setVariableStorage(command.getVariableName(), storage);
        }

        Expression exp = command.getExpression();
        if (exp.isArithmeticExpression()) {
            generateExpressionCode(storage, (ArithmeticExpression) exp);
        } else {
            generateExpressionCode(storage, (CharacterExpression) exp);
        }
    }

    @Override
    public void visitVariableDeclaration(VariableDeclarationCommand command) {
    }

    private void generateExpressionCode(Storage destStorage, CharacterExpression exp) {
        assemblyCommands.add("mov " + destStorage + ", " + (int) exp.getCharacter());
    }

    private void generateExpressionCode(Storage destStorage, ArithmeticExpression exp) {
        if (!exp.isImmediateValue() && !exp.isValue()) {
            // binOp
            Storage leftStorage = allocateStorage();
            Storage rightStorage = allocateStorage();

            generateExpressionCode(leftStorage, exp.getLeft());
            generateExpressionCode(rightStorage, exp.getRight());
            generateBinOpCode(exp.getBinOp(), leftStorage, rightStorage);
            assemblyCommands.add("mov " + destStorage + ", " + leftStorage);

            freeStorage(leftStorage);
            freeStorage(rightStorage);
        } else {
            if (!exp.isImmediateValue()) {
                // variable
                assemblyCommands.add("mov " + destStorage + ", "
                        + symbolTable.getVariableStorage(exp.getVariableName()));
            } else {
                // immediate value
                assemblyCommands.add("mov " + destStorage + ", " + exp.getValue());
            }

            String unaryOperators = exp.getUnaryOperators();
            for (int i = 0; i < unaryOperators.length(); i++) {
                if ('~' == unaryOperators.charAt(i)) {
                    assemblyCommands.add("not " + destStorage);
                } else {
                    if (Register.rax == destStorage) {
                        assemblyCommands.add("push " + Register.rbx);
                        assemblyCommands.add("mov " + Register.rbx + ", 0");
                        assemblyCommands.add("sub " + Register.rbx + ", " + destStorage);
                        assemblyCommands.add("mov " + destStorage + ", " + Register.rbx);
                        assemblyCommands.add("pop " + Register.rbx);
                    } else {
                        assemblyCommands.add("push " + Register.rax);
                        assemblyCommands.add("mov " + Register.rax + ", 0");
                        assemblyCommands.add("sub " + Register.rax + ", " + destStorage);
                        assemblyCommands.add("mov " + destStorage + ", " + Register.rax);
                        assemblyCommands.add("pop " + Register.rax);
                    }

                    assemblyCommands.add("not " + destStorage);
                    assemblyCommands.add("not " + destStorage);
                }
            }
        }
    }

    private void generateBinOpCode(char binOp, Storage destStorage, Storage moreStorage) {
        switch (binOp) {
            case '+':
                assemblyCommands.add("mov rax, " + destStorage);
                assemblyCommands.add("mov rbx, " + moreStorage);
                assemblyCommands.add("add rax, rbx");
                assemblyCommands.add("mov " + destStorage + ", rax");
                //assemblyCommands.add("mov " + moreStorage + ", rbx");
                break;
            case '-':
                assemblyCommands.add("mov rax, " + destStorage);
                assemblyCommands.add("mov rbx, " + moreStorage);
                assemblyCommands.add("sub rax, rbx");
                assemblyCommands.add("mov " + destStorage + ", rax");
                break;
            case '&':
                assemblyCommands.add("mov rax, " + destStorage);
                assemblyCommands.add("mov rbx, " + moreStorage);
                assemblyCommands.add("and rax, rbx");
                assemblyCommands.add("mov " + destStorage + ", rax");
                //assemblyCommands.add("mov " + moreStorage + ", rbx");
                break;
            case '*':
                assemblyCommands.add("mov rax, " + destStorage);
                assemblyCommands.add("mov rbx, " + moreStorage);
                assemblyCommands.add("imul rax, rbx");
                assemblyCommands.add("mov " + destStorage + ", rax");
                //assemblyCommands.add("mov " + moreStorage + ", rbx");
                break;
            case '%':
                assemblyCommands.add("mov rax, " + destStorage);
                assemblyCommands.add("mov rbx, " + moreStorage);
                assemblyCommands.add("idiv rbx");
                assemblyCommands.add("mov " + destStorage + ", rax");
                break;
            case '/':
                assemblyCommands.add("mov rax, " + destStorage);
                assemblyCommands.add("mov rbx, " + moreStorage);
                assemblyCommands.add("idiv rbx");
                assemblyCommands.add("mov " + destStorage + ", rdx");
                break;
            case '|':
                assemblyCommands.add("mov rax, " + destStorage);
                assemblyCommands.add("mov rbx, " + moreStorage);
                assemblyCommands.add("or  rax, rbx");
                assemblyCommands.add("mov " + destStorage + ", rax");
                //assemblyCommands.add("mov " + moreStorage + ", rbx");
                break;
            case '^':
                assemblyCommands.add("mov rax, " + destStorage);
                assemblyCommands.add("mov rbx, " + moreStorage);
                assemblyCommands.add("xor rax, rbx");
                assemblyCommands.add("mov " + destStorage + ", rax");
                //assemblyCommands.add("mov " + moreStorage + ", rbx");
                break;

        }
        freeStorage(moreStorage); //Not sure
    }

    private void generateBooleanExpressionCode(Storage destStorage, String binop, ArithmeticExpression left, ArithmeticExpression right){
        assemblyCommands.add("");

        if (binop.equals("==")) {
            generateComparisonCode(destStorage, binop, left, right);
        }

        Storage leftStorage = allocateStorage();
        Storage rightStorage = allocateStorage();

        //Evaluate both sides of the comparison
        generateExpressionCode(leftStorage, left);
        generateExpressionCode(rightStorage, right);

        //Move the values into registers
        assemblyCommands.add("mov rax, " + leftStorage);
        assemblyCommands.add("mov rbx, " + rightStorage);

        if (binop.equals("&&")) {
            assemblyCommands.add("and rax, rbx");
        } else if (binop.equals("||")) {
            assemblyCommands.add("or rax, rbx");
        }

        assemblyCommands.add("mov " + destStorage + ", rax");

        assemblyCommands.add("");
    }
    private void generateComparisonCode(Storage destStorage, String binop, ArithmeticExpression left, ArithmeticExpression right){
        Storage leftStorage = allocateStorage();
        Storage rightStorage = allocateStorage();

        //Evaluate both sides of the comparison
        generateExpressionCode(leftStorage, left);
        generateExpressionCode(rightStorage, right);

        //Move the values into registers
        assemblyCommands.add("");
        assemblyCommands.add("mov rax, " + leftStorage);
        assemblyCommands.add("mov rbx, " + rightStorage);
        
        String comparisonLabel = "test_" + nextComparisonNumber;
        nextComparisonNumber += 1;
        assemblyCommands.add("cmp rax, rbx");
        
       
        if(binop.equals("==")){
            assemblyCommands.add("je " + comparisonLabel);
        } else if (binop.equals("!=")) {
            assemblyCommands.add("jne " + comparisonLabel);
        } else if (binop.equals(">")) {
            assemblyCommands.add("jg " + comparisonLabel);
        } else if (binop.equals("<")) {
            assemblyCommands.add("jl " + comparisonLabel);
        } else if (binop.equals(">=")) {
            assemblyCommands.add("jge " + comparisonLabel);
        } else if (binop.equals("<=")) {
            assemblyCommands.add("jle " + comparisonLabel);
        }
        String endLabel = "endtest_" + nextComparisonNumber;

        assemblyCommands.add("mov " + destStorage + ", 0");
        assemblyCommands.add("jmp " + endLabel);
        assemblyCommands.add(comparisonLabel + ":");
        assemblyCommands.add("mov " + destStorage + ", 1");
        assemblyCommands.add(endLabel + ":");
        assemblyCommands.add("");
    }

    private void generateConditionalCode(){

    }
    
    private void generateFunctionCode(String name){
            assemblyCommands.add("");
            assemblyCommands.add(name + ":");
            assemblyCommands.add("ret");
    }

    private Storage allocateStorage() {
        /*if (freeRegisters.size() > 0) {
            Register register = freeRegisters.remove();
            return register;
        }*/

        if (!freeMemoryLocationVariables.isEmpty()) {
            Iterator<String> iter = freeMemoryLocationVariables.iterator();
            String memoryLocationVariable = iter.next();
            iter.remove();

            return new MemoryLocation(memoryLocationVariable);
        }

        String memoryLocationVariable;
        do {
            memoryLocationVariable = "mem_" + nextFreeMemoryAddress;
            nextFreeMemoryAddress += 1;
        } while (symbolTable.containsVariable(memoryLocationVariable));

        return new MemoryLocation(memoryLocationVariable);
    }

    private void freeStorage(Storage storage) {
        if (storage.isRegister()) {
            freeRegisters.add((Register) storage);
        } else {
            freeMemoryLocationVariables.add(((MemoryLocation) storage).getVariableName());
        }
    }

    private void makeDataSegment() {
        assemblyCommands.add("");
        assemblyCommands.add("segment .data");
        for(String x : freeMemoryLocationVariables) {
            assemblyCommands.add(x +" dq" + 0);
        }
        assemblyCommands.add("octetbuffer dq 0");
    }

    private void addPrint() {
        assemblyCommands.add("push " + Register.rax);
        assemblyCommands.add("push " + Register.rbx);
        assemblyCommands.add("push " + Register.rdx);
        assemblyCommands.add("");
        assemblyCommands.add("");
        assemblyCommands.add("print:");
        assemblyCommands.add("mov [octetbuffer], rcx");
        assemblyCommands.add("lea rcx, [octetbuffer]");
        assemblyCommands.add("mov rbx, 1");
        assemblyCommands.add("mov rdx, 1");
        assemblyCommands.add("mov rax, 4");
        assemblyCommands.add("int 0x80");
        assemblyCommands.add("pop " + Register.rdx);
        assemblyCommands.add("pop " + Register.rbx);
        assemblyCommands.add("pop " + Register.rax);
        assemblyCommands.add("ret");
    }
}