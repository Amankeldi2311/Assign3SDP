package commandPattern;

import handler.Task;

public class CompleteTaskCommand implements Command {
    private final Task task;

    public CompleteTaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        System.out.println("CompleteTaskCommand: Completing task." + task.getName());
    }
}
