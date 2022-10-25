package com.example.calculatorr.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInt {
    @Override
    public double plus(Double a, Double b) {
        return a+b;
    }

    @Override
    public double minus(Double a, Double b) {
        return a-b;
    }

    @Override
    public double multiple(Double a, Double b) {
        return a*b;
    }

    @Override
    public double divide(Double a, Double b) {
        if(b==0) throw new IllegalArgumentException("Значение b неверно");
        return (double)a/b;
    }

}
