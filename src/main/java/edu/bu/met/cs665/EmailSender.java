/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: EmailSender.java
 * Description: Simulates email sending functionality by printing email content to the console.
 * It validates email format and outputs an error message if the email format is invalid.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.Customer;
import edu.bu.met.cs665.customer.StringConstants;

public class EmailSender {

    /**
     * Sends an email by printing the generated email content to the console.
     * Validates the customer's email format before sending.
     *
     * @param customer the customer for whom the email is generated
     */
    public void sendEmail(Customer customer) {
        // Validate email format before "sending"
        if (!isValidEmail(customer.getEmail())) {
            System.out.println(StringConstants.INVALID_EMAIL_ERROR);
            return;
        }

        // Generate and print email content
        String emailContent = customer.generateEmail();
        System.out.println("Sending email to: " + customer.getEmail());
        System.out.println("Email content:\n" + emailContent);
    }

    /**
     * Helper method to validate email format using regex.
     *
     * @param email the email address to validate
     * @return true if the email is valid, false otherwise
     */
    private boolean isValidEmail(String email) {
        return email.matches("[\\w-\\.]+@[\\w-]+\\.[a-z]{2,7}");
    }
}
