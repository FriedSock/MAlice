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
                    freeRegisters.add(symbolTable.getVariableRegister(entry.getKey()));
                }
            }
            
            //TODO - remove
            //System.out.println("freeRegs: " + freeRegisters.size());
        }
        return assemblyCommands;
    }

    @Override
    public void visitDecrement(DecrementCommand command) {
        Register reg = symbolTable.getVariableRegister(command.getVariableName());
        assemblyCommands.add("dec " + reg);
    }

    @Override
    public void visitIncrement(IncrementCommand command) {
        Register reg = symbolTable.getVariableRegister(command.getVariableName());
        assemblyCommands.add("inc " + reg);
    }

    @Override
    public void visitSpeak(SpeakCommand command) {
        Register reg = symbolTable.getVariableRegister(command.variable());
        assemblyCommands.add("mov ebx, " + reg );
        assemblyCommands.add("mov eax, 1");
        assemblyCommands.add("int 0x80");
    }

    @Override
    public void visitVariableAssignment(VariableAssignmentCommand command) {
        Register reg = symbolTable.getVariableRegister(command.getVariableName());
        if (reg == Register.NONE) {
            reg = freeRegisters.remove();
            symbolTable.setVariableRegister(command.getVariableName(), reg);
        }

        Expression exp = command.getExpression();
        if (exp.isArithmeticExpression()) {
            generateExpressionCode(reg, (ArithmeticExpression) exp);
        } else {
            generateExpressionCode(reg, (CharacterExpression) exp);
        }
    }

    @Override
    public void visitVariableDeclaration(VariableDeclarationCommand command) {
    }

    private void generateExpressionCode(Register destReg, CharacterExpression exp) {
        assemblyCommands.add("mov " + destReg + ", " + (int) exp.getCharacter());
    }

    private void generateExpressionCode(Register destReg, ArithmeticExpression exp) {
        List<String> expressionCodeCommands = generateExpressionCode(exp);
        String register = expressionCodeCommands.remove(0);
        assemblyCommands.addAll(expressionCodeCommands);
        assemblyCommands.add("mov " + destReg + ", " + register);
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
                    returnValue.add(symbolTable.getVariableRegister(exp.toString()).toString());
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
            Register reg = symbolTable.getVariableRegister(removeTilde);
            returnValue.add(removeTilde);
            returnValue.add("not " + reg);
        }
        return returnValue;
    }
}
