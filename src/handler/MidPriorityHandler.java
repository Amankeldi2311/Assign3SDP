package handler;

public class MidPriorityHandler implements TaskHandler {
    private TaskHandler nextHandler;

    @Override
    public void setNextHandler(TaskHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(int priority) {
        if (priority == 2) {
            System.out.println("MediumPriorityHandler: Handling medium-priority task.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(priority);
        }
    }
}

