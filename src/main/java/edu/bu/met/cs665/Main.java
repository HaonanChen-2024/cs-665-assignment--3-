/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: Main.java
 * Description: The Main class serves as the entry point for the email generation application.
 * It creates customer objects of various types using CustomerFactory and sends emails using EmailSender.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.Customer;

public class Main {

    public static void main(String[] args) {
        // Initialize EmailSender instance
        EmailSender emailSender = new EmailSender();

        // Create various customer objects using CustomerFactory
        Customer businessCustomer = CustomerFactory.createCustomer("Business", "Alice", "alice@business.com");
        Customer vipCustomer = CustomerFactory.createCustomer("VIP", "Bob", "bob@vip.com");
        Customer returningCustomer = CustomerFactory.createCustomer("Returning", "Charlie", "charlie@returning.com");
        Customer frequentCustomer = CustomerFactory.createCustomer("Frequent", "Daisy", "daisy@frequent.com");
        Customer newCustomer = CustomerFactory.createCustomer("New", "Eva", "eva@new.com");

        // Send emails to each customer type
        emailSender.sendEmail(businessCustomer);
        emailSender.sendEmail(vipCustomer);
        emailSender.sendEmail(returningCustomer);
        emailSender.sendEmail(frequentCustomer);
        emailSender.sendEmail(newCustomer);

        // Test invalid email scenario
        Customer invalidCustomer = CustomerFactory.createCustomer("Business", "Invalid", "invalid-email");
        if (invalidCustomer != null) {
            emailSender.sendEmail(invalidCustomer); // Should trigger an invalid email error
        } else {
            System.out.println("Failed to create customer due to invalid email format.");
        }
    }
}
