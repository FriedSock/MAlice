package malice.expressions;

import java.util.HashSet;
import java.util.Set;

public class ArithmeticExpression implements Expression {

    private ArithmeticExpression left;
    private ArithmeticExpression right;
    private char binOp;
    private int value;
    private String variableName;
    private boolean isImmediateValue;
    private boolean tilde;
    private boolean isValue;

    public ArithmeticExpression(String variableName, boolean tilde) {
        this.variableName = variableName;
        this.tilde = tilde;
        isImmediateValue = false;
        isValue = true;
    }

    public ArithmeticExpression(int value, boolean tilde) {
        this.value = value;
        this.tilde = tilde;
        isImmediateValue = true;
        isValue = true;
    }

    public ArithmeticExpression(ArithmeticExpression left, ArithmeticExpression right, char op) {
        this.left = left;
        this.right = right;
        binOp = op;
    }
    
    //TODO Optimisation - Collapse arithmetic parse tree
    public void reduce() {   
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
        return !isImmediateValue && variableName.equals(aVariableName);
    }
    
    @Override
    public boolean isArithmeticExpression() {
        return true;
    }

    public boolean isValue() {
        return isValue;
    }

    public boolean isImmediateValue() {
        return isImmediateValue;
    }

    public ArithmeticExpression left() {
        return left;
    }

    public ArithmeticExpression right() {
        return right;
    }

    public char binOp() {
        return binOp;
    }

    public boolean tilde() {
        return tilde;
    }

    @Override
    public String toString() {
        if (right == null) {
            if (left == null) {
                String out = (isImmediateValue) ? String.valueOf(value) : variableName;
                return (tilde) ? "~" + out : out;
            }
            return binOp + left.toString();
        }
        return "(" + left.toString() + binOp + right.toString() + ")";
    }
}