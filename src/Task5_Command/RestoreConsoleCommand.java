package Task5_Command;
public class RestoreConsoleCommand implements ConsoleCommand {
    @Override
    public char getKey() {
        return 'r';
    }
    @Override
    public String toString() {
        return "r - restore";
    }
    @Override
    public void execute() {
        System.out.println("Restoring data...");
    }
}