package malice.commands;

public interface CommandVisitor {
    
    void visitDecrement(DecrementCommand command);
    void visitIncrement(IncrementCommand command);
    void visitSpeak(SpeakCommand command);
    void visitVariableAssignment(VariableAssignmentCommand command);
    void visitVariableDeclaration(VariableDeclarationCommand command);
}