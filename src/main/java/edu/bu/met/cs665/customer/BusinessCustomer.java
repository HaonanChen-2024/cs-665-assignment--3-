/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: BusinessCustomer.java
 * Description: The BusinessCustomer class extends the abstract Customer class.
 * It generates personalized email content for business customers.
 */

package edu.bu.met.cs665.customer;

public class BusinessCustomer extends Customer {

    /**
     * Constructor for BusinessCustomer class.
     *
     * @param name  the name of the business customer
     * @param email the email of the business customer
     */
    public BusinessCustomer(String name, String email) {
        super(name, email);
    }

    /**
     * Generates a personalized email for business customers.
     * Uses a constant greeting from StringConstants.
     *
     * @return String containing the email content
     */
    @Override
    public String generateEmail() {
        return StringConstants.BUSINESS_EMAIL_GREETING + " " + name + ",\n" + StringConstants.BUSINESS_EMAIL_BODY;
    }
}
