import org.example.NewtonMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewtonMethodTest {

    @Test
    void testSqrt() {
        double result = NewtonMethod.sqrt(16, 0.0001, 100);
        assertEquals(4, result, 0.0001);
    }
}