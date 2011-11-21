package malice.expressions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArithmeticExpression implements Expression {

    private ArithmeticExpression left, right;
    private char binOp;
    private int value;
    private String variableName;
    private boolean isImmediateValue, isValue;
    private String unaryOperators;

    public ArithmeticExpression(String variableName, String unaryOperators) {
        this.variableName = variableName;
        this.unaryOperators = unaryOperators;
        isImmediateValue = false;
        isValue = true;
        
        reduceUnaryOperators();
    }

    public ArithmeticExpression(int value, String unaryOperators) {
        this.value = value;
        this.unaryOperators = unaryOperators;
        isImmediateValue = true;
        isValue = true;
        
        reduceUnaryOperators();
    }

    public ArithmeticExpression(ArithmeticExpression left, ArithmeticExpression right, char binOp) {
        this.left = left;
        this.right = right;
        this.binOp = binOp;
        this.unaryOperators = "";
        isImmediateValue = false;
        isValue = false;
        
        reduce(this);
    }

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
    private void reduce(ArithmeticExpression exp) {
        if (exp.left == null || exp.right == null) {
            return;
        }

        reduce(exp.left);
        reduce(exp.right);

        if (!exp.left.isImmediateValue() || !exp.right.isImmediateValue()) {
            return;
        }

        switch (exp.binOp) {
            case '+':
                exp.value = exp.left.value + exp.right.value;
                break;
            case '*':
                exp.value = exp.left.value * exp.right.value;
                break;
            case '/':
                if (exp.right.value == 0) {
                    // division by zero gives an undefined value
                    System.err.println("Build failed: division by zero not allowed");
                    System.exit(1);
                }
                exp.value = exp.left.value / exp.right.value;
                break;
            case '%':
                exp.value = exp.left.value % exp.right.value;
                break;
            case '&':
                exp.value = exp.left.value & exp.right.value;
                break;
            case '|':
                exp.value = exp.left.value | exp.right.value;
                break;
            case '^':
                exp.value = exp.left.value ^ exp.right.value;
                break;
        }
        
        exp.isImmediateValue = true;
        exp.isValue = true;
        exp.left = null;
        exp.right = null;
    }

    public boolean isValue() {
        return isValue;
    }

    public boolean isImmediateValue() {
        return isImmediateValue;
    }

    public ArithmeticExpression getLeft() {
        return left;
    }

    public ArithmeticExpression getRight() {
        return right;
    }

    public char getBinOp() {
        return binOp;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getVariableName() {
        return variableName;
    }

    public String getUnaryOperators() {
        return unaryOperators;
    }
    
    @Override
    public Set<String> getUsedVariables() {
        Set<String> usedVariables = new HashSet<String>();

        if (!isImmediateValue && isValue) {
            usedVariables.add(variableName);
        }
        if (left != null) {
            usedVariables.addAll(left.getUsedVariables());
        }
        if (right != null) {
            usedVariables.addAll(right.getUsedVariables());
        }

        return usedVariables;
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        if (isImmediateValue && isValue) {
            return false;
        }
    
        if (!isImmediateValue && isValue) {
            return variableName.equals(aVariableName);
        }
        return (left != null && left.usesVariable(aVariableName))
                || (right != null && right.usesVariable(aVariableName));
    }

    @Override
    public boolean isArithmeticExpression() {
        return true;
    }

    @Override
    public String toString() {
        if (right == null) {
            if (left == null) {
                String out = (isImmediateValue) ? String.valueOf(value) : variableName;
                return unaryOperators + out;
            }
            return binOp + left.toString();
        }
        return "(" + left.toString() + binOp + right.toString() + ")";
    }
}