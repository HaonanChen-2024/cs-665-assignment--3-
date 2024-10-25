/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: CustomerTest.java
 * Description: Unit tests for customer types and email sending functionality.
 * Verifies correct email content generation and error handling.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.BusinessCustomer;
import edu.bu.met.cs665.customer.VIPCustomer;
import edu.bu.met.cs665.customer.ReturningCustomer;
import edu.bu.met.cs665.customer.FrequentCustomer;
import edu.bu.met.cs665.customer.NewCustomer;
import edu.bu.met.cs665.EmailSender;
import edu.bu.met.cs665.customer.StringConstants;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void testBusinessCustomerEmail() {
        BusinessCustomer customer = new BusinessCustomer("Alice", "alice@business.com");
        String expectedEmail = StringConstants.BUSINESS_EMAIL_GREETING + " Alice,\n" + StringConstants.BUSINESS_EMAIL_BODY;
        assertEquals(expectedEmail, customer.generateEmail());
    }

    @Test
    public void testVIPCustomerEmail() {
        VIPCustomer customer = new VIPCustomer("Bob", "bob@vip.com");
        String expectedEmail = StringConstants.VIP_EMAIL_GREETING + " Bob,\n" + StringConstants.VIP_EMAIL_BODY;
        assertEquals(expectedEmail, customer.generateEmail());
    }

    @Test
    public void testReturningCustomerEmail() {
        ReturningCustomer customer = new ReturningCustomer("Charlie", "charlie@returning.com");
        String expectedEmail = StringConstants.RETURNING_EMAIL_GREETING + "Charlie,\n" + StringConstants.RETURNING_EMAIL_BODY;
        assertEquals(expectedEmail, customer.generateEmail());
    }

    @Test
    public void testFrequentCustomerEmail() {
        FrequentCustomer customer = new FrequentCustomer("Daisy", "daisy@frequent.com");
        String expectedEmail = StringConstants.FREQUENT_EMAIL_GREETING + " Daisy,\n" + StringConstants.FREQUENT_EMAIL_BODY;
        assertEquals(expectedEmail, customer.generateEmail());
    }

    @Test
    public void testNewCustomerEmail() {
        NewCustomer customer = new NewCustomer("Eva", "eva@new.com");
        String expectedEmail = StringConstants.DEFAULT_EMAIL_GREETING + " Eva,\n" + StringConstants.NEW_EMAIL_BODY;
        assertEquals(expectedEmail, customer.generateEmail());
    }
}
