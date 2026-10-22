package jobsheet8;

public class Americano extends Coffee {
    public Americano(int shot) {
        super(shot);
    }

    @Override 
    public void brew() {
        System.out.println("Brewing Americano with " + shot + " shots of espresso.");
    }

    @Override 
    public void price() {
        System.out.println("Price of Americano calculated.");
    }
}
