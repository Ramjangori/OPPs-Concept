package com.poly;

/*
 * Polymorphism:
 * One method name with different behavior.
 *
 * Types of Polymorphism:
 *
 * 1. Compile-Time Polymorphism (Method Overloading)
 *    - Same method name
 *    - Different parameters
 *    - Occurs in the same class
 *
 * 2. Run-Time Polymorphism (Method Overriding)
 *    - Same method name
 *    - Same parameters
 *    - Requires inheritance
 *    - Child class provides its own implementation
 */

// Parent class
class Service {

    // Method Overloading (Compile-Time Polymorphism)
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method to be overridden
    String delivery() {
        return "Delivery Items";
    }
}

// Child class
class Zepto extends Service {

    // Method Overriding (Run-Time Polymorphism)
    @Override
    String delivery() {
        return "Deliver Grocery Items";
    }
}

public class Poly1 {
    public static void main(String[] args) {

        Service service = new Zepto(); // Upcasting

        System.out.println(service.delivery());   // Runtime Polymorphism
        System.out.println(service.sum(5, 7));    // Method Overloading
        System.out.println(service.sum(10, 20, 40));
    }
}
