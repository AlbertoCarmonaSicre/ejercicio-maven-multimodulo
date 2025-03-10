package com.helloworld;


import java.util.Scanner;

public class ConsoleIO {
    private static final Scanner scanner = new Scanner(System.in);

    public static void print(String message) {
        System.out.println(message);
    }

    public static String readInput() {
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        calculatorService.runCalculator();
    }
}
