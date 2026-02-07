package com.association;

/*
 * ASSOCIATION:
 * ------------
 * - Association represents a relationship between two independent classes
 * - Both classes can exist independently
 * - It shows a "uses-a" relationship
 * - There is no ownership between the objects
 * - Objects are connected through method parameters
 *
 * Example:
 * Driver and CarModel
 * - A Driver can exist without a Car
 * - A Car can exist without a Driver
 * - They are associated temporarily
 */

// Driver class (independent class)
class Driver {
    String name;

    // Constructor to initialize Driver object
    Driver(String name) {
        this.name = name;
    }
}

// CarModel class (independent class)
class CarModel {
    String model;

    // Constructor to initialize CarModel object
    CarModel(String model) {
        this.model = model;
    }

    /*
     * assignDriver():
     * - This method creates an association between Driver and CarModel
     * - Driver object is passed as a parameter
     * - CarModel does NOT store Driver as a data member
     * - Association exists only while this method is executing
     */
    public void assignDriver(Driver driver) {
        System.out.println(driver.name + " drives " + model);
    }
}

public class Demo1 {
    public static void main(String[] args) {

        // Creating Driver object
        Driver d = new Driver("Nitesh");

        // Creating CarModel object
        CarModel model = new CarModel("ALTO");

        /*
         * Association is created here:
         * - Driver object is passed to CarModel method
         * - No object owns the other
         * - Both objects are independent
         */
        model.assignDriver(d);
    }
}
