import commandPattern.*;
import handler.*;
import mediatorPattern.*;

public class Main {
    public static void main(String[] args) {
        // Create task handlers
        TaskHandler lowPriorityHandler = new LowPriorityHandler();
        TaskHandler mediumPriorityHandler = new MidPriorityHandler();
        TaskHandler highPriorityHandler = new HighPriorityHandler();

        // Set next handler
        lowPriorityHandler.setNextHandler(mediumPriorityHandler);
        mediumPriorityHandler.setNextHandler(highPriorityHandler);

        // Send requests
        System.out.println("Sending request with priority 1:");
        lowPriorityHandler.handleRequest(1);

        System.out.println("Sending request with priority 2:");
        lowPriorityHandler.handleRequest(2);

        System.out.println("Sending request with priority 3:");
        lowPriorityHandler.handleRequest(3);

        Task task1 = new Task("Task 1", 1);
        Task task2 = new Task("Task 2", 2);
        Task task3 = new Task("Task 3", 3);

        Command addTask1 = new AddTaskCommand(task1);
        Command removeTask2 = new RemoveTaskCommand(task2);
        Command completeTask3 = new CompleteTaskCommand(task3);

        TaskManager taskManager = new TaskManager();

        taskManager.setCommand(addTask1);
        taskManager.executeCommand();

        taskManager.setCommand(removeTask2);
        taskManager.executeCommand();

        taskManager.setCommand(completeTask3);
        taskManager.executeCommand();



        TaskMediator mediator = new CommandMediator();

        // Create command handlers
        CommandHandler printHandler = new PrintHandler();
        CommandHandler saveHandler = new SaveHandler();

        // Register command handlers
        mediator.registerHandler("print", printHandler);
        mediator.registerHandler("save", saveHandler);

        // Execute commands
        System.out.println("Executing print command:");
        mediator.executeCommand("print", "Hi, Mediator Pattern!");

        System.out.println("\nExecuting save command:");
        mediator.executeCommand("save", "output.txt", "This is a test data.");
    }

}