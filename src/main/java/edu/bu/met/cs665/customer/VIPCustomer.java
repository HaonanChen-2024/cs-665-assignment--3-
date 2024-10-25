/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: VIPCustomer.java
 * Description: The VIPCustomer class extends the abstract Customer class.
 * It generates personalized email content for VIP customers.
 */

package edu.bu.met.cs665.customer;

public class VIPCustomer extends Customer {

    /**
     * Constructor for VIPCustomer class.
     *
     * @param name  the name of the VIP customer
     * @param email the email of the VIP customer
     */
    public VIPCustomer(String name, String email) {
        super(name, email);
    }

    /**
     * Generates a personalized email for VIP customers.
     * Uses a constant greeting from StringConstants.
     *
     * @return String containing the email content
     */
    @Override
    public String generateEmail() {
        return StringConstants.VIP_EMAIL_GREETING + " " + name + ",\n" + StringConstants.VIP_EMAIL_BODY;
    }
}
