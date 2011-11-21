package malice.commands;

import java.util.Set;
import malice.expressions.ArithmeticExpression;

public class SpeakCommand implements Command {

    private ArithmeticExpression expression;

    public SpeakCommand(ArithmeticExpression expression) {
        this.expression = expression;
    }

    public ArithmeticExpression getExpression() {
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