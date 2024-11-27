package com.example;

import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2, 3), 0);
    }

    @Test
    public void testSubtract() {
        assertEquals(2.0, calculator.subtract(5, 3), 0);
    }

    @Test
    public void testMultiply() {
        assertEquals(15.0, calculator.multiply(3, 5), 0);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(10, 5), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}
