package malice.expressions;

import java.util.Set;

public interface Expression {
    
    /**
     * @return all variable identifiers used in the expression.
     */
    Set<String> getUsedVariables();
    
    /**
     * @return true, if given variable identifier is used in the expression.
     */
    boolean usesVariable(String aVariableName);
    
    boolean isArithmeticExpression();
}