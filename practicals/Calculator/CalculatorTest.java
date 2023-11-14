import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator("Test Calculator");
    }

    @Test
    public void testAddition() {
        int result = calculator.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiply(6, 2);
        assertEquals(12, result);
    }

    // @Test
    // public void testAdditionOutOfRange() {
    //     assertThrows(IllegalArgumentException.class, () -> calculator.add(61, 10));
    // }

    // @Test
    // public void testSubtractionOutOfRange() {
    //     assertThrows(IllegalArgumentException.class, () -> calculator.subtract(5, 61));
    // }
}
