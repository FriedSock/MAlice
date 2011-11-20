package malice;

import malice.symbols.SymbolTable;
import malice.symbols.Register;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
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
import malice.symbols.Storage;

public class CodeGenerator implements CommandVisitor {

    private List<Command> commands;
    private SymbolTable symbolTable;
    private List<String> assemblyCommands;
    private Queue<Register> freeRegisters;
    private Map<String, Command> variablesUsedLastInCommand;

    public CodeGenerator(List<Command> commands, SymbolTable symbolTable) {
        this.commands = commands;
        this.symbolTable = symbolTable;

        assemblyCommands = new ArrayList<String>();
        freeRegisters = new LinkedList<Register>();
        freeRegisters.addAll(Arrays.asList(Register.values()));
        freeRegisters.remove(); // removes Register.NONE
        variablesUsedLastInCommand = new HashMap<String, Command>();
        
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
        for (Command command : commands) {
            command.acceptVisitor(this);
            
            // free registers which are not used in later commands
            for (Map.Entry<String, Command> entry : variablesUsedLastInCommand.entrySet()) {
                if (command == entry.getValue()) {
                    Storage storage = symbolTable.getVariableStorage(entry.getKey());
                    if (storage.isRegister()) {
                        freeRegisters.add((Register) storage);
                    }
                }
            }
            
            //TODO - remove
            //System.out.println("freeRegs: " + freeRegisters.size());
        }
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
        Storage storage = symbolTable.getVariableStorage(command.getVariableName());
        assemblyCommands.add("mov ebx, " + storage );
        assemblyCommands.add("mov eax, 1");
        assemblyCommands.add("int 0x80");
    }

    @Override
    public void visitVariableAssignment(VariableAssignmentCommand command) {
        Storage storage = symbolTable.getVariableStorage(command.getVariableName());
        if (storage == Register.NONE) {
            storage = freeRegisters.remove();
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
        List<String> expressionCodeCommands = generateExpressionCode(exp);
        String register = expressionCodeCommands.remove(0);
        assemblyCommands.addAll(expressionCodeCommands);
        assemblyCommands.add("mov " + destStorage + ", " + register);
    }

    //Returns a list of instructions to evaluate an expression. The name
    //of the register that the result is stored in is at the head of the list
    private List<String> generateExpressionCode(ArithmeticExpression exp) {
        List<String> returnValue = new ArrayList<String>();

        if (exp.isValue()) {
            //TODO - Refactoring
            if (exp.hasTilde()) {
                returnValue.addAll(tildeCode(exp));
            } else {
                if (exp.isImmediateValue()) {
                    returnValue.add(exp.toString());
                } else {
                    returnValue.add(symbolTable.getVariableStorage(exp.toString()).toString());
                }
            }
        } else {
            //There is a binOp
            List<String> leftExp = generateExpressionCode(exp.getLeft());
            List<String> rightExp = generateExpressionCode(exp.getRight());
            String leftVal = leftExp.remove(0);
            String rightVal = rightExp.remove(0);

            //TODO - Register Optimisation
            Register one = freeRegisters.remove();
            returnValue.add(one.toString());


            returnValue.addAll(leftExp);
            returnValue.addAll(rightExp);

            char binop = exp.getBinOp();
            String regs = leftVal + ", " + rightVal;
            switch (binop) {
                case '+':
                    returnValue.add("add " + regs);
                    returnValue.add("mov " + one + ", " + leftVal);
                    break;
                case '&':
                    returnValue.add("and " + regs);
                    returnValue.add("mov " + one + ", " + leftVal);
                    break;
                case '*':
                    returnValue.add("mul " + regs);
                    returnValue.add("mov " + one + ", " + leftVal);
                    break;
                case '%':
                    returnValue.add("push eax");
                    returnValue.add("push edx");
                    returnValue.add("mov " + "eax, " + leftVal);
                    returnValue.add("idiv " + rightVal);
                    returnValue.add("mov " + one + ", eax");
                    returnValue.add("pop edx");
                    returnValue.add("pop eax");
                    break;
                case '/':
                    returnValue.add("push eax");
                    returnValue.add("push edx");
                    returnValue.add("mov " + "eax, " + leftVal);
                    returnValue.add("idiv " + rightVal);
                    returnValue.add("mov " + one + ", edx");
                    returnValue.add("pop edx");
                    returnValue.add("pop eax");
                    break;
                case '|':
                    returnValue.add("or " + regs);
                    returnValue.add("mov " + one + ", " + leftVal);
                    break;
                case '^':
                    returnValue.add("xor " + regs);
                    returnValue.add("mov " + one + ", " + leftVal);
                    break;
            }

            try {
                Register r = Register.valueOf(leftVal);
                freeRegisters.add(r);
            } catch (IllegalArgumentException e) {
            }
            try {
                Register r = Register.valueOf(rightVal);
                freeRegisters.add(r);
            } catch (IllegalArgumentException e) {
            }
        }


        return returnValue;
    }

    private List<String> tildeCode(ArithmeticExpression exp) {
        List<String> returnValue = new ArrayList<String>();
        Register one = freeRegisters.remove();
        returnValue.add(one.toString());

        String removeTilde = exp.toString().substring(1);

        if (exp.isImmediateValue()) {
            returnValue.add("mov " + one + ", " + removeTilde);
            returnValue.add("not " + one);
        } else {
            Storage storage = symbolTable.getVariableStorage(removeTilde);
            returnValue.add(removeTilde);
            returnValue.add("not " + storage);
        }
        return returnValue;
    }
}
