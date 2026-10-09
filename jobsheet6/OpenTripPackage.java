public class OpenTripPackage extends TravelPackage {
    // Additional Attribute (Private - sesuai simbol '-' pada UML)
    private int minQuota;

    // 1. Parameterless Constructor
    public OpenTripPackage() {
        super(); // Memanggil superclass constructor tanpa parameter
        this.minQuota = 0;
    }

    // 2. Parameterized Constructor (Overloading & super-constructor)
    public OpenTripPackage(String packageName, String destination, double price, int minQuota) {
        super(packageName, destination, price); // Memanggil superclass constructor berparameter
        this.minQuota = minQuota;
    }

    // Method sesuai UML (+ displayOpenTripInfo(): void)
    public void displayOpenTripInfo() {
        super.displayPackageInfo(); // Memanggil method milik parent class
        System.out.println("Min. Quota   : " + minQuota + " people");
    }

    // Getter dan Setter untuk minQuota
    public int getMinQuota() {
        return minQuota;
    }

    public void setMinQuota(int minQuota) {
        this.minQuota = minQuota;
    }
}