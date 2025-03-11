package com.helloworld;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BasicOperationsService {

    public static int sum(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No puedes dividir por 0");
        }
        return (double) a / b;
    }
}