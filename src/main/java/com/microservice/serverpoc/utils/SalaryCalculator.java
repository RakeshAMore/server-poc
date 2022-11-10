package com.microservice.serverpoc.utils;

public class SalaryCalculator {

    public double calculate(int noOfPaidDays, double perDay) {
        return noOfPaidDays * perDay;
    }
}
