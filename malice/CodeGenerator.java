package malice;

import malice.commands.ArrayDeclarationCommand;
import malice.commands.ConditionalCommand;
import malice.commands.FunctionCallCommand;
import malice.commands.InputCommand;
import malice.commands.ThroughCommand;
import malice.commands.WhileNotCommand;
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
import malice.commands.ConditionalBranch;
import malice.commands.DecrementCommand;
import malice.commands.FunctionReturnCommand;
import malice.commands.IncrementCommand;
import malice.commands.SpeakCommand;
import malice.commands.VariableAssignmentCommand;
import malice.commands.VariableDeclarationCommand;
import malice.expressions.ArithmeticExpression;
import malice.expressions.BooleanExpression;
import malice.expressions.CharacterExpression;
import malice.expressions.Expression;
import malice.functions.LookingGlassFunction;
import malice.functions.RoomFunction;
import malice.symbols.MemoryLocation;
import malice.symbols.Storage;

public class CodeGenerator implements CommandVisitor {

    private List<Command> commands;
    private List<RoomFunction> rooms;
    private List<LookingGlassFunction> lookingGlasses;
    private SymbolTable symbolTable;
    private List<String> assemblyCommands;
    private Queue<Register> freeRegisters;
    private Set<String> freeMemoryLocationVariables;
    private Set<String> memoryLocationVariables;
    private int nextFreeMemoryAddress;
    private int nextComparisonNumber;
    private int nextConditionalLabel;
    private String scope;

    public CodeGenerator(List<Command> commands, List<RoomFunction> rooms,
            List<LookingGlassFunction> lookingGlasses, SymbolTable symbolTable) {
        this.commands = commands;
        this.rooms = rooms;
        this.lookingGlasses = lookingGlasses;
        this.symbolTable = symbolTable;

        assemblyCommands = new ArrayList<String>();
        freeRegisters = new LinkedList<Register>();
        freeRegisters.addAll(Arrays.asList(Register.values()));
        freeMemoryLocationVariables = new HashSet<String>();
        memoryLocationVariables = new HashSet<String>();
        nextFreeMemoryAddress = 0;
        nextComparisonNumber = 0;
        nextConditionalLabel = 0;
        scope = "";
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
        }

        assemblyCommands.add("mov rax 0");
        assemblyCommands.add("int 0x80");

        //TODO - rooms
        //TODO - looking glasses

        addPrint();
        makeDataSegment();

