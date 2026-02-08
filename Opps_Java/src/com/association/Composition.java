package com.association;

// ================== COMPOSITION ==================
// Composition represents a strong HAS-A relationship
// The child object cannot exist without the parent object
// If the parent is destroyed, the child is also destroyed

// Child class
class Engine {

    // Stores engine type
    String engineType;

    // Constructor to initialize engine type
    Engine(String s) {
        this.engineType = s;
    }

    // Displays engine details
    public void showDetails() {
        System.out.println("Engine Type : " + engineType);
    }
}

// Parent class
class Car {

    // Car name
    String name;

    // Car HAS-A Engine (Composition)
    Engine engine;

    // Constructor
    // Engine object is created inside the Car class
    // This shows a strong dependency (Composition)
    Car(String carname, String engineType) {
        name = carname;
        this.engine = new Engine(engineType);
    }

    // Displays car and engine details
    public void showdetails() {
        System.out.println("Car Name : " + name);
        engine.showDetails();
    }
}

// Main class
public class Composition {

    public static void main(String[] args) {

        // Creating Car object automatically creates Engine object
        Car car = new Car("Alto", "CNG");

        // Displaying details
        car.showdetails();
    }
}

