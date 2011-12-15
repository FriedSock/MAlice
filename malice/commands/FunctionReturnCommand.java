/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package malice.commands;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import malice.expressions.Expression;

/**
 *
 * @author jack
 */
public class FunctionReturnCommand implements Command {

    private Expression expression;

    public FunctionReturnCommand(Expression expression){
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void acceptVisitor(CommandVisitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set<String> getUsedVariables() {
        Set<String> usedVariables = new HashSet<String>();
        usedVariables.addAll(expression.getUsedVariables());
        return usedVariables;
    }

    public boolean usesVariable(String aVariableName) {
        return expression.usesVariable(aVariableName);
    }
}
