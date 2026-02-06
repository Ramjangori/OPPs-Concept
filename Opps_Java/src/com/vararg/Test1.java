package com.vararg;

/*
 * This class demonstrates METHOD OVERLOADING
 * with NORMAL parameter and VARARGS parameter.
 *
 * Important Rule:
 * If an exact match method is found,
 * Java gives FIRST preference to the NORMAL method,
 * NOT the varargs method.
 */

class Hello {

    // Normal method: takes exactly ONE int argument
    void show(int a) {
        System.out.println(a + " -> normal int method");
    }

    // Varargs method: can take ZERO or MORE int values
    // Internally, 'a' behaves like an int[]
    void show(int... a) {
        System.out.println(a + " -> varargs method");
    }
}

public class Test1 {

    public static void main(String[] args) {

        Hello obj = new Hello();

        // Case 1: Multiple arguments
        // No exact matching method exists,
        // so Java calls the VARARGS method
        obj.show(2, 4, 5);

        // Case 2: Single argument
        // Exact match exists: show(int a)
        // So NORMAL method gets preference
        // obj.show(10);

        // Case 3: No arguments
        // Only varargs can accept zero arguments
        // obj.show();
    }
}
