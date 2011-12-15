package malice.functions;

import java.util.List;
import malice.commands.Command;
import malice.symbols.Type;

public class RoomFunction extends Function {

    private List<Parameter> parameters;

    public RoomFunction(String name, List<Parameter> parameters, List<Command> commands, Type returnType) {
        super(name, commands, returnType);
        this.parameters = parameters;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("The room ");
        builder.append(name);
        builder.append("(");
        
        boolean first = true;
        for (Parameter parameter : parameters) {
            if (!first) {
                builder.append(", ");
            }
            /*if (parameter.isPassByReference()) {
                builder.append("spider ");
            }
            builder.append(parameter.getType());
            builder.append(" ");
            builder.append(parameter.getName());*/
            builder.append(parameter);
            
            first = !first;
        }
        
        builder.append(") contained a ");
        builder.append(type);
        builder.append("\n");
        
        for (Command command : commands) {
            builder.append("  ");
            builder.append(command);
            builder.append("\n");
        }
        
        return builder.toString();
    }
}