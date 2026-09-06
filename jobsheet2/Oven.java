package jobsheet2;

public class Oven {
    public String brand;
    public String color;
    public String type;
    public boolean power;
    public int temperature;

    public void powerMode(boolean status) {
        power = status;
    }

    public int temperatureUp(int increment) {
        temperature += increment;
        return temperature;
    }

    public int temperatureDown(int decrement) {
        temperature -= decrement;
        return temperature;
    }

    public void printInfo() {
        System.out.println("Brand\t\t: " + brand);
        System.out.println("Color\t\t: " + color);
        System.out.println("Type\t\t: " + type);
        System.out.println("Power\t\t: " + power);
        System.out.println("Temperature\t: " + temperature);
    }
} 