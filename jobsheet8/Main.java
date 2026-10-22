package jobsheet8;

public class Main {
    public static void main(String[] args) {
        Coffee americano = new Americano(3);
        americano.displayInfo();
        americano.brew();
        americano.price();

        System.out.println("-------------------");

        Latte latte = new Latte(2, 150);
        latte.displayInfo();
        latte.brew();
        latte.addMilk();
        latte.price();
    }
}
