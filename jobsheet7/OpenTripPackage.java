public class OpenTripPackage extends TravelPackage {
    private int minQuota;

    public OpenTripPackage() {
        super();
    }

    public OpenTripPackage(String packageName, String destination, double price, int minQuota) {
        super(packageName, destination, price);
        this.minQuota = minQuota;
    }

    public int getMinQuota() {
        return minQuota;
    }

    public void setMinQuota(int minQuota) {
        this.minQuota = minQuota;
    }

    public void displayOpenTripInfo() {
        super.displayPackageInfo();
        System.out.println("Min. Quota   : " + minQuota + " people");
    }

    // Overriding Method
    @Override
    public void calculateDiscount() {
        this.discount = this.price * 0.10; // Diskon 10%
    }
}