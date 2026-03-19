package Task5_Command;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
public class Menu implements Command {
    private List<ConsoleCommand> menu = new ArrayList<>();
    private Stack<Command> history = new Stack<>();
    public void add(ConsoleCommand command) {
        menu.add(command);
    }
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter command:");
            for (ConsoleCommand c : menu) {
                System.out.println(c);
            }
            System.out.println("u - undo");
            System.out.println("q - quit");
            char key = scanner.next().charAt(0);
            if (key == 'q') {
                System.out.println("Exit");
                break;
            }
            if (key == 'u') {
                if (!history.isEmpty()) {
                    history.pop();
                    System.out.println("Undo last command");
                } else {
                    System.out.println("Nothing to undo");
                }
                continue;
            }
            for (ConsoleCommand c : menu) {
                if (c.getKey() == key) {
                    c.execute();
                    history.push(c);

                }
            }
        }
    }
}