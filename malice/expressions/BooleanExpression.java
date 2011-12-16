package malice.expressions;

import java.util.HashSet;
import java.util.Set;

public class BooleanExpression implements Expression {

    public enum Type {
        
        COMPARISON,
        FUNCTION,
        BINOP
    }
    
    private Type type;
    private ArithmeticExpression leftAritExpr, rightAritExpr;
    private String op;
    private BooleanExpression leftExpr, rightExpr;
    
    public BooleanExpression(ArithmeticExpression leftAritExpr,
            ArithmeticExpression rightAritExpr, String op) {
        this.type = Type.COMPARISON;
        this.leftAritExpr = leftAritExpr;
        this.rightAritExpr = rightAritExpr;
        this.op = op;
    }
    
    public BooleanExpression(ArithmeticExpression leftAritExpr) {
        this.type = Type.FUNCTION;
        this.leftAritExpr = leftAritExpr;
    }
    
    public BooleanExpression(BooleanExpression leftExpr,
            BooleanExpression rightExpr, String op) {
        this.type = Type.BINOP;
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
        this.op = op;
    }

    public Type getType() {
        return type;
    }

    public ArithmeticExpression getLeftAritExpr() {
        return leftAritExpr;
    }

    public BooleanExpression getLeftExpr() {
        return leftExpr;
    }

    public String getOp() {
        return op;
    }

    public ArithmeticExpression getRightAritExpr() {
        return rightAritExpr;
    }

    public BooleanExpression getRightExpr() {
        return rightExpr;
    }


    @Override
    public Set<String> getUsedVariables() {
        Set<String> usedVariables = new HashSet<String>();
        
        if (Type.COMPARISON == type) {
            usedVariables.addAll(leftAritExpr.getUsedVariables());
            usedVariables.addAll(rightAritExpr.getUsedVariables());
        } else if (Type.FUNCTION == type) {
            usedVariables.addAll(leftAritExpr.getUsedVariables());
        }  else {
            usedVariables.addAll(leftExpr.getUsedVariables());
            usedVariables.addAll(rightExpr.getUsedVariables());
        }
        
        return usedVariables;
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        if (Type.COMPARISON == type) {
            return leftAritExpr.usesVariable(aVariableName) || rightAritExpr.usesVariable(aVariableName);
        } else if (Type.FUNCTION == type) {
            return leftAritExpr.usesVariable(aVariableName);
        } else {
            return leftExpr.usesVariable(aVariableName) || rightExpr.usesVariable(aVariableName);
        }
    }

    @Override
    public boolean isArithmeticExpression() {
        return false;
    }
    
    @Override
    public String toString() {
        if (Type.COMPARISON == type) {
            return leftAritExpr + " " + op + " " + rightAritExpr;
        } else if (Type.FUNCTION == type) {
            return leftAritExpr + "";
        } else {
            return "(" + leftExpr + " " + op + " " + rightExpr + ")";
        }
    }
}