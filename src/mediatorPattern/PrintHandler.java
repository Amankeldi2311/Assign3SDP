package mediatorPattern;

public class PrintHandler implements CommandHandler {
    @Override
    public void execute(Object... args) {
        if (args.length > 0) {
            System.out.println("PrintHandler: " + args[0]);
        }
    }
}
