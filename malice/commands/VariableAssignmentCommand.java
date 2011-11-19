package malice.commands;

import malice.Expression;

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
    public String toString() {
        return variableName + " became " + expression;
    }
}