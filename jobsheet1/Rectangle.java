package jobsheet1;
public class Rectangle {
    public int rlong;
    public int rwide;

    public int getArea() {
        return rlong * rwide;
    }

    public int getCircumference() {
        return 2 * (rlong + rwide);
    }

    public void displayInfo(){
        System.out.println("Long\t\t: " + rlong);
        System.out.println("Wide\t\t: " + rwide);
        System.out.println("Area\t\t: " + getArea());
        System.out.println("Circumference\t: " + getCircumference());
    }
}