package com.example.calculatorr;

import com.example.calculatorr.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;



public class CalculatorrServiceParameterizedTest {

    private static final Double NEGATIVE_FIVE = -5.0 ;
    private static final Double FIVE =5.0 ;
    private final CalculatorService calculatorService=new CalculatorService();

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(FIVE,FIVE),
                Arguments.of(NEGATIVE_FIVE,NEGATIVE_FIVE)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void calculatorPlusParameterized(Double a, Double b) {
        String expected = String.valueOf(calculatorService.plus(a, b));
        String actual= String.valueOf(a+b);
        Assertions.assertEquals(actual,expected);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void calculatorMinusParameterized(Double a, Double b) {
        String expected = String.valueOf(calculatorService.minus(a, b));
        String actual= String.valueOf(a-b);
        Assertions.assertEquals(actual,expected);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void calculatorMultipleParameterized(Double a, Double b) {
        String expected = String.valueOf(calculatorService.multiple(a, b));
        String actual= String.valueOf(a*b);
        Assertions.assertEquals(actual,expected);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void calculatorDivideParameterized(Double a, Double b) {
        String expected = String.valueOf(calculatorService.divide(a, b));
        String actual= String.valueOf(a/b);
        Assertions.assertEquals(actual,expected);
    }



}
