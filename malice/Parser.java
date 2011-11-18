package malice;

import malice.commands.VariableDeclarationCommand;
import malice.commands.VariableAssignmentCommand;
import malice.commands.Command;
import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.tree.Tree;

public class Parser {
    
    private List<Command> commands;

    public Parser() {
        commands = new ArrayList<Command>();
    }
    
    public void parseProg(Tree tree) {
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);
            commands.add(parseStatement(child));
        }
    }
    
    public Command parseStatement(Tree tree) {
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);
            String childToken = child.getText();
            if ("variable_declaration".equals(childToken)) {
                return parseVariableDeclaration(child);
            } else if ("variable_assignment".equals(childToken)) {
                return parseVariableAssignment(child);
            } else {
                return parseProcedure(child);
            }
        }
        
        return null;
    }
    
    public Command parseVariableDeclaration(Tree tree) {
        String variableName = tree.getChild(0).getText();
        Type variableType = Type.valueOf(tree.getChild(2).getText());
        
        return new VariableDeclarationCommand(variableName, variableType);
    }
    
    public Command parseVariableAssignment(Tree tree) {
        String variableName = tree.getChild(0).getText();
        //TODO - expression
        Expression expression = new Expression();
        
        return new VariableAssignmentCommand(variableName, expression);
    }
    
    public Command parseProcedure(Tree tree) {
        //TODO
        return null;
    }
}
