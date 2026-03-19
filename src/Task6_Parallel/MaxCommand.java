package Task6_Parallel;
import java.util.List;
public class MaxCommand implements Command {
    private List<Double> data;
    public MaxCommand(List<Double> data) {
        this.data = data;
    }
    @Override
    public void execute() {
        double max = data.get(0);
        for (double n : data) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println("Max = " + max);
    }
}