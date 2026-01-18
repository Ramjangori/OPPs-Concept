package com.constructor;

/*
 * This program demonstrates the working of a constructor
 * and how instance variables are accessed in Java.
 */
public class Test {

    // Instance variable
    // This variable belongs to the object of the class
    int a = 10;
    public static int b=20;

    /*
     * Constructor
     * - Name is same as class name
     * - No return type
     * - Automatically called when object is created
     * - Used to initialize instance variables
     */
    Test() {
        // Instance variable 'a' can be accessed here
        // because constructor is executed when an object is created
        System.out.println("Constructor Called... " + a);
    }

    /*
     * Instance method
     * - Called using an object
     * - Can access instance variables of the class
     */
    void display() {
        // Instance variable 'a' is accessible here
        // because this method is called using an object
        System.out.println(a);
    }

    /*
     * main method
     * - Static method
     * - Object creation is required to access instance members
     */
    public static void main(String[] args) {

        // Creating object of Test class
        // Constructor is called automatically during object creation
        Test t = new Test();

        // Calling instance method using object reference
        t.display();
    }
}
