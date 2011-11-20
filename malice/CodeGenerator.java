package malice;

import malice.symbols.SymbolTable;
import malice.symbols.Register;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import malice.commands.Command;
import malice.commands.CommandVisitor;
import malice.commands.DecrementCommand;
import malice.commands.IncrementCommand;
import malice.commands.SpeakCommand;
import malice.commands.VariableAssignmentCommand;
import malice.commands.VariableDeclarationCommand;
import malice.expressions.ArithmeticExpression;

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
        freeRegisters.remove();
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

        //TODO - variable assignment
        assemblyCommands.add("mov " + reg + ", 0");
    }

    @Override
    public void visitVariableDeclaration(VariableDeclarationCommand command) {
        //TODO - variable declaration?
    }

    //Returns a list of instructions to evaluate an expression. The name
    //of the register that the result is stored in is at the head of the list
    private List<String> generateExpressionCode(ArithmeticExpression exp) {
        List<String> returnValue = new ArrayList<String>();


        //TODO - Preserve registers

        if (exp.isValue()) {
            //TODO - Tilda
            if (exp.valueHasBeenSet()) {
                returnValue.add(exp.toString());
            }
            returnValue.add(symbolTable.getVariableRegister(exp.toString()).toString());
        } else {
            //There is a binOp
            List<String> leftExp = generateExpressionCode(exp.left());
            List<String> rightExp = generateExpressionCode(exp.right());
            String leftVal = leftExp.remove(0);
            String rightVal = rightExp.remove(0);

            //TODO - Register Optimisation
            Register one = freeRegisters.remove();
            returnValue.add(one.toString());


            while (!leftExp.isEmpty() || !rightExp.isEmpty()) {
                if (leftExp.isEmpty()) {
                    returnValue.add(leftExp.remove(leftExp.size() - 1));
                } else {
                    returnValue.add(rightExp.remove(rightExp.size() - 1));
                }
            }

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
        }
        return returnValue;
    }
}
