/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: StringConstants.java
 * Description: Contains constant String values used for email content across different customer types,
 * providing a centralized place for managing email templates and other string constants.
 */

package edu.bu.met.cs665.customer;

public final class StringConstants {

    // Email body content for different customer types
    public static final String FREQUENT_EMAIL_BODY =
            "We're incredibly grateful for your continued support! It's our pleasure to have you with us on this journey.";
    public static final String NEW_EMAIL_BODY =
            "Welcome to our community! We're delighted to start this journey with you and look forward to building a lasting relationship.";
    public static final String BUSINESS_EMAIL_BODY =
            "Thank you for choosing us as a trusted partner. We're committed to supporting your business goals and building a prosperous partnership.";
    public static final String RETURNING_EMAIL_BODY =
            "We're excited to have you back! It's wonderful to reconnect, and we're eager to share the latest updates with you.";
    public static final String VIP_EMAIL_BODY =
            "As a valued VIP member, your satisfaction is our priority. Expect exclusive offers, premium service, and a commitment to excellence. Thank you for your trust.";

    // Default greeting
    public static final String DEFAULT_EMAIL_GREETING = "Dear Customer,";
    public static final String BUSINESS_EMAIL_GREETING = "Dear Business Partner,";
    public static final String VIP_EMAIL_GREETING = "Dear VIP Customer,";
    public static final String RETURNING_EMAIL_GREETING ="Dear Returning Customer, ";
    public static final String FREQUENT_EMAIL_GREETING ="Dear Frequent Customer, ";

    //Default other string
    public static final String INVALID_EMAIL_ERROR = "Invalid email format";
    public static final String ERROR_CUSTOMER_MESSAGE = "Error creating customer: ";
    // Prevent instantiation
    private StringConstants() {
        // private constructor to prevent instantiation
    }
}
