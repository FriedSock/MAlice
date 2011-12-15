package malice.commands;

import java.util.Set;
import malice.expressions.Expression;

public class SpeakCommand implements Command {

    private Expression expression;

    public SpeakCommand(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
    
    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        visitor.visitSpeak(this);
    }
    
    @Override
    public Set<String> getUsedVariables() {
        return expression.getUsedVariables();
    }
    
    @Override
    public boolean usesVariable(String aVariableName) {
        return expression.usesVariable(aVariableName);
    }
    
    @Override
    public String toString() {
        return expression + " spoke";
    }

}