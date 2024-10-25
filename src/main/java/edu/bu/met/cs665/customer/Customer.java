/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: Customer.java
 * Description: This abstract Customer class acts as a blueprint for various customer types.
 * It includes basic details such as name and email, and enforces implementation of
 * a method for generating personalized emails.
 */

package edu.bu.met.cs665.customer;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public abstract class Customer {
    protected String name;
    protected String email;

    // Regular expression for validating email addresses
    private static final String EMAIL_PATTERN =
            "^[\\w-\\.]+@[\\w-]+\\.[a-z]{2,7}$";

    /**
     * Constructor for Customer.
     * Validates the provided email and initializes the name and email fields.
     *
     * @param name  Customer's name
     * @param email Customer's email address, validated at instantiation
     * @throws IllegalArgumentException if the email format is invalid
     */
    public Customer(String name, String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException(StringConstants.INVALID_EMAIL_ERROR);
        }
        this.name = name;
        this.email = email;
    }

    /**
     * Validates the format of an email address.
     *
     * @param email the email to validate
     * @return true if the email format is valid, false otherwise
     */
    private boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * Abstract method to generate customized email content for the customer.
     * Implementations must provide specific email content for each customer type.
     *
     * @return A string representing the personalized email content.
     */
    public abstract String generateEmail();

    /**
     * Retrieves the email address of the customer.
     *
     * @return Customer's email address
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Retrieves the name of the customer.
     *
     * @return Customer's name
     */
    public String getName() {
        return this.name;
    }
}
