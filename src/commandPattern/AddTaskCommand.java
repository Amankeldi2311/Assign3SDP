package commandPattern;

import handler.Task;

public class AddTaskCommand implements Command {
    private final Task task;

    public AddTaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        System.out.println("AddTaskCommand: Adding task.");
    }
}
