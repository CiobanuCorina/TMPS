package com.company.FactoryMethod;

import java.util.Scanner;

public class CalculatorFactory {
    public Calculator getOperation(String input) throws NoSuchMethodException {
        String[] strArray = input.trim().split("\\s+");
        if (strArray.length != 3) throw new NoSuchMethodException();
        switch(strArray[1]) {
            case "+":
                return new Addition(Double.parseDouble(strArray[0]), Double.parseDouble(strArray[2]));
            case "-":
                return new Substraction(Double.parseDouble(strArray[0]), Double.parseDouble(strArray[2]));
            case "*":
                return new Multiplication(Double.parseDouble(strArray[0]), Double.parseDouble(strArray[2]));
            case "/":
                return new Division(Double.parseDouble(strArray[0]), Double.parseDouble(strArray[2]));
            default:
                throw new NoSuchMethodException();
        }
    }
}
