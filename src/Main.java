import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Nike Air Force 1 white", 399.99,"clothes", 46);
        Customer c1 = new Customer("Pawel", "Sobecki", "s33693@pjwstk.edu.pl", true);
        List<Product> products = new ArrayList<Product>();
        products.add(p1);
        List<Integer> quantities = new ArrayList<Integer>();
        quantities.add(2);
        Order o1 = new Order(c1.getId(), products, quantities, LocalDateTime.now().toString(), "preparing...");
        System.out.println(c1.getId());
        System.out.println(p1);
        o1.displayInfo();
    }
}