package com.example.calculatorr;

import com.example.calculatorr.service.CalculatorService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorrServiceTest {
    private final CalculatorService calculatorService=new CalculatorService();
    final Double a = 2.0;
    final Double b = 5.0;

    final Double c = 10.0;
    final Double d = 11.0;
    final Double e = (double) 0;

    @Test
    public void calculatorPlus() {
//        calculatorService.plus(a, b);
//        calculatorService.plus(c, d);
        assertEquals((a + b), calculatorService.plus(a, b));
        assertEquals((c + d), calculatorService.plus(c, d));

    }

    @Test
    public void calculatorMinus() {
//        calculatorService.minus(a, b);
//        calculatorService.minus(c, d);
        assertEquals((a - b), calculatorService.minus(a, b));
        assertEquals((c - d), calculatorService.minus(c, d));

    }

    @Test
    public void calculatorMultiple() {
//        calculatorService.multiple(a, b);
//        calculatorService.multiple(c, d);
        assertEquals((a *b), calculatorService.multiple(a, b));
        assertEquals((c * d), calculatorService.multiple(c, d));

    }

    @Test
    public void calculatorDivide() {
//        calculatorService.divide(a, b);
//        calculatorService.divide(c, d);
        assertEquals( (a/ b), calculatorService.divide(a, b));
        assertEquals( (c / d), calculatorService.divide(c, d));

    }

    @Test
    public void calculatorException() {
        Object IllegalArgumentException;
        assertThrows(IllegalArgumentException.class,()->calculatorService.divide(c,e));
    }



}
