package malice;

public class ArithmeticExpression implements Expression {

    private ArithmeticExpression left;
    private ArithmeticExpression right;
    private char binOp;
    private int value;
    private String variable;
    private boolean valueHasBeenSet;

    public ArithmeticExpression(int v){
        value = v;
        valueHasBeenSet = true;
    }

    public ArithmeticExpression(String variable){
        this.variable = variable;
    }

    //Don't need to pass in operator as the only unary operator is ~
    public ArithmeticExpression(ArithmeticExpression n){
        left = n;
    }

    public ArithmeticExpression(ArithmeticExpression left, ArithmeticExpression right, char op){
        this.left = left;
        this.right = right;
        binOp = op;
    }
    
    //TODO Optimisation - Collapse arithmetic parse tree
    public void reduce() {   
    }
    
}
