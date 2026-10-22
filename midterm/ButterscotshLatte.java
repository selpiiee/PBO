
public class ButterscotshLatte extends Latte {

    public int syrupAmount;

    public ButterscotshLatte(String name, double price, int milkAmount, int syrupAmount) {
        super(name, price, milkAmount);
        this.syrupAmount = syrupAmount;
    }

    @Override 
    public void brew() {
        System.out.println("Brewing a butterscotch latte with milk and syrup");
    }

    public void addButterscotchSyrup() {
        System.out.println("Adding" + syrupAmount + "ml of butterscotch");
    }
}
