package malice.expressions;

public class ArithmeticExpression implements Expression {

    private ArithmeticExpression left;
    private ArithmeticExpression right;
    private char binOp;
    private int value;
    private String variable;
    private boolean valueHasBeenSet;
    private boolean tilda;

    public ArithmeticExpression(String variable, boolean tilda) {
        this.variable = variable;
        this.tilda = tilda;
    }

    public ArithmeticExpression(int v, boolean tilda) {
        value = v;
        valueHasBeenSet = true;
        this.tilda = tilda;
    }

    public ArithmeticExpression(ArithmeticExpression left, ArithmeticExpression right, char op){
        this.left = left;
        this.right = right;
        binOp = op;
    }
    
    //TODO Optimisation - Collapse arithmetic parse tree
    public void reduce() {   
    }
    
    @Override
    public boolean usesVariable(String aVariableName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    @Override
    public String toString() {
        if (right == null) {
            if (left == null) {
                String out = (valueHasBeenSet) ? String.valueOf(value) : variable;
                return (tilda) ? "~" + out : out;
            }
            return binOp + left.toString();
        }
        return "(" + left.toString() + binOp + right.toString() + ")";
    }
}