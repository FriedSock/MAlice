package malice.expressions;

import java.util.Set;

public class BooleanExpression implements Expression {

    @Override
    public Set<String> getUsedVariables() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isArithmeticExpression() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String toString() {
        //TODO - bool to string
        return "";
    }
}

/*
 * boolean_expression:	comparison (('==' | '!=' | '&&' | '||') comparison)*;

comparison:		expression ('<' | '<=' | '==' | '>=' | '>' | '!=') expression | '(' boolean_expression ')';
 * 
 */
