package malice.commands;

import malice.Expression;
import malice.commands.Command;

public class VariableAssignmentCommand implements Command {

    private String variableName;
    private Expression expression;

    public VariableAssignmentCommand(String variableName, Expression expression) {
        this.variableName = variableName;
        this.expression = expression;
    }

}