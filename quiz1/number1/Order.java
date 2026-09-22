
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private String orderId;
    private String customerId;
    private double amount;
    private LocalDateTime orderDate;
    private ArrayList<Product> productList;

    public Order (String orderId, String customerId) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.amount = 0.0;
        this.orderDate = LocalDateTime.now();
        this.productList = new ArrayList<>();
    }

    public String getOrderId() {
        return orderId;
    }

    public void createOrder() {
        System.out.println("Order " + orderId + " successfully created on " + orderDate);
    }

    public void addProduct(Product product) {
        this.productList.add(product);
        this.amount += product.getProductPrice();
    }

    public void editOrder() {
        this.orderDate = LocalDateTime.now();
        System.out.println("Order " + orderId + " updated");
    }

    public void getInfo() {
        System.out.println("----- Detail Order -----");
        System.out.println("Order ID\t: " + orderId);
        System.out.println("Customer ID\t: " + customerId);
        System.out.println("Order Date\t: " + orderDate);
        System.out.println("Total Amount\t: Rp" + String.format("%,.0f", amount));
        System.out.println("Products List: ");
        System.out.println("---------------------------");
        
        for (Product p : productList) {
            System.out.println(" -" + p.getProductName() + " | Price: Rp" + String.format("%,.0f", p.getProductPrice()));
        }
    }
}
