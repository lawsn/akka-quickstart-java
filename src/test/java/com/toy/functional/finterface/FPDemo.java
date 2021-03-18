package com.toy.functional.finterface;

public class FPDemo {

    public static void main(String[] args) {
        GreetingFunction greeting = message -> System.out.println("Hello " + message + "!");
        greeting.speak("Tom");
        greeting.speak("Mary");

        calculateTwoNumbers(3, 4);
        calculateTwoNumbers(3, 0);
    }

    private static void calculateTwoNumbers(int x, int y) {
        IntegerCalculator add = (a, b) -> a + b;
        IntegerCalculator diff = (a, b) -> a - b;
        IntegerCalculator divide = (a, b) -> (b == 0 ? 0 : a / b);

        System.out.printf("%d + %d = %d\n", x, y, add.calculate(x, y));
        System.out.printf("%d - %d = %d\n", x, y, diff.calculate(x, y));
        System.out.printf("%d / %d = %d\n", x, y, divide.calculate(x, y));
    }
}
