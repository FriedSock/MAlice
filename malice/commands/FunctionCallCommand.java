package malice.commands;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import malice.expressions.ArithmeticExpression;

public class FunctionCallCommand implements Command {

    private String functionName;
    private List<ArithmeticExpression> parameters;

    public FunctionCallCommand(String functionName, List<ArithmeticExpression> parameters){
        this.functionName = functionName;
        this.parameters = parameters;
        
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<ArithmeticExpression> getParameters() {
        return parameters;
    }

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        //TODO
    }

    @Override
    public Set<String> getUsedVariables() {
        Set<String> usedVariables = new HashSet<String>();
        for (ArithmeticExpression parameter : parameters) {
            usedVariables.addAll(parameter.getUsedVariables());
        }
        return usedVariables;
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        for (ArithmeticExpression parameter : parameters) {
            if (parameter.usesVariable(aVariableName)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        boolean first = true;
        for (ArithmeticExpression parameter : parameters) {
            if (!first) {
                builder.append(", ");
            }
            builder.append(parameter.toString());
            first = false;
        }
        return functionName + "(" + builder.toString() + ")";
    }
}
