import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ComputerStore store = new ComputerStore();
        Product p1 = new Product("Nike Air Force 1 white IOS limited edition", 399.99,"merchandise", 80);
        Product p2 = new Product("APPLE MacBook Pro 2024 16\"", 15999.99,"laptops", 100);
        Product p3 = new Product("JBL Tune 770NC ANC", 299.99,"headphones", 50);
        Product p4 = new Product("Acer Nitro 5 17,1\'", 4999.99,"laptops", 40);

        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);
        store.addProduct(p4);

        Customer c1 = new Customer("Pawel", "Sobecki", "s33693@pjwstk.edu.pl", false);
        Customer c2 = new Customer("John", "Doe", "jdoe@gmail.com", false);
        Customer c3 = new Customer("Dominic", "Toretto", "dtoretto@gmail.com", false);

        List<Product> products = new ArrayList<>();
        List<Integer> quantities = new ArrayList<>();

        products.add(p1);
        quantities.add(1);
        products.add(p4);
        quantities.add(2);
        products.add(p3);
        quantities.add(3);

        store.createOrder(c1, products, quantities);

        products = new ArrayList<>();
        quantities = new ArrayList<>();

        products.add(p4);
        quantities.add(4);
        products.add(p1);
        quantities.add(5);

        store.createOrder(c2, products, quantities);

        products = new ArrayList<>();
        quantities = new ArrayList<>();
        products.add(p3);
        quantities.add(3);
        products.add(p2);
        quantities.add(2);
        store.createOrder(c3, products, quantities);

        products = new ArrayList<>();
        quantities = new ArrayList<>();

        products.add(p2);
        quantities.add(2);
        products.add(p3);
        quantities.add(2);

        store.createOrder(c2, products, quantities);

        store.changeOrderStatus(store.getOrders().get(0).getId());

        store.displayInfo();

//        display customer orders
        store.displayCustomerOrders(c2.getId());
        store.displayProductsInCategory("laptops");

    }
}