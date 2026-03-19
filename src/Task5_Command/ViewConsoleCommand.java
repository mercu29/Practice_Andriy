package Task5_Command;
public class ViewConsoleCommand implements ConsoleCommand {
    @Override
    public char getKey() {
        return 'v';
    }
    @Override
    public String toString() {
        return "v - view";
    }
    @Override
    public void execute() {
        System.out.println("Viewing data...");
    }
}