import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.time.LocalDateTime;

public class Product {
    public String name;
    public String id;
    public String category;
    public double price;
    public int stockQuantity;
    public Product(String newName, double newPrice, String newCategory, int newStockQuantity) {
        name = newName;
        id = LocalDateTime.now().toString();


    }
}
