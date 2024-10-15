package handler;

public class HighPriorityHandler implements TaskHandler {
    private TaskHandler nextHandler;

    @Override
    public void setNextHandler(TaskHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(int priority) {
        if (priority >= 3) {
            System.out.println("HighPriorityHandler: Handling high-priority task.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(priority);
        }
    }
}

