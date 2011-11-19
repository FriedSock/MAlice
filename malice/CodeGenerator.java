package malice;

import java.util.ArrayList;
import java.util.List;
import malice.commands.Command;
import malice.commands.VariableAssignmentCommand;
import malice.commands.VariableDeclarationCommand;

public class CodeGenerator {
    
    private List<Command> commands;
    private SymbolTable symbolTable;
    private List<String> assemblyCommands;
    
    public CodeGenerator(List<Command> commands, SymbolTable symbolTable) {
        this.commands = commands;
        this.symbolTable = symbolTable;
        
        assemblyCommands = new ArrayList<String>();
    }
    
    public List<String> generateCode() {
        for (Command command : commands) {
            //command.acceptVisitor();
        }
        
        return assemblyCommands;
    }
    
    public void visitVariableAssignment(VariableAssignmentCommand command) {
        assemblyCommands.add("mov " + symbolTable.getVariableRegister(command.getVariableName()) + ", 0");
    }
    
    public void visitVariableDeclaration(VariableDeclarationCommand command) {
        
    }
}
