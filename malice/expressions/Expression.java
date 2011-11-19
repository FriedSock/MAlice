package malice.expressions;

import java.util.Set;

public interface Expression {
    
    Set<String> getUsedVariables();
    
    boolean usesVariable(String aVariableName);
}