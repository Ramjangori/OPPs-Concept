package com.inheritance;

/*
 * Types of Inheritance in Java:
 *
 * 1. Single Inheritance
 *    One class inherits properties from another class.
 *
 * 2. Multiple Inheritance
 *    Not supported with classes (achieved using interfaces).
 *
 * 3. Hierarchical Inheritance
 *    Multiple classes inherit from a single parent class.
 *
 * 4. Multilevel Inheritance
 *    A class inherits from another class,
 *    which is already derived from another class.
 */

// Base / Parent class
class E {
    void show() {
        System.out.println("Class E");
    }
}

// Single Inheritance (F extends E)
class F extends E {
    void display() {
        System.out.println("Class F");
    }
}

// Multilevel Inheritance (C -> F -> E)
class C extends F {
    void getName() {
        System.out.println("Class C");
    }
}

// Hierarchical Inheritance (D and C extend F)
class D extends F {
    void getInfo() {
        System.out.println("Class D");
    }
}

public class Test2 {
    public static void main(String[] args) {

        // Multilevel Inheritance example
        C c = new C();
        c.show();      // From class E
        c.display();   // From class F
        c.getName();   // From class C

        // Hierarchical Inheritance example
        D d = new D();
        d.show();      // From class E
        d.display();   // From class F
        d.getInfo();   // From class D
    }
}
