package malice.commands;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import malice.expressions.Expression;

public class VariableAssignmentCommand implements Command {

    private String variableName;
    private Expression expression;

    public VariableAssignmentCommand(String variableName, Expression expression) {
        this.variableName = variableName;
        this.expression = expression;
    }
    
    public String getVariableName() {
        return variableName;
    }
    
    public Expression getExpression() {
        return expression;
    }

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        visitor.visitVariableAssignment(this);
    }
    
    @Override
    public boolean updatesVariable(String aVariableName) {
        return variableName.equals(aVariableName);
    }
    
    @Override
    public Set<String> getUsedVariables() {
        Set<String> usedVariables = new HashSet<String>(Arrays.asList(variableName));
        usedVariables.addAll(expression.getUsedVariables());
        return usedVariables;
    }
    
    @Override
    public boolean usesVariable(String aVariableName) {
        return variableName.equals(aVariableName) || expression.usesVariable(aVariableName);
    }
    
    @Override
    public String toString() {
        return variableName + " became " + expression;
    }
}