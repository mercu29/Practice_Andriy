package Task5_Command;
public class SaveConsoleCommand implements ConsoleCommand {
    @Override
    public char getKey() {
        return 's';
    }
    @Override
    public String toString() {
        return "s - save";
    }
    @Override
    public void execute() {
        System.out.println("Saving data...");
    }
}