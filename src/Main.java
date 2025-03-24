import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ComputerStore store = new ComputerStore();
        Product p1 = new Product("Nike Air Force 1 white IOS limited edition", 399.99,"merchandise", 10);
        Product p2 = new Product("APPLE MacBook Pro 2024 16\"", 16000,"laptops", 10);
        Product p3 = new Product("JBL Tune 770NC ANC", 300,"headphones", 10);
        Product p4 = new Product("Acer Nitro 5 17,1\'", 5000,"laptops", 10);

        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);
        store.addProduct(p4);

        store.displayInfo();

        Customer c1 = new Customer("Pawel", "Sobecki", "s33693@pjwstk.edu.pl", false);
        Customer c2 = new Customer("John", "Doe", "jdoe@gmail.com", false);
        Customer c3 = new Customer("Dominic", "Toretto", "dtoretto@gmail.com", false);

        List<Product> products = new ArrayList<Product>();
        List<Integer> quantities = new ArrayList<Integer>();

        products.add(p1);
        quantities.add(1);
        products.add(p4);
        quantities.add(2);
        products.add(p3);
        quantities.add(3);

        store.createOrder(c2, products, quantities);

        products.clear();
        quantities.clear();

        products.add(p4);
        quantities.add(4);
        products.add(p1);
        quantities.add(5);

        store.createOrder(c1, products, quantities);
        store.displayInfo();

    }
}