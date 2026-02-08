package com.association;

// ================== AGGREGATION ==================
// Aggregation represents a weak HAS-A relationship
// Child object can exist independently of the parent
// Parent and child have separate lifecycles

// Independent class
class Library {

    // Library name
    String LibName;

    // Constructor to initialize library name
    Library(String name) {
        this.LibName = name;
    }
}

// Student class (depends on Library but does not own it)
class Student {

    // Student name
    String name;

    // Student HAS-A Library (Aggregation)
    Library library;

    // Constructor
    // Library object is passed from outside
    // This shows weak association (Aggregation)
    Student(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    // Displays student and library details
    public void showDetails() {
        System.out.println(name + " studies in " + library.LibName);
    }
}

// Main class
public class Demo2 {

    public static void main(String[] args) {

        // Library object created independently
        Library l = new Library("Physics Wallah");

        // Student uses existing Library object
        Student s = new Student("Ramjan", l);

        // Display details
        s.showDetails();
    }
}

