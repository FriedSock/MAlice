package malice.commands;

import java.util.HashSet;
import java.util.Set;
import malice.expressions.Expression;

public class FunctionReturnCommand implements Command {

    private Expression expression;

    public FunctionReturnCommand(Expression expression){
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<String> getUsedVariables() {
        Set<String> usedVariables = new HashSet<String>();
        usedVariables.addAll(expression.getUsedVariables());
        return usedVariables;
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        return expression.usesVariable(aVariableName);
    }
}
