package malice.functions;

import java.util.List;
import malice.commands.Command;
import malice.symbols.Type;

public class RoomFunction extends Function {

    private List<Parameter> parameters;

    public RoomFunction(String name, List<Parameter> parameters, List<Command> commands, Type returnType) {
        super(name,commands,returnType);
        this.parameters = parameters;
    }


    public List<Parameter> getParameters() {
        return parameters;
    }

}
