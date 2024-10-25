/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: FrequentCustomer.java
 * Description: The FrequentCustomer class extends the abstract Customer class.
 * It generates personalized email content for frequent customers.
 */

package edu.bu.met.cs665.customer;


public class FrequentCustomer extends Customer {

    /**
     * Constructor for FrequentCustomer class.
     *
     * @param name  the name of the frequent customer
     * @param email the email of the frequent customer
     */
    public FrequentCustomer(String name, String email) {
        super(name, email);
    }

    /**
     * Generates a personalized email for frequent customers.
     * Uses a constant greeting from StringConstants.
     *
     * @return String containing the email content
     */
    @Override
    public String generateEmail() {
        return StringConstants.FREQUENT_EMAIL_GREETING + name + ",\n" + StringConstants.FREQUENT_EMAIL_BODY;
    }
}
