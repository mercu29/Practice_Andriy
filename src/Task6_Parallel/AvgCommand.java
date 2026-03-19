package Task6_Parallel;
import java.util.List;
public class AvgCommand implements Command {
    private List<Double> data;
    public AvgCommand(List<Double> data) {
        this.data = data;
    }
    @Override
    public void execute() {
        double sum = 0;
        for (double n : data) {
            sum += n;
        }
        double avg = sum / data.size();
        System.out.println("Average = " + avg);
    }
}