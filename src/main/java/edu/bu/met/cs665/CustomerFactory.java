package edu.bu.met.cs665;// CustomerFactory.java
import edu.bu.met.cs665.customer.*;

public class CustomerFactory {

    /**
     * Creates a Customer object based on the type provided.
     * @param type the type of customer ("Business", "VIP", "Returning", "Frequent", "New", etc.)
     * @param name the name of the customer
     * @param email the email of the customer
     * @return a Customer object
     */
    public static Customer createCustomer(String type, String name, String email) {
        try {
            switch (type) {
                case "Business":
                    return new BusinessCustomer(name, email);
                case "VIP":
                    return new VIPCustomer(name, email);
                case "Returning":
                    return new ReturningCustomer(name, email);
                case "Frequent":
                    return new FrequentCustomer(name, email);
                case "New":
                    return new NewCustomer(name, email);
                default:
                    throw new IllegalArgumentException("Unknown customer type: " + type);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(StringConstants.ERROR_CUSTOMER_MESSAGE + e.getMessage());
            return null; // Return null to signify customer creation failure
        }
    }

}
