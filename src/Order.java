import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public class Order {
    private String id;
    private String customerID;
    private List<Product> products;
    private List<Integer> quantities;
    private String date;
    private String status;
    public Order(String customerID, List<Product> products, List<Integer> quantities, String date, String status) {
        id = UUID.randomUUID().toString();
        this.customerID = customerID;
        this.products = products;
        this.quantities = quantities;
        this.date = date;
        this.status = status;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String newCustomerID) {
        this.customerID = newCustomerID;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> newproducts) {
        this.products = newproducts;
    }
    public List<Integer> getQuantities() {
        return quantities;
    }
    public void setQuantities(List<Integer> newquantities) {
        this.quantities = newquantities;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String newdate) {
        this.date = newdate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String newstatus) {
        this.status = newstatus;
    }
    public void displayInfo(){
        System.out.println("    Order ID: " + id);
        System.out.println("        CustomerID: " + customerID);
        System.out.println("        Products: ");
        for(int i = 0; i < products.size(); i++){
            System.out.println("            - " + products.get(i).getName() + "      x " + quantities.get(i));
        }
        System.out.println("        Date: " + date);
        System.out.println("        Status: " + status);
    }
}
