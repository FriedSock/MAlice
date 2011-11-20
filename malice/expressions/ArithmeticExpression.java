package malice.expressions;

import java.util.HashSet;
import java.util.Set;

public class ArithmeticExpression implements Expression {

    private ArithmeticExpression left;
    private ArithmeticExpression right;
    private char binOp;
    private int value;
    private String variableName;
    private boolean valueHasBeenSet;
    private boolean tilda;
    private boolean isValue;

    public ArithmeticExpression(String variableName, boolean tilda) {
        this.variableName = variableName;
        this.tilda = tilda;
        isValue = true;
    }

    public ArithmeticExpression(int value, boolean tilda) {
        this.value = value;
        valueHasBeenSet = true;
        this.tilda = tilda;
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
        if (!valueHasBeenSet) {
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
        return !valueHasBeenSet && variableName.equals(aVariableName);
    }
    
    
    @Override
    public String toString() {
        if (right == null) {
            if (left == null) {
                String out = (valueHasBeenSet) ? String.valueOf(value) : variableName;
                return (tilda) ? "~" + out : out;
            }
            return binOp + left.toString();
        }
        return "(" + left.toString() + binOp + right.toString() + ")";
    }

    public boolean isValue() {
        return isValue;
    }

    public boolean valueHasBeenSet() {
        return valueHasBeenSet;
    }

    public ArithmeticExpression left() {
        return left;
    }

    public ArithmeticExpression right() {
        return right;
    }

    public char binOp(){
        return binOp;
    }
}