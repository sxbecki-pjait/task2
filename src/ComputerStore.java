import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ComputerStore {
    private List<Product> offeredProducts;
    private List<Customer> customers;
    private List<Order> orders;
    private int productCount;
    private int customerCount;
    private int orderCount;
    public ComputerStore() {
        this.offeredProducts = new ArrayList<Product>();
        this.customers = new ArrayList<Customer>();
        this.customerCount = 0;
        this.orderCount = 0;
        this.productCount = 0;
        this.orders = new ArrayList<Order>();
    }

    public void addProduct(Product product) {
        offeredProducts.add(product);
        productCount++;
        System.out.println("Added Product! " + product.getName());
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void createOrder(Customer customer, List<Product> products, List<Integer> quantities) {
        Order o = new Order(customer.getId(), products, quantities, LocalDateTime.now().toString(), "In Progress");
        updateStockAfterOrder(o);
        orders.add(o);
        orderCount++;
        if (!customers.contains(customer)){
            customerCount++;
            addCustomer(customer);
        }
        System.out.println("Created Order!");
    }

    public boolean updateStockAfterOrder(Order orderNow) {
        boolean result = true;
        int counter = 0;
        for(Product p : orderNow.getProducts()){
            String id = p.getId();
            for(Product pOnStock : offeredProducts){
                if(pOnStock.getId().equals(id)){
                    if(pOnStock.getStockQuantity() - orderNow.getQuantities().get(counter) <=-1){
                        System.out.println("Not enough stock!");
                        result = false;
                        break;
                    }
                    pOnStock.setStockQuantity(pOnStock.getStockQuantity() - orderNow.getQuantities().get(counter));
                    counter++;
                }
            }
        }
        return result;
    }
    public void displayInfo(){
        System.out.println();
        System.out.println();
        System.out.println("===========================================");
        System.out.println("Customers: ");
        for(Customer customer : customers) {
            customer.displayInfo();
        }
        System.out.println();
        System.out.println("Orders: ");
        for (int i = 0; i < orders.size(); i++) {
            orders.get(i).displayInfo();
        }
        System.out.println();
        System.out.println("Products available: ");
        for(Product product : offeredProducts) {
            product.displayInfo();
        }
        System.out.println();
        System.out.println("Order count: " + orderCount);
        System.out.println("===========================================");
        System.out.println();
        System.out.println();
    }
    public void changeOrderStatus(String orderID, String newStatus) {
        for(Order order : orders) {
            if(order.getId().equals(orderID)) {
                order.setStatus(newStatus);
            }
        }
    }
    public void displayProductsInCategory(String category) {
        for(Product product : offeredProducts) {
            if(product.getCategory().equals(category)) {
                product.displayInfo();
            }
        }
    }
    public void displayCustomerOrders(String customerID) {
        for(Order order : orders) {
            if(customerID.equals(order.getCustomerID())) {
                order.displayInfo();
            }
        }
    }
}
