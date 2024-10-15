package mediatorPattern;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveHandler implements CommandHandler{
    @Override
    public void execute(Object... args) {
        if (args.length > 1) {
            String filename = (String) args[0];
            String data = (String) args[1];
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                writer.write(data);
                System.out.println("SaveHandler: Data saved to " + filename);
            } catch (IOException e) {
                System.out.println("Error saving data: " + e.getMessage());
            }
        }
    }
}
