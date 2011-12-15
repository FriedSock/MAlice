package malice.expressions;

import java.util.HashSet;
import java.util.Set;

public class BooleanExpression implements Expression {

    public enum Type {
        
        COMPARISON,
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
    
    public BooleanExpression(BooleanExpression leftExpr,
            BooleanExpression rightExpr, String op) {
        this.type = Type.BINOP;
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
        this.op = op;
    }
    
    @Override
    public Set<String> getUsedVariables() {
        Set<String> usedVariables = new HashSet<String>();
        
        if (Type.COMPARISON == type) {
            usedVariables.addAll(leftAritExpr.getUsedVariables());
            usedVariables.addAll(rightAritExpr.getUsedVariables());
        } else {
            usedVariables.addAll(leftExpr.getUsedVariables());
            usedVariables.addAll(rightExpr.getUsedVariables());
        }
        
        return usedVariables;
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        if (Type.COMPARISON == type) {
            return leftAritExpr.usesVariable(aVariableName) || rightAritExpr.usesVariable(aVariableName);
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
        } else {
            return "(" + leftExpr + " " + op + " " + rightExpr + ")";
        }
    }
}

/*
 * boolean_expression:	comparison (('==' | '!=' | '&&' | '||') comparison)*;

comparison:		expression ('<' | '<=' | '==' | '>=' | '>' | '!=') expression | '(' boolean_expression ')';
 * 
 */
