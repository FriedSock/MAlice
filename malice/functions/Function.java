package malice.functions;

import java.util.List;
import malice.commands.Command;
import malice.symbols.Type;

public class Function {

    protected String name;
    protected Type type;
    protected List<Command> commands;

    public Function(String name, List<Command> commands, Type type) {
        this.name = name;
        this.commands = commands;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public Type getType() {
        return type;
    }

}