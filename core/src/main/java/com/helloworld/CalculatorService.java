package com.helloworld;

public class CalculatorService {

    public void runCalculator() {
        while (true) {
            ConsoleIO.print("Select an operation:");
            ConsoleIO.print("1. Split");
            ConsoleIO.print("2. Sum");
            ConsoleIO.print("3. String concatenation");
            ConsoleIO.print("4. Exit");
            ConsoleIO.print("Option:");

            String choice = ConsoleIO.readInput();

            switch (choice) {
                case "1":
                    performSplit();
                    break;
                case "2":
                    performSum();
                    break;
                case "3":
                    performConcatenation();
                    break;
                case "4":
                    ConsoleIO.print("Exiting calculator...");
                    return;
                default:
                    ConsoleIO.print("Invalid option, please try again.");
            }
        }
    }

    private void performSplit() {
        ConsoleIO.print("Enter a sentence to split:");
        String input = ConsoleIO.readInput();
        String[] words = input.split(" ");
        ConsoleIO.print("Split result:");
        for (String word : words) {
            ConsoleIO.print(word);
        }
    }

    private void performSum() {
        try {
            ConsoleIO.print("Enter first number:");
            int num1 = Integer.parseInt(ConsoleIO.readInput());
            ConsoleIO.print("Enter second number:");
            int num2 = Integer.parseInt(ConsoleIO.readInput());
            ConsoleIO.print("Sum result: " + (num1 + num2));
        } catch (NumberFormatException e) {
            ConsoleIO.print("Invalid number. Please enter valid integers.");
        }
    }

    private void performConcatenation() {
        ConsoleIO.print("Enter first string:");
        String str1 = ConsoleIO.readInput();
        ConsoleIO.print("Enter second string:");
        String str2 = ConsoleIO.readInput();
        ConsoleIO.print("Concatenation result: " + str1 + str2);
    }
}