        return assemblyCommands;
    }

    @Override
    public void visitArrayDeclaration(ArrayDeclarationCommand command) {
        //TODO - visitArrayDeclaration
        //TODO - need to allocate memory and stuff
    }

    @Override
    public void visitConditional(ConditionalCommand command) {
        int conditionalLabel = nextConditionalLabel;
        nextConditionalLabel++;

        List<ConditionalBranch> branches = command.getBranches();

        Storage destStorage = allocateStorage();
        for (int i = 0; i < branches.size() - 1; i++) {
            if (branches.get(i).getCondition() == null) {
                break;
            }

            generateBooleanExpressionCode(destStorage, branches.get(i).getCondition());

            assemblyCommands.add("mov rax, " + destStorage);
            assemblyCommands.add("cmp rax, 1");
            assemblyCommands.add("je cond_" + conditionalLabel + "_" + i);   
        }
        freeStorage(destStorage);

        for (int i = branches.size() - 1; i >= 0; i--) {
            assemblyCommands.add("cond_" + conditionalLabel + "_" + i + ":");

            for (Command aCommand : branches.get(i).getCommands()) {
                aCommand.acceptVisitor(this);
            }

            if (i != 0) {
                // Don't need to jump if this is the last branch
                assemblyCommands.add("jmp cond_" + conditionalLabel + "_end");
            }
        }

        assemblyCommands.add("cond_" + conditionalLabel + "_end:");
    }

    @Override
    public void visitDecrement(DecrementCommand command) {
        Storage storage = symbolTable.getVariableStorage(command.getVariableName(), "");
        assemblyCommands.add("dec " + storage);
    }

    @Override
    public void visitFunctionCall(FunctionCallCommand command) {
        //TODO - visitFunctionCall
    }

    @Override
    public void visitFunctionReturn(FunctionReturnCommand command) {
        //TODO - visitFunctionReturn
    }

    @Override
    public void visitIncrement(IncrementCommand command) {
        Storage storage = symbolTable.getVariableStorage(command.getVariableName(), "");
        assemblyCommands.add("inc " + storage);
    }

    @Override
    public void visitInput(InputCommand command) {
        //TODO - visitInput
    }

    @Override
    public void visitSpeak(SpeakCommand command) {
        // No need to push and pop ebx and eax as this is the end of the program


        //TODO - I commented this out to be able to run the program
        //generateExpressionCode(Register.rbx, command.getExpression());
        // If the last command just does rbx=rbx remove it
        if (("mov " + Register.rbx + ", " + Register.rbx).equals(assemblyCommands.get(assemblyCommands.size() - 1))) {
            assemblyCommands.remove(assemblyCommands.size() - 1);
        }
        assemblyCommands.add("mov " + Register.rax + ", 1");
        assemblyCommands.add("int 0x80");
    }

    @Override
    public void visitThrough(ThroughCommand command) {
        //TODO - visitThrough
    }

    @Override
    public void visitVariableAssignment(VariableAssignmentCommand command) {
        Storage storage = symbolTable.getVariableStorage(command.getVariableName(), "");
        if (storage == Register.NONE) {
            storage = allocateStorage();
            symbolTable.setVariableStorage(command.getVariableName(), storage, "");
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

    @Override
    public void visitWhileNot(WhileNotCommand command) {
        //TODO - visitWhileNotmemoryLocationVariable
    }

    private void generateExpressionCode(Storage destStorage, CharacterExpression exp) {
        //assemblyCommands.add("mov " + Register.rax + ", " + destStorage);
        assemblyCommands.add("mov " + destStorage + ", " + (int) exp.getCharacter());
    }

    private void generateExpressionCode(Storage destStorage, ArithmeticExpression exp) {
        if (ArithmeticExpression.Type.BINOP == exp.getType()) {
            // binOp
            Storage leftStorage = allocateStorage();
            Storage rightStorage = allocateStorage();

            generateExpressionCode(leftStorage, exp.getLeftExpr());
            generateExpressionCode(rightStorage, exp.getRightExpr());
            generateBinOpCode(exp.getBinOp(), leftStorage, rightStorage);

            assemblyCommands.add("mov " + Register.rax + ", " + leftStorage);

            freeStorage(leftStorage);
            freeStorage(rightStorage);
        } else {
            if (!exp.isImmediateValue()) {
                // variable
                assemblyCommands.add("mov " + Register.rax + ", " + symbolTable.getVariableStorage(exp.getVariableName(), ""));
            } else {
                // immediate value
                assemblyCommands.add("mov " + Register.rax + ", " + exp.getImmediateValue());
            }

            String unaryOperators = exp.getUnaryOperators();
            for (int i = 0; i < unaryOperators.length(); i++) {
                if ('~' == unaryOperators.charAt(i)) {
                    assemblyCommands.add("not " + Register.rax);
                } else {
                    assemblyCommands.add("imul " + Register.rax + ", -1");
                }
            }
        }
        assemblyCommands.add("mov " + destStorage + ", " + Register.rax);
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
                assemblyCommands.add("mov  rdx, 0");
                assemblyCommands.add("idiv rbx");
                assemblyCommands.add("mov " + destStorage + ", rdx");
                break;
            case '|':
                assemblyCommands.add("mov rax, " + destStorage);
                assemblyCommands.add("mov rbx, " + moreStorage);
                assemblyCommands.add("mov  rdx, 0");
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
        //Need to check if moreStorage is being used in the symbol table
        //Use symboltable.usesStorage(moreStorage)
        if (symbolTable.usesStorage(moreStorage, scope)) {
            freeStorage(moreStorage);
        }
        //Not sure
    }

    private void generateBooleanExpressionCode(Storage destStorage, BooleanExpression exp) {
        assemblyCommands.add("");
        switch (exp.getType()) {
            case COMPARISON:
                Storage leftStorage = allocateStorage();
                Storage rightStorage = allocateStorage();

                //Evaluate both sides of the comparison
                generateExpressionCode(leftStorage, exp.getLeftAritExpr());
                generateExpressionCode(rightStorage, exp.getRightAritExpr());

                //Move the values into registers
                assemblyCommands.add("mov rax, " + leftStorage);
                assemblyCommands.add("mov rbx, " + rightStorage);

                if (exp.getOp().equals("&&")) {
                    assemblyCommands.add("and rax, rbx");
                } else if (exp.getOp().equals("||")) {
                    assemblyCommands.add("or rax, rbx");
                }

                assemblyCommands.add("mov " + destStorage + ", rax");

                assemblyCommands.add("");
                break;
            case BINOP:
                generateComparisonCode(destStorage, exp.getOp(), exp.getLeftAritExpr(), exp.getRightAritExpr());
                break;
            case FUNCTION:
                //TODO
                break;
        }


    }

    private void generateComparisonCode(Storage destStorage, String binop, ArithmeticExpression left, ArithmeticExpression right) {
        Storage leftStorage = allocateStorage();
        Storage rightStorage = allocateStorage();

        //Evaluate both sides of the comparison
        generateExpressionCode(leftStorage, left);
        generateExpressionCode(rightStorage, right);

        //Move the values into registers
        assemblyCommands.add("");
        assemblyCommands.add("mov rax, " + leftStorage);
        assemblyCommands.add("mov rbx, " + rightStorage);

        nextComparisonNumber += 1;
        String comparisonLabel = "test_" + nextComparisonNumber;

        assemblyCommands.add("cmp rax, rbx");


        if (binop.equals("==")) {
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
        } else if (binop.equals("&&")) {
        } else if (binop.equals("||")) {
        }

        String endLabel = "endtest_" + nextComparisonNumber;

        assemblyCommands.add("mov " + Register.rax + ", 0");
        assemblyCommands.add("mov " + destStorage + ", " + Register.rax);
        assemblyCommands.add("jmp " + endLabel);
        assemblyCommands.add(comparisonLabel + ":");
        assemblyCommands.add("mov " + Register.rax + ", 1");
        assemblyCommands.add("mov " + destStorage + ", " + Register.rax);
        assemblyCommands.add(endLabel + ":");
        assemblyCommands.add("");
    }

    private void generateConditionalCode() {
    }

    private void generateFunctionCode(String name) {
        assemblyCommands.add("");
        assemblyCommands.add(name + ":");
        assemblyCommands.add("ret");
    }

    private void generateLookingGlassCode() {
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
        } while (symbolTable.containsVariable(memoryLocationVariable, ""));

        //Keep a list of all memory locations
        memoryLocationVariables.add(memoryLocationVariable);

        return new MemoryLocation(memoryLocationVariable);
    }

    private void freeStorage(Storage storage) {
        freeMemoryLocationVariables.add(((MemoryLocation) storage).getLocationName());
    }

    private void makeDataSegment() {
        assemblyCommands.add("");
        assemblyCommands.add("segment .data");
        for (String x : memoryLocationVariables) {
            assemblyCommands.add(x + " dq " + 0);
        }
        assemblyCommands.add("octetbuffer dq 0");
    }

    private void addPrint() {
        //Shouldn't need to preserve registers, but just to be safe.
        assemblyCommands.add("");
        assemblyCommands.add("");
        assemblyCommands.add("print:");
        assemblyCommands.add("push " + Register.rax);
        assemblyCommands.add("push " + Register.rbx);
        assemblyCommands.add("push " + Register.rdx);
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
