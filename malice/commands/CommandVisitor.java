package malice.commands;

public interface CommandVisitor {
    
    void visitArrayDeclaration(ArrayDeclarationCommand command);
    void visitConditional(ConditionalCommand command);
    void visitDecrement(DecrementCommand command);
    void visitFunctionCall(FunctionCallCommand command);
    void visitFunctionReturn(FunctionReturnCommand command);
    void visitIncrement(IncrementCommand command);
    void visitInput(InputCommand command);
    void visitSpeak(SpeakCommand command);
    void visitThrough(ThroughCommand command);
    void visitVariableAssignment(VariableAssignmentCommand command);
    void visitVariableDeclaration(VariableDeclarationCommand command);
    void visitWhileNot(WhileNotCommand command);
}