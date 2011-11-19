package malice;

import malice.symbols.SymbolTable;
import malice.symbols.Register;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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
    private Queue<Register> freeRegisters;
    
    public CodeGenerator(List<Command> commands, SymbolTable symbolTable) {
        this.commands = commands;
        this.symbolTable = symbolTable;
        
        assemblyCommands = new ArrayList<String>();
        freeRegisters = new LinkedList<Register>();
        freeRegisters.addAll(Arrays.asList(Register.values()));
        freeRegisters.remove(); // removes Register.NONE
        
        findLiveRanges();
    }
    
    private void findLiveRanges() {
        for (Command command : commands) {
            
        }
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
        Register reg = symbolTable.getVariableRegister(command.getVariableName());
        if (reg == Register.NONE) {
            reg = freeRegisters.remove();
            symbolTable.setVariableRegister(command.getVariableName(), reg);
        }
        
        //TODO - variable assignment
        assemblyCommands.add("mov " + reg + ", 0");
    }
    
    @Override
    public void visitVariableDeclaration(VariableDeclarationCommand command) {
        //TODO - variable declaration?
    }
}