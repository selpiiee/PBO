package jobsheet2;
public class OvenDemo {
    public static void main(String[] args) {
        Oven oven1 = new Oven();

        oven1.brand = "Mito";
        oven1.color = "Grey";
        oven1.type = "Electric";
        oven1.power = true;
        oven1.temperature = 150;

        oven1.temperatureUp(30);

        oven1.printInfo();
    }
}
