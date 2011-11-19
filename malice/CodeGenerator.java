package malice;

import malice.symbols.SymbolTable;
import malice.symbols.Register;
import java.util.ArrayList;
import java.util.Arrays;
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
    private List<Register> freeRegisters;
    
    public CodeGenerator(List<Command> commands, SymbolTable symbolTable) {
        this.commands = commands;
        this.symbolTable = symbolTable;
        
        assemblyCommands = new ArrayList<String>();
        freeRegisters = new ArrayList<Register>();
        freeRegisters.addAll(Arrays.asList(Register.values()));
    }
    
    public List<String> generateCode() {
        for (Command command : commands) {
            command.acceptVisitor(this);
        }
        return assemblyCommands;
    }
    
    @Override
    public void visitDecrement(DecrementCommand command) {
        Register reg = symbolTable.getVariableRegister(command.getVariableName());
        assemblyCommands.add("sub " + reg + ", 1");
    }

    @Override
    public void visitIncrement(IncrementCommand command) {
        Register reg = symbolTable.getVariableRegister(command.getVariableName());
        assemblyCommands.add("add " + reg + ", 1");
    }

    @Override
    public void visitSpeak(SpeakCommand command) {
        //TODO - speak
    }
    
    @Override
    public void visitVariableAssignment(VariableAssignmentCommand command) {
        //TODO - variable assignment
        Register reg = symbolTable.getVariableRegister(command.getVariableName());
        assemblyCommands.add("mov " + reg + ", 0");
    }
    
    @Override
    public void visitVariableDeclaration(VariableDeclarationCommand command) {
        //TODO - variable declaration
        Register reg = symbolTable.getVariableRegister(command.getVariableName());
        assemblyCommands.add("mov " + reg + ", 0");
    }
}