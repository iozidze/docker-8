package org.example;



public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("5 - 3 = " + calculator.subtract(5, 3));
        System.out.println("3 * 5 = " + calculator.multiply(3, 5));
        System.out.println("10 / 2 = " + calculator.divide(10, 2));
    }
}
