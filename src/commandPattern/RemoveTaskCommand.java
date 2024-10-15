package commandPattern;

import handler.Task;

public class RemoveTaskCommand implements Command {
    private final Task task;

    public RemoveTaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        System.out.println("RemoveTaskCommand: Removing task." + task.getName());
    }
}
