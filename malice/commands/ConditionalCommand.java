package malice.commands;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConditionalCommand implements Command{

    private List<ConditionalBranch> branches;

    public ConditionalCommand(List<ConditionalBranch> branches){
        this.branches = branches;
    }

    public List<ConditionalBranch> getBranches() {
        return branches;
    }

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<String> getUsedVariables() {
        Set<String> usedVariables = new HashSet<String>();
        for(ConditionalBranch branch : branches) {
            usedVariables.addAll(branch.getUsedVariables());
        }
        return usedVariables;
    }

    @Override
    public boolean usesVariable(String aVariableName) {
         for(ConditionalBranch branch : branches) {
            if(branch.usesVariable(aVariableName)) {
                return true;
            }
        }
        return false;
    }

}
