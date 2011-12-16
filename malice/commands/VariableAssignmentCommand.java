package malice.commands;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import malice.expressions.ArithmeticExpression;
import malice.expressions.Expression;

public class VariableAssignmentCommand implements Command {

    private String variableName;
    private ArithmeticExpression pieceIndex;
    private Expression expression;
    private boolean isArrayPiece;

    public VariableAssignmentCommand(String variableName, Expression expression) {
        this.variableName = variableName;
        this.expression = expression;
        isArrayPiece = false;
    }
    
    public VariableAssignmentCommand(String variableName, ArithmeticExpression pieceIndex, Expression expression) {
        this.variableName = variableName;
        this.pieceIndex = pieceIndex;
        this.expression = expression;
        isArrayPiece = true;
    }
    
    public String getVariableName() {
        return variableName;
    }

    public boolean isArrayPiece(){
        return isArrayPiece;
    }
    
    public ArithmeticExpression getPieceIndex() {
        return pieceIndex;
    }
    
    public Expression getExpression() {
        return expression;
    }

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        visitor.visitVariableAssignment(this);
    }
    
    @Override
    public Set<String> getUsedVariables() {
        Set<String> usedVariables = new HashSet<String>(Arrays.asList(variableName));
        usedVariables.addAll(expression.getUsedVariables());
        return usedVariables;
    }
    
    @Override
    public boolean usesVariable(String aVariableName) {
        return variableName.equals(aVariableName) || expression.usesVariable(aVariableName);
    }
    
    @Override
    public String toString() {
        return variableName + " became " + expression;
    }
}