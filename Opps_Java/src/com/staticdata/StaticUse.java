package com.staticdata;

/*
 * Real Use of static keyword in Java
 * Example: Simple Banking System
 * This program demonstrates:
 * 1. static variables
 * 2. static block
 * 3. difference between static and instance data
 */

// Bank class
class SbiBank {

    // -------- Static Variables (Class Level) --------

    // Same bank name for all customers (shared memory)
    static String bankName = "State Bank of India";

    // Counts total number of customers
    static int totalCustomer;

    // -------- Instance Variables (Object Level) --------

    // IFSC code (same for branch but kept non-static for demo)
    String ifCCode = "SBI0937";

    // Customer-specific data
    int accountNumber;
    String userName;
    String userAddress;

    // -------- Static Block --------
    // Executes only once when class is loaded
    // Used to initialize static variables
    static {
        totalCustomer = 0;
    }

    // -------- Constructor --------
    // Initializes instance variables
    // Increments total customer count
    SbiBank(String user, int acc, String address) {
        this.userName = user;
        this.accountNumber = acc;
        this.userAddress = address;

        // Increase total customer count
        totalCustomer++;
    }

    // -------- Instance Method --------
    // Displays customer and bank details
    void showData() {
        System.out.println("Customer Name : " + userName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Address : " + userAddress);

        System.out.println("Bank Name : " + bankName);
        System.out.println("IFSC Code : " + ifCCode);

        // Static variable accessed by all objects
        System.out.println("Total Customers : " + totalCustomer);
    }
}

// -------- Main Class --------
public class StaticUse {

    public static void main(String[] args) {

        // Creating first customer object
        SbiBank user1 = new SbiBank("Ramjan", 899389878, "Ratangarh");

        // Creating second customer object
        SbiBank user2 = new SbiBank("Nawab", 899389998, "Churu");

        // Display data of second customer
        user2.showData();
    }
}
