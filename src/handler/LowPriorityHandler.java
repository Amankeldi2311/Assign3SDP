package handler;

public class LowPriorityHandler implements TaskHandler {
    private TaskHandler nextHandler;

    @Override
    public void setNextHandler(TaskHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(int priority) {
        if (priority == 1) {
            System.out.println("LowPriorityHandler: Handling low-priority task.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(priority);
        }
    }
}

