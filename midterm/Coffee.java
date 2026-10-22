public class Coffee {
    public String name;
    public double price;

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void brew() {
        System.out.println("Brewing coffee");
    }

    public double calculatePrice() {
        return price;
    }

    public double calculatePrice(int qty) {
        return price * qty;
    }
}