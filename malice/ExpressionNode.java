/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package malice;

/**
 *
 * @author jack
 */
public class ExpressionNode {
    private ExpressionNode left;
    private ExpressionNode right;
    private char binOp;
    private int value = 0;

    public ExpressionNode(int v){
        value = v;
    }

    //Don't need to pass in operator as the only unary operator is ~
    public ExpressionNode(ExpressionNode n){
        left = n;
    }
    public ExpressionNode(ExpressionNode left, ExpressionNode right, char op){
        this.left = left;
        this.right = right;
        binOp = op;
    }




}
