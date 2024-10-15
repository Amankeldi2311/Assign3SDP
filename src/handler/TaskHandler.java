package handler;

public interface TaskHandler {
    void setNextHandler(TaskHandler nextHandler);

    void handleRequest(int priority);
}

