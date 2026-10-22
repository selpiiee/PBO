public class Latte extends Coffee {
    public int milkAmount;

    public Latte(String name, double price, int milkAmount) {
        super(name, price);
        this.milkAmount = milkAmount;
    }

    @Override 
    public void brew() {
        System.out.println("Brewing a latte with steamed milk");
    }
}
