
import org.example.NewtonMethod;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

public class TestNewtonMethod {

    @Test
    public void testNewtonMethod() {
        double tolerance = 0.0001;
        int maxIterations = 1000;

        Function<Double, Double> sqrtFunction = new NewtonMethod(tolerance, maxIterations);

        double number = 9.0;
        double expected = 3.0;
        double result = sqrtFunction.apply(number);

        assertTrue(Math.abs(result - expected) < tolerance, "Sqrt calculation is incorrect");

    }


    @Test
    public void testNewtonMethodForSqrt2() {
        double tolerance = 0.0001;
        int maxIterations = 1000;

        Function<Double, Double> sqrtFunction = new NewtonMethod(tolerance, maxIterations);

        double number = 2.0;
        double expected = 1.4142;
        double result = sqrtFunction.apply(number);

        assertTrue(Math.abs(result - expected) < tolerance, "Sqrt of 2 calculation is incorrect");
    }

    @Test
    public void testNewtonMethodForSqrt25() {
        double tolerance = 0.0001;
        int maxIterations = 1000;

        Function<Double, Double> sqrtFunction = new NewtonMethod(tolerance, maxIterations);

        double number = 25.0;
        double expected = 5.0;
        double result = sqrtFunction.apply(number);

        assertTrue(Math.abs(result - expected) < tolerance, "Sqrt of 25 calculation is incorrect");
    }
}