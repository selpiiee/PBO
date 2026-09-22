public class Stock {
    private String productId;
    private int quantity;
    private String shopNo;

    public Stock(String productId, int quantity, String shopNo) {
        this.productId = productId;
        this.quantity = quantity;
        this.shopNo = shopNo;
    }

    public void addStock(int quantity) {
        this.quantity += quantity;
        System.out.println(quantity + " items added to stock");
    }

    public void modifyStock(String productId, int quantity) {
        if (this.productId != null && this.productId.equals(productId)) {
            this.quantity = quantity;
            System.out.println("Stock quantity for Product ID " + productId + " updated");
        } else {
            System.out.println("Product ID " + productId + " not found in stock");
        }
    }

    public Stock seleStock(String productId) {
        if (this.productId != null && this.productId.equals(productId)) {
            return this;
        } else {
            System.out.println("Stock item for Product ID " + productId + "not found");
            return null;
        }
    }

    public void getInfo() {
        System.out.println("----- Stocks Detail -----");
        System.out.println("Product ID\t: " + productId);
        System.out.println("Quantity\t: " + quantity);
        System.out.println("Shop No\t\t: " + shopNo);
        System.out.println("---------------------------");
    }
}
