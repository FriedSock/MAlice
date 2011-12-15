package malice.expressions;

import java.util.HashSet;
import java.util.Set;
import malice.commands.FunctionCallCommand;

public class ArithmeticExpression implements Expression {

    public static enum Type {

        IMMEDIATE,
        BINOP,
        VARIABLE,
        ARRAY_PIECE,
        FUNCTION_CALL
    }
    private Type type;
    // arithmetic expression properties
    private int immediateValue;
    private char binOp;
    private ArithmeticExpression leftExpr, rightExpr;
    private String variableName;
    private String arrayName;
    private ArithmeticExpression pieceIndex;
    private FunctionCallCommand functionCall;
    private String unaryOperators;

    private ArithmeticExpression(Type type, String unaryOperators) {
        this.type = type;
        this.unaryOperators = unaryOperators;

        reduceUnaryOperators();
    }

    /**
     * Constructor for an immediate value.
     * @param immediateValue
     * @param unaryOperators 
     */
    public ArithmeticExpression(int immediateValue, String unaryOperators) {
        this(Type.IMMEDIATE, unaryOperators);
        this.immediateValue = immediateValue;
    }

    /**
     * Constructor for a binary operation.
     * @param leftExpr
     * @param rightExpr
     * @param binOp 
     */
    public ArithmeticExpression(ArithmeticExpression leftExpr, ArithmeticExpression rightExpr,
            char binOp, String unaryOperators) {
        this(Type.BINOP, unaryOperators);
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
        this.binOp = binOp;

        reduce(this);
    }

    /**
     * Constructor for a variable.
     * @param variableName
     * @param unaryOperators 
     */
    public ArithmeticExpression(String variableName, String unaryOperators) {
        this(Type.VARIABLE, unaryOperators);
        this.variableName = variableName;
    }

    /**
     * Constructor for an array piece.
     * @param variableName
     * @param unaryOperators 
     */
    public ArithmeticExpression(String arrayName, ArithmeticExpression pieceIndex, String unaryOperators) {
        this(Type.ARRAY_PIECE, unaryOperators);
        this.arrayName = arrayName;
        this.pieceIndex = pieceIndex;
    }

    /**
     * Constructor for a function call.
     * @param variableName
     * @param unaryOperators 
     */
    public ArithmeticExpression(FunctionCallCommand functionCall, String unaryOperators) {
        this(Type.FUNCTION_CALL, unaryOperators);
        this.functionCall = functionCall;
    }

    //TODO - further reductions?
    private void reduceUnaryOperators() {
        int oldLength;
        do {
            oldLength = unaryOperators.length();
            unaryOperators = unaryOperators.replaceAll("~~", "");
            unaryOperators = unaryOperators.replaceAll("--", "");
        } while (oldLength != unaryOperators.length());
    }

    /**
     * Reduces given arithmetic expression.
     */
    private void reduce(ArithmeticExpression expr) {
        if (Type.ARRAY_PIECE == expr.type) {
            reduce(pieceIndex);
            return;
        } else if (Type.BINOP != type) {
            return;
        }

        reduce(expr.leftExpr);
        reduce(expr.rightExpr);

        if (!expr.leftExpr.isImmediateValue() || !expr.rightExpr.isImmediateValue()
                || !expr.leftExpr.unaryOperators.isEmpty() || !expr.rightExpr.unaryOperators.isEmpty()) {
            return;
        }

        //TODO - more reductions?
        switch (expr.binOp) {
            case '+':
                expr.immediateValue = expr.leftExpr.immediateValue + expr.rightExpr.immediateValue;
                break;
            case '*':
                expr.immediateValue = expr.leftExpr.immediateValue * expr.rightExpr.immediateValue;
                break;
            case '/':
                if (expr.rightExpr.immediateValue == 0) {
                    // division by zero gives an undefined value
                    System.err.println("Build failed: division by zero not allowed");
                    System.exit(1);
                }
                expr.immediateValue = expr.leftExpr.immediateValue / expr.rightExpr.immediateValue;
                break;
            case '%':
                expr.immediateValue = expr.leftExpr.immediateValue % expr.rightExpr.immediateValue;
                break;
            default:
                return;
        }

        expr.type = Type.IMMEDIATE;
        expr.leftExpr = null;
        expr.rightExpr = null;
    }

    // TODO - WTF?
    public boolean isValue() {
        return false;
    }

    public boolean isImmediateValue() {
        return Type.IMMEDIATE == type;
    }

    public Type getType() {
        return type;
    }

    public int getImmediateValue() {
        return immediateValue;
    }

    public char getBinOp() {
        return binOp;
    }

    public ArithmeticExpression getLeftExpr() {
        return leftExpr;
    }

    public ArithmeticExpression getRightExpr() {
        return rightExpr;
    }

    public String getVariableName() {
        return variableName;
    }

    public String getArrayName() {
        return arrayName;
    }

    public ArithmeticExpression getPieceIndex() {
        return pieceIndex;
    }

    public FunctionCallCommand getFunctionCall() {
        return functionCall;
    }

    public String getUnaryOperators() {
        return unaryOperators;
    }

    @Override
    public Set<String> getUsedVariables() {
        Set<String> usedVariables = new HashSet<String>();

        if (Type.ARRAY_PIECE == type) {
            usedVariables.add(arrayName);
            usedVariables.addAll(pieceIndex.getUsedVariables());
        } else if (Type.FUNCTION_CALL == type) {
            usedVariables.addAll(functionCall.getUsedVariables());
        } else if (Type.VARIABLE == type) {
            usedVariables.add(variableName);
        } else if (Type.BINOP == type) {
            usedVariables.addAll(leftExpr.getUsedVariables());
            usedVariables.addAll(rightExpr.getUsedVariables());
        }

        return usedVariables;
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        if (Type.ARRAY_PIECE == type) {
            return arrayName.equals(aVariableName);
        }
        if (Type.FUNCTION_CALL == type) {
            return functionCall.getUsedVariables().contains(aVariableName);
        }
        if (Type.VARIABLE == type) {
            return variableName.equals(aVariableName);
        }
        if (Type.BINOP == type) {
            return leftExpr.getUsedVariables().contains(aVariableName)
                    || rightExpr.getUsedVariables().contains(aVariableName);
        }

        return false;
    }

    @Override
    public boolean isArithmeticExpression() {
        return true;
    }

    @Override
    public String toString() {
        switch (type) {
            case ARRAY_PIECE:
                return arrayName + "'s " + pieceIndex + " piece";
            case BINOP:
                return "(" + leftExpr + binOp + rightExpr + ")";
            case FUNCTION_CALL:
                return functionCall.toString(); // TODO - fix
            case IMMEDIATE:
                return Integer.toString(immediateValue);
            case VARIABLE:
                return variableName;
        }
        
        return "";
    }
}