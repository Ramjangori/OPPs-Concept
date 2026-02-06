package com.vararg;

class Demo1 {

    // This method takes one float argument and
    // variable number of int arguments (varargs).
    // Internally, int... b is treated as int[] b
    void show(float a, int... b) {
        // 'a' is a float value
        // 'b' is an int array created by varargs
        System.out.println(a + " " + b);
    }

    // This method accepts only varargs of int.
    // Internally, int... a is treated as int[] a
    void show(int... a) {
        // Iterating over varargs using enhanced for-loop
        for (int n : a) {
            System.out.println(n);
        }
    }
}

public class Test4 {

    public static void main(String[] args) {

        Demo1 d = new Demo1();

        // This call matches show(int... a)
        // Exact int match is preferred over widening (int -> float)
        d.show(2, 4, 5);

        // This call matches show(float a, int... b)
        // First argument is float, remaining arguments go into varargs
        d.show(5.4f, 5, 3, 2);
    }
}
