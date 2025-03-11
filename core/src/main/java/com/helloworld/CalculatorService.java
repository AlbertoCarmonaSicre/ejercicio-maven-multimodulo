package com.helloworld;

public class CalculatorService {

    private BasicOperationsService operationsService;

    public CalculatorService(){
        this.operationsService = new BasicOperationsService();
    }

    public void runCalculator() {
        while (true) {
            ConsoleIO.print("Select an operation:");
            ConsoleIO.print("1. Sum");
            ConsoleIO.print("2. Subtract");
            ConsoleIO.print("3. Multiply");
            ConsoleIO.print("4. Divide");
            ConsoleIO.print("5. Exit");
            ConsoleIO.print("Option:");

            String choice = ConsoleIO.readInput();

            if (choice.equals("5")) {
                ConsoleIO.print("Exiting calculator...");
                return;
            }

            ConsoleIO.print("Enter first number:");
            int num1 = Integer.parseInt(ConsoleIO.readInput());
            ConsoleIO.print("Enter second number:");
            int num2 = Integer.parseInt(ConsoleIO.readInput());

            switch (choice) {
                case "1":
                    ConsoleIO.print("Result: " + operationsService.sum(num1, num2));
                    break;
                case "2":
                    ConsoleIO.print("Result: " + operationsService.subtract(num1, num2));
                    break;
                case "3":
                    ConsoleIO.print("Result: " + operationsService.multiply(num1, num2));
                    break;
                case "4":
                    try {
                        ConsoleIO.print("Result: " + operationsService.divide(num1, num2));
                    } catch (ArithmeticException e) {
                        ConsoleIO.print("Error: " + e.getMessage());
                    }
                    break;
                default:
                    ConsoleIO.print("Invalid option, please try again.");
            }
        }
    }
}
