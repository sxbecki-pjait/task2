import java.time.LocalDateTime;
import java.util.UUID;

public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean isLoyalCustomer;
    public Customer(String newFirstName, String newLastName, String newEmail, boolean newIsLoyalCustomer) {
        id = UUID.randomUUID().toString();
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.email = newEmail;
        this.isLoyalCustomer = newIsLoyalCustomer;
    }

    public String getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public boolean isLoyalCustomer() {
        return isLoyalCustomer;
    }
    public void setLoyalCustomer(boolean isLoyalCustomer) {
        this.isLoyalCustomer = isLoyalCustomer;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void displayInfo() {
//        System.out.println("    First Name: " + firstName);
//        System.out.println("    Last Name: " + lastName);
//        System.out.println("    Email: " + email);
//        System.out.println("    IsLoyalCustomer: " + isLoyalCustomer);
        System.out.println("    " + firstName + " " + lastName + " " + email + " " + isLoyalCustomer + " " + id);
    }

}
