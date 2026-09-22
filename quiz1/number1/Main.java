

public class Main {
    public static void main(String[] args) {
        System.out.println("ORDER PROCESSING SYSTEM");
        System.out.println("--------------------------\n");

        //Make and Display Customer Data
        Customer cust1 = new Customer("CUST-001", "Selvy", "Kepanjen", "081234567890");
        cust1.getInfo();
        System.out.println();

        //Make Data for Product and Stock
        Product product1 = new Product("PRO-001", "Laptop Lenovo Yoga Slim 7i", 19000000, "Electronic");
        Product product2 = new Product("PRO-002", "Mouse Wireless", 250000, "Accessories");

        Stock stock1 = new Stock(product1.getProductId(), 10, "SHOP A");

        product1.getInfo();
        System.out.println();
        stock1.getInfo();
        System.out.println();

        //Make a Transaksi Order
        Order order1 = new Order("ORD-2026-001", cust1.getCustomerId());
        order1.createOrder();

        order1.addProduct(product1);
        order1.addProduct(product2);

        stock1.addStock(-1);
        System.out.println();

        //Display information 
        order1.getInfo();
        System.out.println();

        //Select & Edit Method
        product1.selectProduct("PRO-001");
        System.out.println();
        cust1.editCustomer("Nana", "Malang", "089511442424");
        cust1.getInfo();
    }
}
