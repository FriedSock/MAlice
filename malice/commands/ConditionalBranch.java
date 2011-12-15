package malice.commands;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import malice.expressions.BooleanExpression;

public class ConditionalBranch {
    
    private BooleanExpression condition;
    private List<Command> commands;
    
    public ConditionalBranch(BooleanExpression condition, List<Command> commands) {
        this.condition = condition;
        this.commands = commands;
    }
    
    public BooleanExpression getCondition() {
        return condition; 
    }
    
    public List<Command> getCommands() {
        return commands;
    }

    public Set<String> getUsedVariables() {
        Set<String> usedVariables = new HashSet<String>();
        for(Command c : commands) {
            usedVariables.addAll(c.getUsedVariables());
        }
        //TODO - condition
        return usedVariables;
    }

    public boolean usesVariable(String aVariableName) {
        for(Command c : commands) {
            if(c.usesVariable(aVariableName)) {
                return true;
            }
        }
        //TODO - condition
        return false;
    }



}
