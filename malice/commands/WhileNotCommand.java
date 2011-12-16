package malice.commands;

import java.util.Set;

public class WhileNotCommand implements Command {
    
    private ConditionalBranch branch;

    public WhileNotCommand(ConditionalBranch branch){
        this.branch = branch;
    }

    public ConditionalBranch getBranch() {
        return branch;
    }
    
    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        visitor.visitWhileNot(this);
    }

    @Override
    public Set<String> getUsedVariables() {
        return branch.getUsedVariables();
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        return branch.usesVariable(aVariableName);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Command command : branch.getCommands()) {
            builder.append(command);
            builder.append('\n');
        }
        return "eventually " + branch.getCondition() + " because\n" + builder + "enough times";
    }
}