package mediatorPattern;

import commandPattern.Command;
import handler.TaskHandler;

import java.util.HashMap;
import java.util.Map;

public class CommandMediator implements TaskMediator {
    private final Map<String, CommandHandler> handlers = new HashMap<>();

    @Override
    public void registerHandler(String commandName, CommandHandler handler) {
        handlers.put(commandName, handler);
    }

    @Override
    public void executeCommand(String commandName, Object... args) {
        CommandHandler handler = handlers.get(commandName);
        if (handler != null) {
            handler.execute(args);
        } else {
            throw new IllegalArgumentException("Command '" + commandName + "' not found.");
        }
    }
}


