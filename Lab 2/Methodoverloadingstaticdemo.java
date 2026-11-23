// Program to demonstrate Method Overloading and Static Keyword
class Calculator {

    // Static method - can be called without creating an object
    static int add(int a, int b) {
        return a + b;
    }

    // Overloaded static method - different parameter types
    static double add(double a, double b) {
        return a + b;
    }

    // Overloaded static method - different number of parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Methodoverloadingstaticdemo {
    public static void main(String[] args) {
        // Calling static methods directly using class name
        System.out.println("Sum of two integers: " + Calculator.add(10, 20));
        System.out.println("Sum of two doubles: " + Calculator.add(12.5, 7.5));
        System.out.println("Sum of three integers: " + Calculator.add(5, 10, 15));
    }
}