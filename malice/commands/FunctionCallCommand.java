package malice.commands;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FunctionCallCommand implements Command {

    private String functionName;
    private List<String> parameters;

    public FunctionCallCommand(String functionName, List<String> parameters){
        this.functionName = functionName;
        this.parameters = parameters;
        
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<String> getParameters() {
        return parameters;
    }

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        //TODO
    }

    @Override
    public Set<String> getUsedVariables() {
        Set<String> usedVariables = new HashSet<String>();
        usedVariables.addAll(parameters);
        return usedVariables;
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        return parameters.contains(aVariableName);
    }


}
