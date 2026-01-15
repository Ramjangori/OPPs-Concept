package com.constructor;

/*
 * Types of Constructors in Java:
 * 1. Default Constructor
 * 2. Parameterized Constructor
 * (Copy constructor is not built-in in Java, but can be created manually)
 */

public class Test2 {

    // Instance variables
    int a;
    int b;

    /*
     * Default Constructor
     * - No arguments
     * - If programmer does not create any constructor,
     *   JVM provides a default constructor automatically
     */
    Test2() {
        System.out.println("Default Constructor..");
    }

    /*
     * Parameterized Constructor (Single Argument)
     * - Accepts one value
     * - Used to pass data at the time of object creation
     */
    Test2(int a) {
        System.out.println(a);
    }

    /*
     * Parameterized Constructor (Two Arguments)
     * - Accepts two values
     * - Used to initialize multiple values at once
     */
    Test2(int a, int b) {

        // Here local variables have same names as instance variables
        // So values are assigned to local variables only
        a = a;
        b = b;

        System.out.println("Value of a and b :: " + a + " " + b);
    }

    /*
     * main method
     * - Program execution starts from here
     * - Objects are created to call constructors
     */
    public static void main(String[] args) {

        // Calling default constructor
        Test2 t = new Test2();

        // Calling parameterized constructor with one argument
        Test2 t2 = new Test2(5);

        // Calling parameterized constructor with two arguments
        Test2 t3 = new Test2(5, 10);
    }
}
