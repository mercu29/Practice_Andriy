package Task3_Inheritance;
import java.util.ArrayList;
import java.util.List;
public class ResultCollection {
    private List<CalcResult> results = new ArrayList<>();
    public void add(CalcResult result) {
        results.add(result);
    }
    public List<CalcResult> getResults() {
        return results;
    }
}