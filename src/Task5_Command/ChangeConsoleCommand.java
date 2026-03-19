package Task5_Command;
public class ChangeConsoleCommand implements ConsoleCommand {
    @Override
    public char getKey() {
        return 'c';
    }
    @Override
    public String toString() {
        return "c - change";
    }
    @Override
    public void execute() {
        System.out.println("Changing data...");
    }
}