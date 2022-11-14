package com.microservice.serverpoc.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalaryCalculatorTest {

    @Test
    public void testCalculate(){
        SalaryCalculator calculator = new SalaryCalculator();
        Assertions.assertEquals(30.0, calculator.calculate(30, 1.0));
        Assertions.assertEquals(60.0, calculator.calculate(30, 2.0));
        Assertions.assertEquals(90.0, calculator.calculate(30, 3.0));
    }
}