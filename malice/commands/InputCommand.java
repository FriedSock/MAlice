package malice.commands;

import java.util.Set;
import malice.expressions.ArithmeticExpression;

public class InputCommand implements Command{

    /**
     * Either a variable or array piece.
     */
    private ArithmeticExpression inputDestination;

    public InputCommand(ArithmeticExpression inputDestination){
        this.inputDestination = inputDestination;
    }

    public ArithmeticExpression getInputDestination() {
        return inputDestination;
    }

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        visitor.visitInput(this);
    }

    @Override
    public Set<String> getUsedVariables() {
        //TODO - fix
        return inputDestination.getUsedVariables();
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        return inputDestination.usesVariable(aVariableName);
    }

    @Override
    public String toString() {
        return "what was " + inputDestination + "?";
    }
}
