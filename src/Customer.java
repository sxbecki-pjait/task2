import java.time.LocalDateTime;

public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean isLoyalCustomer;
    public Customer(String firstName, String lastName, String email, boolean isLoyalCustomer) {
        id = firstName.charAt(0) + lastName + LocalDateTime.now().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isLoyalCustomer = isLoyalCustomer;

    }
}
