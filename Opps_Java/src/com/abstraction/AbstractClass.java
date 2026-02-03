package com.abstraction;

/*
 * Abstraction
 * -----------
 * Abstraction means hiding implementation details
 * and showing only essential functionality.
 *
 * Abstraction can be achieved using:
 * 1. Abstract Class
 * 2. Interface
 *
 * Abstract Class:
 * - Declared using the 'abstract' keyword
 * - Can contain abstract and concrete methods
 * - Abstract methods have no implementation
 * - Child class must implement all abstract methods
 * - Object of abstract class cannot be created
 */

abstract class Person {

    abstract void eat();
    abstract void drink();
}

class Student extends Person {

    @Override
    void eat() {
        System.out.println("Student eats food");
    }

    @Override
    void drink() {
        System.out.println("Student drinks water");
    }
}

public class AbstractClass {

    public static void main(String[] args) {

        Person p = new Student(); // Upcasting
        p.eat();
        p.drink();
    }
}
