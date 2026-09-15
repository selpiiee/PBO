
import java.time.LocalDate;
import java.util.ArrayList;

public class PreOrder {
    private String orderCode;
    private LocalDate orderDate;
    private String status;
    private ArrayList<Merchandise> merchandiseList;

    public PreOrder(String orderCode) {
        this.orderCode = orderCode;
        this.orderDate = LocalDate.now();
        this.status = "Pending";
        this.merchandiseList = new ArrayList<>();
    }

    public void addMerchandise(Merchandise merch, int qty) {
        if (merch.getStock() >= qty) {
            for (int i = 0; i < qty; i++) {
                merchandiseList.add(merch);
            }
            merch.reduceStok(qty);
        } else {
            System.out.println("Failed to add " + merch.getName()  + "due to insufficient stock.");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Merchandise merch : merchandiseList) {
            total += merch.getPrice();
        }
        return total;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public void getInfo() {
        System.out.println("Order Code\t: " + orderCode);
        System.out.println("Order Date\t: " + orderDate);
        System.out.println("Status\t\t: " + status);
        System.out.println("Items Ordered\t: ");
        for (Merchandise merch : merchandiseList) {
            System.out.println(" - " + merch.getName() + " (THB " + merch.getPrice() + ")");
        }
        System.out.println("Total Price: THB " + calculateTotal());
        System.out.println("---------------------------------");
    }
}
