package malice.commands;

import java.util.HashSet;
import java.util.Set;
import malice.expressions.Expression;

public class FunctionReturnCommand implements Command {

    public enum Type {
        
        CHAR,
        EXPRESSION
    }
    
    private Type type;
    private char character;
    private Expression expression;
    private String functionName;

    public FunctionReturnCommand(char character) {
        this.type = Type.CHAR;
        this.character = character;
    }
    
    public FunctionReturnCommand(Expression expression) {
        this.type = Type.EXPRESSION;
        this.expression = expression;
    }

    public String getFunctionName(){
        return functionName;
    }

    public void setFunctionName(String functionName){
        this.functionName = functionName;
    }

    public Type getType() {
        return type;
    }

    public char getCharacter() {
        return character;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void acceptVisitor(CommandVisitor visitor) {
        visitor.visitFunctionReturn(this);
    }

    @Override
    public Set<String> getUsedVariables() {
        if (Type.CHAR == type) {
            return new HashSet<String>();
        }
        
        Set<String> usedVariables = new HashSet<String>();
        usedVariables.addAll(expression.getUsedVariables());
        return usedVariables;
    }

    @Override
    public boolean usesVariable(String aVariableName) {
        if (Type.CHAR == type) {
            return false;
        }

        return expression.usesVariable(aVariableName);
    }

    @Override
    public String toString() {
        return "Alice found " + ((Type.CHAR == type) ? "'" + character + "'" : expression);
    }
}