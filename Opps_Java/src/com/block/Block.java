package com.block;

/*
 * BLOCK:
 * A block is a group of statements enclosed within curly braces {} 
 * that execute as a single unit.
 *
 * TYPES OF BLOCKS IN JAVA:
 * 1. Static Block    -> Declared using static keyword, executes once at class loading
 * 2. Instance Block  -> Without static keyword, executes during object creation
 * 3. Local Block     -> Written inside another block or method, used for scope control
 */

public class Block {

    /*
     * STATIC BLOCK
     * - Executes once when the class is loaded into the JVM
     * - Executes before main() method
     */
    static {

        // Local block inside static block (scope-limited block)
        {
            System.out.println("Local block inside static block");
        }

        System.out.println("Static block");
    }

    /*
     * INSTANCE BLOCK
     * - Executes every time an object is created
     * - Executes before the constructor
     */
    {

        // Local block inside instance block
        {
            System.out.println("Local block 1 inside instance block");
        }

        System.out.println("Instance block");

        // Another local block inside instance block
        {
            System.out.println("Local block 2 inside instance block");
        }
    }

    /*
     * CONSTRUCTOR
     * - Executes after instance block
     * - Used to initialize object-specific data
     */
    Block() {
        System.out.println("Default constructor");
    }

    /*
     * MAIN METHOD
     * - Entry point of the program
     * - Triggers class loading and object creation
     */
    public static void main(String[] args) {

        // Object creation
        Block b = new Block();
    }
}
