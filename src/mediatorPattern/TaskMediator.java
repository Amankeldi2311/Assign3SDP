package mediatorPattern;

import commandPattern.Command;
import handler.TaskHandler;

public interface TaskMediator {
    void registerHandler(String commandName, CommandHandler handler);
    void executeCommand(String commandName, Object... args);
}


