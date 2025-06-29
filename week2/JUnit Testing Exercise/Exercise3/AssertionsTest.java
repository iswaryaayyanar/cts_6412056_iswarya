import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void checkAssertions() {
        int result = Integer.sum(3, 2);
        assertEquals("Expected sum mismatch", 5, result);

        boolean condition = (10 >= 4);
        assertTrue("Expected condition to be true", condition);

        assertFalse("Expected condition to be false", 1 > 9);

        String empty = null;
        assertNull("Expected null value", empty);

        Double number = Double.valueOf(3.14);
        assertNotNull("Expected non-null object", number);
    }
}
