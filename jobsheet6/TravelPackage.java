public class TravelPackage {
    // Attributes (Private - sesuai simbol '-' pada UML)
    private String packageName;
    private String destination;
    private double price;

    // 1. Parameterless Constructor
    public TravelPackage() {
        this.packageName = "Unknown Package";
        this.destination = "Unknown Destination";
        this.price = 0.0;
    }

    // 2. Parameterized Constructor (Overloading)
    public TravelPackage(String packageName, String destination, double price) {
        this.packageName = packageName;
        this.destination = destination;
        this.price = price;
    }

    // Method sesuai UML (+ displayPackageInfo(): void)
    public void displayPackageInfo() {
        System.out.println("Package Name : " + packageName);
        System.out.println("Destination  : " + destination);
        System.out.println("Price        : $" + price);
    }

    // Getter dan Setter untuk mengubah/mengakses atribut dari luar
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}