package Task6_Parallel;
import java.util.List;
public class MinMaxCommand implements Command {
    private List<Double> data;
    public MinMaxCommand(List<Double> data) {
        this.data = data;
    }
    @Override
    public void execute() {
        double min = data.get(0);
        double max = data.get(0);
        for (double n : data) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }

        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

}