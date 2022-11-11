package com.microservice.serverpoc.utils;

public class SalaryCalculator {

    public double calculate(int noOfPaidDays, double perDay) {
        return noOfPaidDays * perDay;
    }

    public double calculate2(int noOfPaidDays, double perDay) {
        return noOfPaidDays * perDay + 100;
    }
}
