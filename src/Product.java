import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.time.LocalDateTime;
import java.util.UUID;

public class Product {
    private String name;
    private String id;
    private String category;
    private double price;
    private int stockQuantity;
    public Product(String newName, double newPrice, String newCategory, int newStockQuantity) {
        name = newName;
        id = UUID.randomUUID().toString();
        category = newCategory;
        price = newPrice;
        stockQuantity = newStockQuantity;

    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setId(String newId) {
        id = newId;
    }
    public void setCategory(String newCategory) {
        category = newCategory;
    }
    public void setPrice(double newPrice) {
        price = newPrice;
    }
    public void setStockQuantity(int newStockQuantity) {
        stockQuantity = newStockQuantity;
    }

    public void displayInfo(){
        System.out.println("    Product ID: " + id);
        System.out.println("        Name: " + name);
        System.out.println("        Category: " + category);
        System.out.println("        Price: " + price);
        System.out.println("        Stock Quantity: " + stockQuantity);
        System.out.println();
    }

}
