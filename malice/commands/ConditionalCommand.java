package malice.commands;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConditionalCommand implements Command {

    private List<ConditionalBranch> branches;

    public ConditionalCommand(List<ConditionalBranch> branches) {
        this.branches = branches;
    }

    public List<ConditionalBranch> getBranches() {
        return branches;
    }

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        //TODO - acceptVisitor
    }

    @Override
    public Set<String> getUsedVariables() {
        Set<String> usedVariables = new HashSet<String>();
        for (ConditionalBranch branch : branches) {
            usedVariables.addAll(branch.getUsedVariables());
        }
        return usedVariables;
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        for (ConditionalBranch branch : branches) {
            if (branch.usesVariable(aVariableName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("perhaps (");
        builder.append(branches.get(0).getCondition());
        builder.append(") so \n");

        for (Command command : branches.get(0).getCommands()) {
            builder.append("  ");
            builder.append(command);
            builder.append("\n");
        }

        for (int i = 1; i < branches.size(); i++) {
            ConditionalBranch branch = branches.get(i);
            builder.append("or ");
            if (branch.getCondition() != null) {
                builder.append("maybe (");
                builder.append(branch.getCondition());
                builder.append(") so");
            }
            builder.append("\n");

            for (Command command : branch.getCommands()) {
                builder.append("  ");
                builder.append(command);
                builder.append("\n");
            }
        }
        return builder.toString();
    }
}
