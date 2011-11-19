package malice;

import java.util.ArrayList;
import java.util.List;
import malice.commands.Command;
import malice.commands.CommandVisitor;
import malice.commands.DecrementCommand;
import malice.commands.IncrementCommand;
import malice.commands.SpeakCommand;
import malice.commands.VariableAssignmentCommand;
import malice.commands.VariableDeclarationCommand;

public class CodeGenerator implements CommandVisitor {
    
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
    
    @Override
    public void visitDecrement(DecrementCommand command) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void visitIncrement(IncrementCommand command) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void visitSpeak(SpeakCommand command) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void visitVariableAssignment(VariableAssignmentCommand command) {
        assemblyCommands.add("mov " + symbolTable.getVariableRegister(command.getVariableName()) + ", 0");
    }
    
    @Override
    public void visitVariableDeclaration(VariableDeclarationCommand command) {
        
    }
}