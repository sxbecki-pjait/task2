import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.time.LocalDateTime;

public class Product {
    private String name;
    private String id;
    private String category;
    private double price;
    private int stockQuantity;
    public Product(String newName, double newPrice, String newCategory, int newStockQuantity) {
        name = newName;
        id = LocalDateTime.now().toString();

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


}
