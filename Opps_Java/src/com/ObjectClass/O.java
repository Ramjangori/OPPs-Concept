package com.ObjectClass;

/**
 * Object class demo:
 * - Object is the superclass of all classes in Java
 * - toString() is overridden to provide meaningful output
 */
public class O {

    private int id;
    private String name;

    // Constructor
    O(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "name: " + name + ", id: " + id;
    }

    public static void main(String[] args) {
        O t1 = new O(2, "Ramjan");
        System.out.println(t1); // internally calls toString()
    }
}
