public class PrivateTripPackage extends TravelPackage {
    // Additional Attribute (Private - sesuai simbol '-' pada UML)
    private String exclusiveFacility;

    // 1. Parameterless Constructor
    public PrivateTripPackage() {
        super(); // Memanggil superclass constructor tanpa parameter
        this.exclusiveFacility = "None";
    }

    // 2. Parameterized Constructor (Overloading & super-constructor)
    public PrivateTripPackage(String packageName, String destination, double price, String exclusiveFacility) {
        super(packageName, destination, price); // Memanggil superclass constructor berparameter
        this.exclusiveFacility = exclusiveFacility;
    }

    // Method sesuai UML (+ displayPrivateTripInfo(): void)
    public void displayPrivateTripInfo() {
        super.displayPackageInfo(); // Memanggil method milik parent class
        System.out.println("Facility     : " + exclusiveFacility);
    }

    // Getter dan Setter untuk exclusiveFacility
    public String getExclusiveFacility() {
        return exclusiveFacility;
    }

    public void setExclusiveFacility(String exclusiveFacility) {
        this.exclusiveFacility = exclusiveFacility;
    }
}