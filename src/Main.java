import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ComputerStore store = new ComputerStore();
        Product p1 = new Product("Nike Air Force 1 white IOS limited edition", 399.99,"merchandise", 46);
        Product p2 = new Product("APPLE MacBook Pro 2024 16\"", 16000,"laptops", 12);
        Product p3 = new Product("JBL Tune 770NC ANC", 300,"headphones", 12);
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);
        Customer c1 = new Customer("Pawel", "Sobecki", "s33693@pjwstk.edu.pl", true);
        List<Product> products = new ArrayList<Product>();
        List<Integer> quantities = new ArrayList<Integer>();
        products.add(p1);
        quantities.add(1);
        products.add(p2);
        quantities.add(1);
        products.add(p3);
        quantities.add(8);

        store.displayInfo();
        store.createOrder(c1, products, quantities);
        store.displayInfo();

    }
}