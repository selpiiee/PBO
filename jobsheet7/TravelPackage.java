public class TravelPackage {
    public String packageName;
    public String destination;
    public double price;
    public double discount;
   
    private static final double TAX_RATE = 0.11;

    public TravelPackage() {
    }

    public TravelPackage(String packageName, String destination, double price) {
        this.packageName = packageName;
        this.destination = destination;
        this.price = price;
        this.discount = 0.0;
    }

    public void displayPackageInfo() {
        double taxAmount = price * TAX_RATE;
        double totalPrice = (price - discount) + taxAmount;

        System.out.println("Package Name : " + packageName);
        System.out.println("Destination  : " + destination);
        System.out.println("Price        : Rp " + String.format("%.0f", price));
        System.out.println("Discount     : Rp " + String.format("%.0f", discount));
        System.out.println("Tax (11%)    : Rp " + String.format("%.0f", taxAmount));
        System.out.println("Final Price  : Rp " + String.format("%.0f", totalPrice));
    }

    public void calculateDiscount() {
        this.discount = 0.0;
    }

    public void calculateDiscount(double percent) {
        this.discount = this.price * (percent / 100);
    }

    public void calculateDiscount(double percent, String promo) {
        this.discount = this.price * (percent / 100);
        System.out.println("Applied Promo Code: " + promo);
    }
}
