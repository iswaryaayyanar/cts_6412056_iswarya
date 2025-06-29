import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void initialize() {
        // runs before each test
        calc = new Calculator();
        System.out.println("Initialized Calculator");
    }

    @After
    public void cleanup() {

        calc = null;
        System.out.println("Cleaned up Calculator");
    }

    @Test
    public void shouldAddTwoNumbers() {

        int x = 5, y = 3;


        int sum = calc.add(x, y);


        assertEquals("Addition failed", 8, sum);
    }

    @Test
    public void shouldSubtractCorrectly() {
        int x = 10, y = 4;
        int diff = calc.subtract(x, y);
        assertEquals("Subtraction failed", 6, diff);
    }

    @Test
    public void shouldMultiplyCorrectly() {
        int m = 7, n = 6;
        int product = calc.multiply(m, n);
        assertEquals("Multiplication failed", 42, product);
    }
}
