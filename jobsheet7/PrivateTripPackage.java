public class PrivateTripPackage extends TravelPackage {
    private String exclusiveFacility;

    // Constructors
    public PrivateTripPackage() {
        super();
    }

    public PrivateTripPackage(String packageName, String destination, double price, String exclusiveFacility) {
        super(packageName, destination, price);
        this.exclusiveFacility = exclusiveFacility;
    }

    public String getExclusiveFacility() {
        return exclusiveFacility;
    }

    public void setExclusiveFacility(String exclusiveFacility) {
        this.exclusiveFacility = exclusiveFacility;
    }

    public void displayPrivateTripInfo() {
        super.displayPackageInfo();
        System.out.println("Facility     : " + exclusiveFacility);
    }

    @Override
    public void calculateDiscount() {
        this.discount = this.price * 0.05;
    }
}