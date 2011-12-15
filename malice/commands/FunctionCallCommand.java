package malice.commands;

import java.util.Arrays;
import java.util.Set;

public class FunctionCallCommand implements Command {

    private String functionName;
    private Set<String> parameters;

    public FunctionCallCommand(String args[]){
        functionName = args[0];

        //Put all the parameters in the list, remove the function name
        parameters.addAll(Arrays.asList(args));
        parameters.remove(functionName);
        
    }
    public void acceptVisitor(CommandVisitor visitor) {
        //TODO
    }

    public Set<String> getUsedVariables() {
        return parameters;
    }

    public boolean usesVariable(String aVariableName) {
        return parameters.contains(aVariableName);
    }


}
