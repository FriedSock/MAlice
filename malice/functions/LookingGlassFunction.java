package malice.functions;

import java.util.List;
import malice.commands.Command;
import malice.symbols.Type;

public class LookingGlassFunction extends Function {

    public LookingGlassFunction(String name, List<Command> commands, Type inputType) {
        super(name, commands, inputType);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("The Looking-Glass ");
        builder.append(name);
        builder.append(" changed a ");
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