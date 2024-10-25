/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: NewCustomer.java
 * Description: The NewCustomer class extends the abstract Customer class.
 * It generates personalized email content for new customers.
 */

package edu.bu.met.cs665.customer;


public class NewCustomer extends Customer {

    /**
     * Constructor for NewCustomer class.
     *
     * @param name  the name of the new customer
     * @param email the email of the new customer
     */
    public NewCustomer(String name, String email) {
        super(name, email);
    }

    /**
     * Generates a personalized email for new customers.
     * Uses a constant greeting from StringConstants.
     *
     * @return String containing the email content
     */
    @Override
    public String generateEmail() {
        return StringConstants.DEFAULT_EMAIL_GREETING + " " + name + ",\n" + StringConstants.NEW_EMAIL_BODY;
    }
}
