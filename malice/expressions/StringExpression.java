package malice.expressions;

import java.util.HashSet;
import java.util.Set;

public class StringExpression implements Expression {

    private String string;
    
    public StringExpression(String string) {
        this.string = string;
    }
    
    public String getString() {
        return string;
    }
    
    @Override
    public Set<String> getUsedVariables() {
        return new HashSet<String>();
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        return false;
    }

    @Override
    public boolean isArithmeticExpression() {
        return false;
    }
    
    @Override
    public String toString() {
        return '"' + string + '"';
    }
}