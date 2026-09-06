package jobsheet2;

public class Barang {
    public String code;
    public String name;
    public double grossPrice;
    public double discount;

    public double getNetPrice() {
        return grossPrice - discount * grossPrice;
    }

    public void displayInfo() {
        System.out.println("Code\t\t\t: " + code);
        System.out.println("Name\t\t\t: " + name);
        System.out.println("Gross Price\t\t: " + grossPrice);
        System.out.println("Discount\t\t: " + discount);
        System.out.println("Net Price\t\t: " + getNetPrice());
    }
 }
