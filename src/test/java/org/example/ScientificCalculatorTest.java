package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ScientificCalculatorTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, Math.sqrt(16), DELTA);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, ScientificCalculator.factorial(5));
        assertEquals(1, ScientificCalculator.factorial(0));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(0.0, Math.log(1), DELTA);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Math.pow(2, 3), DELTA);
    }
}
