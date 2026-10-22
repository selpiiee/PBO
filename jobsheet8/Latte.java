package jobsheet8;

public class Latte extends Coffee{
    private int milkAmount;

    public Latte(int shot, int milkAmount) {
        super(shot);
        this.milkAmount = milkAmount;
    }

    @Override
    public void brew() {
        System.out.println("Brewing Latte with " + shot + " shots of espresso.");
    }

    @Override
    public void price() {
        System.out.println("Price of Latte calculated.");
    }

    public void addMilk() {
        System.out.println("Adding " + milkAmount + " ml of milk to the Latte.");
    }
}
