package com.trickyQuestions;

// Abstract parent class
abstract class A {

    // Parent class constructor
    A() {
        // ⚠️ Calling an overridden method from constructor
        // Runtime polymorphism will apply here
        // Object is of type B, so B's show() will be called
        // BUT child class variables are not initialized yet
        show();
    }

    // Abstract method
    // Must be implemented by child class
    public abstract void show();
}

// Child class
class B extends A {

    // Instance variable
    // This value (10) will be assigned
    // only after parent constructor finishes
    int x = 10;

    // Child class constructor
    B() {
        // This runs after the parent constructor
        System.out.println("B constructor");
    }

    // Overridden method
    @Override
    public void show() {
        // When this method is called from A's constructor,
        // x still has its default value (0)
        // so output is 0
        System.out.println(x);
    }
}

// Main class
public class Question1 {

    public static void main(String[] args) {

        // Object creation
        // Order:
        // 1. Memory allocation (x = 0)
        // 2. Parent constructor (A)
        // 3. Child constructor (B)
        A obj = new B();
    }
}
