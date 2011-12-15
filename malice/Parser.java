package malice;

import malice.symbols.SymbolTable;
import malice.symbols.Type;
import malice.expressions.Expression;
import malice.expressions.CharacterExpression;
import malice.expressions.ArithmeticExpression;
import malice.commands.SpeakCommand;
import malice.commands.IncrementCommand;
import malice.commands.DecrementCommand;
import malice.commands.VariableDeclarationCommand;
import malice.commands.VariableAssignmentCommand;
import malice.commands.Command;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import malice.functions.LookingGlass;
import malice.functions.Room;
import org.antlr.runtime.tree.Tree;

public class Parser {

    private static final String STATEMENT = "statement";
    private static final String FUNCTION = "function";
    private static final String COMMAND = "command";
    // commands
    private static final String EXPRESSION_SPOKE = "expression_spoke";
    private static final String ARRAY_DECLARATION = "array_declaration";
    private static final String VARIABLE_DECLARATION = "variable_declaration";
    private static final String VARIABLE_ASSIGNMENT = "variable_assignment";
    private static final String PROCEDURE = "procedure";
    private static final String FUNCTION_CALL = "function_call";
    private static final String FUNCTION_RETURN = "function_return";
    private static final String THROUGH = "through";
    private static final String WHILE_NOT = "while_not";
    private static final String CONDITIONAL = "conditional";
    private static final String INPUT = "input";
    private static final String OUTPUT = "output";
    private static final String COMMENT = "comment";
    // procedures
    private static final String ATE = "ate";
    private static final String DRANK = "drank";
    // fields
    private List<Command> commands;
    private List<Room> rooms;
    private List<LookingGlass> lookingGlasses;
    private SymbolTable symbolTable;

    public Parser() {
        commands = new ArrayList<Command>();
        rooms = new ArrayList<Room>();
        lookingGlasses = new ArrayList<LookingGlass>();
        symbolTable = new SymbolTable();
    }

    public List<Command> getCommands() {
        return commands;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void parseProgram(Tree tree) {
        tree = tree.getChild(0);
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);

            if (STATEMENT.equals(child.getText())) {
                // statement
                parseStatement(child);
            } else if (FUNCTION.equals(child.getText())) {
                // function
                parseFunction(child);
            } else {
                // looking glass
                parseLookingGlass(child);
            }
        }
    }

    private void parseStatement(Tree tree) {
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);

            if (COMMAND.equals(child.getText())) {
                parseCommand(child);
            }
        }
    }

    private void parseCommand(Tree tree) {
        Tree commandTree = tree.getChild(0);
        String commandName = commandTree.getText();

        if (VARIABLE_DECLARATION.equals(commandName)) {
            commands.add(parseVariableDeclaration(commandTree));
        } else if (VARIABLE_ASSIGNMENT.equals(commandName)) {
            commands.add(parseVariableAssignment(commandTree));
        } else if (EXPRESSION_SPOKE.equals(commandName)) {
            commands.add(parseExpressionSpoke(commandTree));
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

            expression = parseArithmeticExpression(tree.getChild(2));

            Set<String> variablesUsed = expression.getUsedVariables();
            for (String variableUsed : variablesUsed) {
                if (!symbolTable.containsVariable(variableUsed)) {
                    throw new VariableNotDeclaredException(variableUsed);
                }
                if (Type.number != symbolTable.getVariableType(variableUsed)) {
                    throw new IncompatibleTypeException(variableUsed
                            + " is not a number and therefore cannot be in an arithmetic expression");
                }
                if (!symbolTable.isInitialisedVariable(variableUsed) && !variableName.equals(variableUsed)) {
                    throw new VariableNotInitialisedException(variableUsed);
                }
            }
        }

        symbolTable.initialiseVariable(variableName);

        return new VariableAssignmentCommand(variableName, expression);
    }

    private Command parseExpressionSpoke(Tree tree) {
        // Only an arithmetic expression or a variable can speak - not a character
        ArithmeticExpression expression = parseArithmeticExpression(tree.getChild(0));

        Set<String> variablesUsed = expression.getUsedVariables();
        for (String variableUsed : variablesUsed) {
            if (!symbolTable.containsVariable(variableUsed)) {
                throw new VariableNotDeclaredException(variableUsed);
            }
            if (Type.number != symbolTable.getVariableType(variableUsed)) {
                throw new IncompatibleTypeException(variableUsed
                        + " is not a number and therefore cannot be in an arithmetic expression");
            }
            if (!symbolTable.isInitialisedVariable(variableUsed)) {
                throw new VariableNotInitialisedException(variableUsed);
            }
        }

        return new SpeakCommand(expression);
    }

    private Command parseProcedure(Tree tree) {
        String variableName = tree.getChild(0).getText();

        if (!symbolTable.containsVariable(variableName)) {
            throw new VariableNotDeclaredException(variableName);
        }
        if (!symbolTable.isInitialisedVariable(variableName)) {
            throw new VariableNotInitialisedException(variableName);
        }

        String procedureName = tree.getChild(1).getText();

        if (ATE.equals(procedureName)) {
            return new IncrementCommand(variableName);
        } else if (DRANK.equals(procedureName)) {
            return new DecrementCommand(variableName);
        } else {
            // in case of syntax connectors such as and
            return null;
        }
    }

    private ArithmeticExpression parseArithmeticExpression(Tree tree) {
        if (tree.getText().equals("factor")) {
            String firstChildText = tree.getChild(0).getText();
            if (firstChildText.startsWith("MismatchedSetException")) {
                throw new IllegalArgumentException("Invalid arithmetic expression: " + tree.toStringTree());
            }

            int childCount = tree.getChildCount();
            String terminal = tree.getChild(childCount - 1).getText();
            String unaryOperators = "";
            for (int i = 0; i < childCount - 1; i++) {
                unaryOperators += tree.getChild(i).getText();
            }
            try {
                // to decide if there is an identifier or an immediate value
                int value = Integer.valueOf(terminal);
                return new ArithmeticExpression(value, unaryOperators);
            } catch (NumberFormatException e) {
                return new ArithmeticExpression(terminal, unaryOperators);
            }
        } else {
            Tree leftExp = tree.getChild(0);
            if (tree.getChildCount() > 1) {
                ArithmeticExpression rightExp = parseArithmeticExpression(leftExp);
                for (int i = 2; i < tree.getChildCount(); i += 2) {
                    leftExp = tree.getChild(i);
                    rightExp = new ArithmeticExpression(rightExp, parseArithmeticExpression(leftExp), tree.getChild(i - 1).toString().charAt(0));
                }
                return rightExp;
            }
            return parseArithmeticExpression(leftExp);
        }
    }

    private void parseFunction(Tree tree) {
        //TODO - parsing functions
    }

    private void parseLookingGlass(Tree tree) {
        //TODO - looking glasses
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
            super(variableName + " was not declared");
        }
    }

    public static class VariableNotInitialisedException extends RuntimeException {

        public VariableNotInitialisedException(String variableName) {
            super(variableName + " was not initialised");
        }
    }

    public static class IncompatibleTypeException extends RuntimeException {

        public IncompatibleTypeException(String variableName, Type type) {
            super(variableName + " can only be assigned a value of type " + type);
        }

        public IncompatibleTypeException(String message) {
            super(message);
        }
    }
}
