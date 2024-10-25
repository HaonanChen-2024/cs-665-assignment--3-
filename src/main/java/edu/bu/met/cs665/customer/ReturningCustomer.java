/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: ReturningCustomer.java
 * Description: The ReturningCustomer class extends the abstract Customer class.
 * It generates personalized email content for returning customers.
 */

package edu.bu.met.cs665.customer;

public class ReturningCustomer extends Customer {

    /**
     * Constructor for ReturningCustomer class.
     *
     * @param name  the name of the returning customer
     * @param email the email of the returning customer
     */
    public ReturningCustomer(String name, String email) {
        super(name, email);
    }

    /**
     * Generates a personalized email for returning customers.
     * Uses a constant greeting from StringConstants.
     *
     * @return String containing the email content
     */
    @Override
    public String generateEmail() {
        return StringConstants.RETURNING_EMAIL_GREETING + name + ",\n" + StringConstants.RETURNING_EMAIL_BODY;
    }
}
