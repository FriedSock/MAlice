package malice.functions;

import java.util.List;
import malice.commands.Command;
import malice.commands.FunctionReturnCommand;
import malice.symbols.Type;

public class Function {

    protected String name;
    protected Type type;
    protected List<Command> commands;

    public Function(String name, List<Command> commands, Type type) {
        this.name = name;
        this.commands = commands;
        this.type = type;
        for(Command c : this.commands) {
            if(c instanceof FunctionReturnCommand) {
                ((FunctionReturnCommand) c).setFunctionName(name);
            }
        }
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