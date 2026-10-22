public class CoffeeTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Americano", 20000);
        Latte latte = new Latte("Latte", 23000, 150);

        ButterscotshLatte butterscotch = new ButterscotshLatte("Butterscotch Latte", 28000, 150, 30);

        coffee.brew();
        latte.brew();
        butterscotch.brew();

        System.out.println();

        System.out.println("Price: Rp" + butterscotch.calculatePrice());
        System.out.println("Total for 3 cups: Rp" + butterscotch.calculatePrice(3));

    }
}
