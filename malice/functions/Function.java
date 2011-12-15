package malice.functions;

import java.util.List;
import malice.commands.Command;
import malice.symbols.Type;

public class Function {

    private String name;
    private Type returnType;
    private List<Command> commands;


   public Function(String name, List<Command> commands, Type returnType) {
        this.name = name;
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public Type getReturnType() {
        return returnType;
    }
}
