package Task5_Command;
public class GenerateConsoleCommand implements ConsoleCommand {
    @Override
    public char getKey() {
        return 'g';
    }
    @Override
    public String toString() {
        return "g - generate";
    }
    @Override
    public void execute() {
        System.out.println("Random generation...");
    }
}