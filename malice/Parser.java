package malice;

import malice.commands.SpeakCommand;
import malice.commands.IncrementCommand;
import malice.commands.DecrementCommand;
import malice.commands.VariableDeclarationCommand;
import malice.commands.VariableAssignmentCommand;
import malice.commands.Command;
import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.tree.Tree;

public class Parser {

    private List<Command> commands;
    private SymbolTable symbolTable;

    public Parser() {
        commands = new ArrayList<Command>();
        symbolTable = new SymbolTable();
    }

    public List<Command> getCommands() {
        return commands;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void parseProg(Tree tree) {
        tree = tree.getChild(0);
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);
            parseStatement(child);
        }
        int breakpoint = 1;
    }

    private void parseStatement(Tree tree) {
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);

            if ("command".equals(child.getText())) {
                parseCommand(child);
            }
        }
    }

    private void parseCommand(Tree tree) {
        Tree commandTree = tree.getChild(0);
        String commandName = commandTree.getText();

        if ("variable_declaration".equals(commandName)) {
            commands.add(parseVariableDeclaration(commandTree));
        } else if ("variable_assignment".equals(commandName)) {
            commands.add(parseVariableAssignment(commandTree));
        } else {
            commands.add(parseProcedure(tree));
        }
    }

    private Command parseVariableDeclaration(Tree tree) {
        String variableName = tree.getChild(0).getText();
        Type variableType = Type.valueOf(tree.getChild(2).getText());

        if (symbolTable.containsVariable(variableName)) {
            throw new VariableAlreadyDeclaredException(variableName);
        }

        symbolTable.addVariable(variableName, variableType);

        return new VariableDeclarationCommand(variableName, variableType);
    }

    private Command parseVariableAssignment(Tree tree) {
        String variableName = tree.getChild(0).getText();

        if (!symbolTable.containsVariable(variableName)) {
            throw new VariableNotDeclaredException(variableName);
        }

        String expressionText = tree.getChild(2).getChild(0).getText();
        Expression expression = null;

        Type variableType = symbolTable.getVariableType(variableName);
        if ('\'' == expressionText.charAt(0)) {
            // character expression
            if (Type.letter != variableType) {
                throw new IncompatibleTypeException(variableName, variableType);
            }

            expression = new CharacterExpression(expressionText.charAt(1));
        } else {
            // arithmetic expression
            if (Type.number != variableType) {
                throw new IncompatibleTypeException(variableName, variableType);
            }

            //TODO

            expression = parseArithmeticExpression(tree.getChild(2));
        }

        return new VariableAssignmentCommand(variableName, expression);
    }

    private Command parseProcedure(Tree tree) {
        String variableName = tree.getChild(0).getText();
        String procedureName = tree.getChild(1).getText();

        if ("ate".equals(procedureName)) {
            return new IncrementCommand(variableName);
        } else if ("drank".equals(procedureName)) {
            return new DecrementCommand(variableName);
        } else if ("spoke".equals(procedureName)) {
            return new SpeakCommand(variableName);
        } else {
            // in case of syntax connectors such as and
            return null;
        }
    }

    private ArithmeticExpression parseArithmeticExpression(Tree tree) {

        if (tree.getText().equals("factor")) {
            try {
            int value = Integer.valueOf(tree.getChild(0).getText());
            return new ArithmeticExpression(value);
            }
            catch (Throwable e) {
                return new ArithmeticExpression(tree.getChild(0).getText());
            }
            
        } else if (tree.getText().equals("expression")) {
            Tree Exp = tree.getChild(0);
            ArithmeticExpression Exp2 = parseArithmeticExpression(Exp);
            for (int i = 2; i < tree.getChildCount(); i += 2) {
                Exp = tree.getChild(i);
                Exp2 = new ArithmeticExpression(Exp2, parseArithmeticExpression(Exp), '+');
            }
            return Exp2;
        } else {
            Tree left = tree.getChild(0);
            if (tree.getChildCount() > 1) {
                Tree right = tree.getChild(2);
                char op = tree.getChild(1).getText().charAt(0);
                return new ArithmeticExpression(parseArithmeticExpression(left), parseArithmeticExpression(right), op);
            }
            return parseArithmeticExpression(left);
        }

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Command command : commands) {
            builder.append(command);
            builder.append('\n');
        }
        return builder.toString();
    }

    public static class VariableAlreadyDeclaredException extends RuntimeException {

        public VariableAlreadyDeclaredException(String variableName) {
            super(variableName + " was already declared");
        }
    }

    public static class VariableNotDeclaredException extends RuntimeException {

        public VariableNotDeclaredException(String variableName) {
            super(variableName + " was not declared and therefore cannot be assigned a value");
        }
    }

    public static class IncompatibleTypeException extends RuntimeException {

        public IncompatibleTypeException(String variableName, Type type) {
            super(variableName + " can only be assigned a value of type " + type);
        }
    }
}
