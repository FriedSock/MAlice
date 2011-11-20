package malice;

import malice.symbols.SymbolTable;
import malice.symbols.Register;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
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

    public CodeGenerator(List<Command> commands, SymbolTable symbolTable) {
        this.commands = commands;
        this.symbolTable = symbolTable;

        assemblyCommands = new ArrayList<String>();
        freeRegisters = new LinkedList<Register>();
        freeRegisters.addAll(Arrays.asList(Register.values()));
        freeRegisters.remove(); // removes Register.NONE

        findLiveRanges();
    }

    private void findLiveRanges() {
        Set<String> allVariables = new HashSet<String>();
        for (Command command : commands) {
            allVariables.addAll(command.getUsedVariables());
        }


    }

    public List<String> generateCode() {
        for (Command command : commands) {
            command.acceptVisitor(this);
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
        //TODO - speak
        //Spec says we should use exit(1) command
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
        //TODO - variable declaration?
    }

    private void generateExpressionCode(Register destReg, CharacterExpression exp) {
        assemblyCommands.add("mov " + destReg + ", " + (int) exp.getCharacter());
    }

    private void generateExpressionCode(Register destReg, ArithmeticExpression exp) {
        List<String> commands = generateExpressionCode(exp);
        String register = commands.remove(0);
        assemblyCommands.addAll(commands);
        assemblyCommands.add("mov " + destReg + ", " + register);
    }

    //Returns a list of instructions to evaluate an expression. The name
    //of the register that the result is stored in is at the head of the list
    private List<String> generateExpressionCode(ArithmeticExpression exp) {
        List<String> returnValue = new ArrayList<String>();


        //TODO - Preserve registers

        if (exp.isValue()) {
            //TODO - Refactoring
            if (exp.tilda()) {
                returnValue.addAll(tildeCode(exp));
            } else {
                if (exp.valueHasBeenSet()) {
                    returnValue.add(exp.toString());
                } else {
                    try {
                        returnValue.add(symbolTable.getVariableRegister(exp.toString()).toString());
                    } catch (Throwable e) {
                        System.out.println("variable - " + exp.toString() + " has not been declared.");
                    }
                }
            }
        } else {
            //There is a binOp
            List<String> leftExp = generateExpressionCode(exp.left());
            List<String> rightExp = generateExpressionCode(exp.right());
            String leftVal = leftExp.remove(0);
            String rightVal = rightExp.remove(0);

            //TODO - Register Optimisation
            Register one = freeRegisters.remove();
            returnValue.add(one.toString());


            returnValue.addAll(leftExp);
            returnValue.addAll(rightExp);

            char binop = exp.binOp();
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
            } catch (Throwable e) {
            }
            try {
                Register r = Register.valueOf(rightVal);
                freeRegisters.add(r);
            } catch (Throwable e) {
            }
        }


        return returnValue;
    }

    private List<String> tildeCode(ArithmeticExpression exp) {
        List<String> returnValue = new ArrayList<String>();
        Register one = freeRegisters.remove();
        returnValue.add(one.toString());

        String removeTilde = exp.toString().substring(1);

        if (exp.valueHasBeenSet()) {
            returnValue.add("mov " + one + ", " + removeTilde);
            returnValue.add("not " + one);
        } else {
            try {
                Register reg = symbolTable.getVariableRegister(removeTilde);
                returnValue.add(removeTilde);
                returnValue.add("not " + reg);
            } catch (Throwable e) {
                System.out.println("variable - " + removeTilde + " has not been declared.");
            }
        }
        return returnValue;
    }
}
