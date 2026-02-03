package com.poly;

/*
 * Method Hiding (Compile-Time Polymorphism)
 * ----------------------------------------
 * Method hiding occurs when:
 * 1. A static method in a child class
 * 2. Has the same method name and signature
 * 3. As a static method in the parent class
 *
 * Important Points:
 * - Static methods cannot be overridden, they are hidden.
 * - Method call is decided by reference type, not by object type.
 * - This is an example of compile-time binding.
 */

class Person {

    static void eat() {
        System.out.println("Person eats food");
    }
}

class Student extends Person {

    static void eat() {
        System.out.println("Student eats food");
    }
}

public class MethodHiding {

    public static void main(String[] args) {

        Student s = new Student();
        Person p = new Person();
        Person p1 = new Student(); // Reference of Parent, object of Child

        s.eat();   // Calls Student.eat()
        p.eat();   // Calls Person.eat()
        p1.eat();  // Calls Person.eat() (method hiding)
    }
}
