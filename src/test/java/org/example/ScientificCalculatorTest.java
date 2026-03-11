package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ScientificCalculatorTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, ScientificCalculator.sqrt(16.0), DELTA);
    }

    @Test
    public void testFactorial() {
        assertEquals(120.0, ScientificCalculator.factorial(5), DELTA);
        assertEquals(1.0, ScientificCalculator.factorial(0), DELTA);
    }

    @Test
    public void testNaturalLog() {
        assertEquals(0.0, Math.log(1), DELTA);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Math.pow(2, 3), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeFactorialThrowsException() {
        ScientificCalculator.factorial(-5);
    }

    @Test
    public void testNegativeSquareRootReturnsNaN() {
        assertTrue(Double.isNaN(ScientificCalculator.sqrt(-16.0)));
    }
}