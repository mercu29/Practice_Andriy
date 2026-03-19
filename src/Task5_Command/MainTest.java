package Task5_Command;
import org.junit.Test;
import static org.junit.Assert.*;
public class MainTest {
    @Test
    public void testGenerateCommand() {
        GenerateConsoleCommand cmd = new GenerateConsoleCommand();
        assertEquals('g', cmd.getKey());
        assertEquals("g - generate", cmd.toString());

    }
    @Test
    public void testViewCommand() {
        ViewConsoleCommand cmd = new ViewConsoleCommand();
        assertEquals('v', cmd.getKey());
        assertEquals("v - view", cmd.toString());

    }

}