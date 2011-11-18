/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package malice;

/**
 *
 * @author jack
 */
public class ArithmeticExpression implements Expression {
    private ArithmeticExpression left;
    private ArithmeticExpression right;
    private char binOp;
    private int value = 0;

    public ArithmeticExpression(int v){
        value = v;
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




}
