package com.company.FactoryMethod;

import java.util.Scanner;

public class TestFactoryMethod {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String str;
        CalculatorFactory calculatorFactory = new CalculatorFactory();

        System.out.println("Welcome to Simple Calculator");
        System.out.println("You can add, subtract, multiply and divide two floating point or integer numbers");
        System.out.println("Numbers and operations must be separated by space. Type exit to stop calculator");
        System.out.println("Enter first operation:");

        while (true) {
            str = scanner.nextLine();
            if(str.equals("exit"))
                break;
            try {
                System.out.println(calculatorFactory.getOperation(str).calculate());
            } catch (NoSuchMethodException e) {
                System.out.println("You entered an invalid operation");
            }
        }
    }
}
