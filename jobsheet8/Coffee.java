package jobsheet8;

public abstract class Coffee {
    protected int shot;

    public Coffee(int shot) {
        this.shot = shot;
    }

    public abstract void brew();
    public abstract void price();

    public void displayInfo() {
        System.out.println("Coffee shot amount" + shot);
    }
}
