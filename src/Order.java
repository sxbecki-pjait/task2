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
    private boolean isCustomerLoyal;
    public Order(String customerID, List<Product> products, List<Integer> quantities, String date, String status, boolean isCustomerLoyal) {
        id = UUID.randomUUID().toString();
        this.customerID = customerID;
        this.products = products;
        this.quantities = quantities;
        this.date = date;
        this.status = status;
        this.isCustomerLoyal = isCustomerLoyal;
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
        System.out.println("        Loyal Customer: " + isCustomerLoyal);
        System.out.println("        Products: ");
        for(int i = 0; i < products.size(); i++){
            int chars = 50 - products.get(i).getName().length();
            System.out.print("            - " + products.get(i).getName());
            for(int j = 0; j < chars; j++){
                System.out.print(" ");
            }

            System.out.print("x " + quantities.get(i));
            System.out.println();
        }
        double totalPrice = calculateTotalValue();
        double dsciountVal = applyDiscount(isCustomerLoyal)?Math.round((totalPrice*0.1)*100)/100.0:0;
        double finalPrice = Math.round((totalPrice - dsciountVal)*100)/100.0;
        System.out.println("        Date: " + date);
        System.out.println("        Status: " + status);
        System.out.println("        Total Price w/o Discount: " + totalPrice);
        System.out.println("        Membership Discount: " + dsciountVal);
        System.out.println("        Total Price w/ Discount: " + finalPrice);
        System.out.println();

    }
    public boolean applyDiscount(boolean isLoyal){
        return isLoyal;
    }
    public double calculateTotalValue(){
        double total = 0;
        for(int i = 0; i < products.size(); i++){
            total += products.get(i).getPrice() * quantities.get(i);
        }
        total = total * 100;
        return Math.round(total)/100.0;
    }
}
