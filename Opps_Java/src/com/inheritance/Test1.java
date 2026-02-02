package com.inheritance;

/*
 * Inheritance:
 * One class acquires the properties (variables & methods) of another class.
 * 
 * Parent Class  -> Super Class
 * Child Class   -> Sub Class
 * 
 * Keyword used: extends
 */

// Parent / Super class
class A {
    int a = 10;

    void show() {
        System.out.println("Method of Class A");
    }
}

// Child / Sub class
class B extends A {

    void getName() {
        System.out.println("Method of Class B");
    }
}

public class Test1 {
    public static void main(String[] args) {

        // Creating object of Child class
        B b = new B();
        b.show();      // Accessing parent class method
        b.getName();   // Accessing child class method

        // Object creation in Inheritance

        A a = new A();     // Parent reference, Parent object (Valid)
        B b1 = new B();    // Child reference, Child object (Valid)
        A a1 = new B();    // Parent reference, Child object (Upcasting - Valid)

        // B b2 = new A(); // Child reference, Parent object (Invalid)
    }
}
