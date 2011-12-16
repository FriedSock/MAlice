package malice.commands;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import malice.expressions.ArithmeticExpression;
import malice.expressions.Expression;

public class VariableAssignmentCommand implements Command {

    private ArithmeticExpression destination;
    private Expression source;

    public VariableAssignmentCommand(ArithmeticExpression destination, Expression source) {
        this.destination = destination;
        this.source = source;
    }
    
    /*public String getVariableName() {
        return variableName;
    }*/

    public ArithmeticExpression getDestination() {
        return destination;
    }

    public Expression getSource() {
        return source;
    }
    
    public boolean isArrayPiece(){
        if (!(source instanceof ArithmeticExpression)) {
            return false;
        }
        ArithmeticExpression sourceArithmeticExpression = (ArithmeticExpression) source;
        return ArithmeticExpression.Type.ARRAY_PIECE == sourceArithmeticExpression.getType();
    }
    
    /*public ArithmeticExpression getPieceIndex() {
        return pieceIndex;
    }
    
    public Expression getExpression() {
        return expression;
    }*/

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        visitor.visitVariableAssignment(this);
    }
    
    @Override
    public Set<String> getUsedVariables() {
        Set<String> usedVariables = new HashSet<String>();
        usedVariables.addAll(source.getUsedVariables());
        return usedVariables;
    }
    
    @Override
    public boolean usesVariable(String aVariableName) {
        return source.usesVariable(aVariableName);
    }
    
    @Override
    public String toString() {
        return destination + " became " + source;
    }
}