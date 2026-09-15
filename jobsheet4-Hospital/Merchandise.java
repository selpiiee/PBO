public class Merchandise {
    private String itemCode;
    private String name;
    private String category;
    private double price;
    private int stock;

    public Merchandise(String itemCode, String name, String category, double price, int stock) {
        this.itemCode = itemCode;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int qty) {
        this.stock += qty;
    }

    public void reduceStok(int qty) {
        if (this.stock >= qty) {
            this.stock -= qty;
        } else {
            System.out.println("Stock insufficient for " + this.name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice(){
        return price;
    }

    public void getInfo() {
        System.out.println("item Code\t: " + itemCode);
        System.out.println("Name\t: " + name);
        System.out.println("category\t: " + category);
        System.out.println("Price\t: " + price);
        System.out.println("Stock\t: " + stock);
        System.out.println("------------------------------");
    }
}
