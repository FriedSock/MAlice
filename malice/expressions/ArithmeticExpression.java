package malice.expressions;

public class ArithmeticExpression implements Expression {

    private ArithmeticExpression left;
    private ArithmeticExpression right;
    private char binOp;
    private int value;
    private String variable;
    private boolean valueHasBeenSet;

    public ArithmeticExpression(String variable, boolean tilda) {
        this.variable = variable;
        tilda(tilda);
    }

    public ArithmeticExpression(int v, boolean tilda) {
        value = v;
        valueHasBeenSet = true;
        tilda(tilda);
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
    public String toString() {
        if (right == null) {
            if (left == null) {
                return (valueHasBeenSet) ? String.valueOf(value) : variable;
            }
            return binOp + left.toString();
        }
        return "(" + left.toString() + binOp + right.toString() + ")";
    }

    private void tilda(boolean t){
        if(t){
            binOp = '~';
        }
    }
}