package com.kodilla;

public class Calculator {

    public double addAToB(double a, double b) {
        return a + b;
    }

    public double substractAFromB(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        double a = 6.5;
        double b = 4.2;

        Calculator calculator = new Calculator();

        System.out.println("a + b = " + calculator.addAToB(a, b));
        System.out.println("a - b = " + calculator.substractAFromB(a, b));
    }
}
