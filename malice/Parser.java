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
import malice.commands.ArrayDeclarationCommand;
import malice.commands.FunctionCallCommand;
import malice.expressions.BooleanExpression;
import malice.expressions.StringExpression;
import malice.functions.LookingGlassFunction;
import malice.functions.RoomFunction;
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
    private List<RoomFunction> rooms;
    private List<LookingGlassFunction> lookingGlasses;
    private SymbolTable symbolTable;

    public Parser() {
        commands = new ArrayList<Command>();
        rooms = new ArrayList<RoomFunction>();
        lookingGlasses = new ArrayList<LookingGlassFunction>();
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

        if (EXPRESSION_SPOKE.equals(commandName)) {
            commands.add(parseExpressionSpoke(commandTree));
            System.out.println(commands.get(commands.size() - 1));
        } else if (ARRAY_DECLARATION.equals(commandName)) {
            commands.add(parseArrayDeclaration(commandTree));
        } else if (VARIABLE_DECLARATION.equals(commandName)) {
            commands.add(parseVariableDeclaration(commandTree));
        } else if (VARIABLE_ASSIGNMENT.equals(commandName)) {
            commands.add(parseVariableAssignment(commandTree));
        } else if (PROCEDURE.equals(commandName)) {
            commands.add(parseProcedure(tree));
        } else if (FUNCTION_CALL.equals(commandName)) {
            commands.add(parseFunctionCall(tree));
        } else if (FUNCTION_RETURN.equals(commandName)) {
            commands.add(parseProcedure(tree));
        } else if (THROUGH.equals(commandName)) {
            commands.add(parseProcedure(tree));
        } else if (WHILE_NOT.equals(commandName)) {
            commands.add(parseProcedure(tree));
        } else if (CONDITIONAL.equals(commandName)) {
            commands.add(parseProcedure(tree));
        } else if (INPUT.equals(commandName)) {
            commands.add(parseProcedure(tree));
        } else if (OUTPUT.equals(commandName)) {
            commands.add(parseProcedure(tree));
        } else if (COMMENT.equals(commandName)) {
            // discard comment
        }
    }

    private Command parseExpressionSpoke(Tree tree) {
        String ruleName = tree.getChild(0).getText();
        
        Expression expression;
        
        if ("expression".equals(ruleName)) {
            expression = parseArithmeticExpression(tree.getChild(0));
        } else if ("boolean_expression".equals(ruleName)) {
            expression = parseBooleanExpression(tree.getChild(0));
        } else if ('"' == ruleName.charAt(0)) {
            String expressionText = tree.getChild(0).getText();
            expression = new StringExpression(expressionText.substring(1, expressionText.length() - 2));
        } else if ('\'' == ruleName.charAt(0)) {
            String expressionText = tree.getChild(0).getText();
            expression = new CharacterExpression(expressionText.charAt(1));
        } else {
            throw new IllegalArgumentException("Build failed: Wrong expression in a Spoke command");
        }
        
        Set<String> variablesUsed = expression.getUsedVariables();
        for (String variableUsed : variablesUsed) {
            if (!symbolTable.containsVariable(variableUsed)) {
                throw new VariableNotDeclaredException(variableUsed);
            }
        }
        
        return new SpeakCommand(expression);
    }

    private Command parseArrayDeclaration(Tree tree) {
        String variableName = tree.getChild(0).getText();
        Type variableType = Type.valueOf(tree.getChild(3).getText());
        ArithmeticExpression size = parseArithmeticExpression(tree.getChild(1));

        if (symbolTable.containsVariable(variableName)) {
            throw new VariableAlreadyDeclaredException(variableName);
        }

        symbolTable.addVariable(variableName, Type.array);

        Set<String> variablesUsed = size.getUsedVariables();
        for (String variableUsed : variablesUsed) {
            if (!symbolTable.containsVariable(variableUsed)) {
                throw new VariableNotDeclaredException(variableUsed);
            }
            if (Type.number != symbolTable.getVariableType(variableUsed)) {
                throw new IncompatibleTypeException(variableUsed
                        + " is not a number and therefore cannot be in an arithmetic expression");
            }
        }

        return new ArrayDeclarationCommand(variableName, variableType, size);
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
        } else if ('"' == expressionText.charAt(0)) {
            // string expression
            if (Type.sentence != variableType) {
                throw new IncompatibleTypeException(variableName, variableType);
            }

            expression = new StringExpression(expressionText.substring(1, expressionText.length() - 2));
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

    private Command parseFunctionCall(Tree tree) {
        List<ArithmeticExpression> parameters = new ArrayList<ArithmeticExpression>();
        for (int j = 2; j <= tree.getChildCount() - 2; j += 2) {
            parameters.add(parseArithmeticExpression(tree.getChild(j)));
        }

        FunctionCallCommand functionCall = new FunctionCallCommand(tree.getChild(0).getText(), parameters);
        return functionCall;
    }

    private ArithmeticExpression parseArithmeticExpression(Tree tree) {
        String ruleName = tree.getText();

        // Parsing the value rule.
        if ("value".equals(ruleName)) {
            String unaryOperators = "";
            int i = 0;
            while (tree.getChild(i).getText().charAt(0) == '-' || tree.getChild(i).getText().charAt(0) == '~') {
                unaryOperators += tree.getChild(i).getText();
                i++;
            }

            if ('(' == tree.getChild(i).getText().charAt(0)) {
                // Nested expression
                ArithmeticExpression nestedExpr = parseArithmeticExpression(tree.getChild(i + 1));
                nestedExpr.setUnaryOperators(unaryOperators);
                return nestedExpr;
            } else if ("array_piece".equals(tree.getChild(i).getText())) {
                // Array pieces
                ArithmeticExpression pieceIndex = parseArithmeticExpression(tree.getChild(i).getChild(2));
                return new ArithmeticExpression(tree.getChild(i).getChild(0).getText(), pieceIndex, unaryOperators);
            } else if ("function_call".equals(tree.getChild(i).getText())) {
                // Function call
                return new ArithmeticExpression((FunctionCallCommand) parseFunctionCall(tree.getChild(i)), unaryOperators);
            } else {
                // Variable or and immediate value
                try {
                    int value = Integer.valueOf(tree.getChild(i).getText());
                    // Immediate value
                    return new ArithmeticExpression(value, unaryOperators);
                } catch (NumberFormatException e) {
                    // Variable
                    return new ArithmeticExpression(tree.getChild(i).getText(), unaryOperators);
                }
            }
        }

        // Now it must be a binary rule

        // If there is only one children rule it is not a binary operation
        if (tree.getChildCount() == 1) {
            return parseArithmeticExpression(tree.getChild(0));
        }

        // Parse a binary operation assuming all the operators are left-associative
        int rightExprIndex = 2;
        ArithmeticExpression binOpExpr = null;

        while (rightExprIndex <= tree.getChildCount() - 1) {
            binOpExpr = (binOpExpr != null) ? binOpExpr : parseArithmeticExpression(tree.getChild(0));
            ArithmeticExpression rightExpr = parseArithmeticExpression(tree.getChild(rightExprIndex));
            char binOp = tree.getChild(rightExprIndex - 1).getText().charAt(0);

            binOpExpr = combineArithmeticExpressions(binOpExpr, rightExpr, binOp);
            rightExprIndex += 2;
        }

        return binOpExpr;

    }

    /**
     * Combines two arithmetic operations into one which is a binary operation.
     */
    private ArithmeticExpression combineArithmeticExpressions(ArithmeticExpression leftExpr,
            ArithmeticExpression rightExpr, char binOp) {
        if (leftExpr.isImmediateValue() && leftExpr.getImmediateValue() == 0 && binOp == '+') {
            // 0 + x = x 
            return rightExpr;
        }
        if (leftExpr.isImmediateValue() && leftExpr.getImmediateValue() == 0 && binOp == '-') {
            // 0 - x = -x
            return new ArithmeticExpression(rightExpr.getImmediateValue(), "-" + rightExpr.getUnaryOperators());
        }
        if (rightExpr.isImmediateValue() && rightExpr.getImmediateValue() == 0 && (binOp == '+' || binOp == '-')) {
            // x + 0 = x && x - 0 = x
            return leftExpr;
        }
        if (leftExpr.isImmediateValue() && leftExpr.getImmediateValue() == 1 && binOp == '*') {
            // 1 * x = x
            return rightExpr;
        }
        if (rightExpr.isImmediateValue() && rightExpr.getImmediateValue() == 1 && (binOp == '*' || binOp == '/')) {
            // x * 1 = x && x / 1 == x
            return leftExpr;
        }
        if (leftExpr.isImmediateValue() && leftExpr.getImmediateValue() == 0 && binOp == '*') {
            // 0 * x = 0
            return new ArithmeticExpression(0, "");
        }
        if (rightExpr.isImmediateValue() && rightExpr.getImmediateValue() == 0 && binOp == '*') {
            // x * 0 = 0
            return new ArithmeticExpression(0, "");
        }
        if (rightExpr.isImmediateValue() && rightExpr.getImmediateValue() == 0 && binOp == '/') {
            // x / 0 = error
            System.err.println("Build failed: division by zero not allowed");
            System.exit(1);
            return null;
        }
        if (leftExpr.isImmediateValue() && leftExpr.getImmediateValue() == 0 && binOp == '/') {
            // 0 / x = 0
            return new ArithmeticExpression(0, "");
        }
        // If there is no simplification just combine expression into a binary operation
        return new ArithmeticExpression(leftExpr, rightExpr, binOp, "");
    }
    
    private BooleanExpression parseBooleanExpression(Tree tree) {
        String ruleName = tree.getText();
        
        if ("comparison".equals(ruleName)) {
            if ('(' == tree.getChild(0).getText().charAt(0)) {
                // Nested boolean expression
                return parseBooleanExpression(tree.getChild(1));
            }

            ArithmeticExpression leftAritExpr = parseArithmeticExpression(tree.getChild(0));
            ArithmeticExpression rightAritExpr = parseArithmeticExpression(tree.getChild(2));
            return new BooleanExpression(leftAritExpr, rightAritExpr, tree.getChild(1).getText());
        }
        
        int rightExprIndex = 2;
        BooleanExpression boolExpr = null;

        while (rightExprIndex <= tree.getChildCount() - 1) {
            boolExpr = (boolExpr != null) ? boolExpr : parseBooleanExpression(tree.getChild(0));
            BooleanExpression rightExpr = parseBooleanExpression(tree.getChild(rightExprIndex));
            String op = tree.getChild(rightExprIndex - 1).getText();

            boolExpr = new BooleanExpression(boolExpr, rightExpr, op);
            rightExprIndex += 2;
        }
        return boolExpr;
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
