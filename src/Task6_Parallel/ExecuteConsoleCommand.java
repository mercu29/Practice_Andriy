package Task6_Parallel;
import java.util.ArrayList;
import java.util.List;
public class ExecuteConsoleCommand implements Command {
    @Override
    public void execute() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(10.0);
        numbers.add(20.0);
        numbers.add(5.0);
        numbers.add(40.0);
        numbers.add(15.0);
        CommandQueue queue = new CommandQueue();
        queue.put(new MaxCommand(numbers));
        queue.put(new AvgCommand(numbers));
        queue.put(new MinMaxCommand(numbers));
        System.out.println("Execute all threads...");
    }
}