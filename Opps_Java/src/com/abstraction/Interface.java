package com.abstraction;

/*
 * Interface in Java
 * -----------------
 * An interface is a blueprint of a class.
 * It defines what a class should do, not how it should do it.
 *
 * Interfaces are mainly used to achieve:
 * - Abstraction
 * - Multiple inheritance
 *
 * Important Rules:
 * - All variables are public, static, and final by default
 * - All methods are public and abstract by default
 * - Objects of an interface cannot be created
 * - Interfaces do not have constructors
 * - We can create a reference of an interface
 */

interface Animal {

    void eat();    // public abstract by default
    void drink();  // public abstract by default
}

class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog eats food");
    }

    @Override
    public void drink() {
        System.out.println("Dog drinks water");
    }
}

public class Interface {

    public static void main(String[] args) {

        Animal a = new Dog(); // Interface reference
        a.eat();
        a.drink();
    }
}
