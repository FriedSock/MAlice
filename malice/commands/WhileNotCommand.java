package malice.commands;

import java.util.Set;

public class WhileNotCommand implements Command{
    private ConditionalBranch branch;

    public WhileNotCommand(ConditionalBranch branch){
        this.branch = branch;
    }

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<String> getUsedVariables() {
        return branch.getUsedVariables();
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        return branch.usesVariable(aVariableName);
    }


}
