package com.helloworld;

public class Main {
    public static void main(String[] args) {
        BasicOperationsService operationsService = new BasicOperationsService();
        CalculatorService calculatorService = new CalculatorService(operationsService);
        calculatorService.runCalculator();
    }
}