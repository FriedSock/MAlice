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

    public ArithmeticExpression(String variableName, boolean tilda) {
        this.variableName = variableName;
        this.tilda = tilda;
    }

    public ArithmeticExpression(int value, boolean tilda) {
        this.value = value;
        valueHasBeenSet = true;
        this.tilda = tilda;
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
}