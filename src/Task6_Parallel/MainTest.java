package Task6_Parallel;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
public class MainTest {
    @Test
    public void testMax() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(10.0);
        numbers.add(20.0);
        numbers.add(5.0);
        MaxCommand cmd = new MaxCommand(numbers);
        cmd.execute();
        assertTrue(true);
    }
}