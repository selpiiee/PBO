public class TripMain {
    public static void main(String[] args) {
        System.out.println("=== DEMO OVERLOADING, OVERRIDING & FINAL ===");

        OpenTripPackage openTrip = new OpenTripPackage("Bromo Sunrise", "Probolinggo", 350000.0, 5);
        
        openTrip.calculateDiscount(); 
        openTrip.displayOpenTripInfo();
        System.out.println();

        System.out.println("=== TEST OVERLOADING (Parent Class) ===");
        TravelPackage generalTrip = new TravelPackage("General Japan Tour", "Tokyo", 15000000.0);
        
        // Memanggil Overloading calculateDiscount(percent, promo)
        generalTrip.calculateDiscount(15.0, "HOLIDAY2026");
        generalTrip.displayPackageInfo();

        System.out.println("\n=== TEST OVERRIDING (Private Trip) ===");
        PrivateTripPackage privateTrip = new PrivateTripPackage("Honeymoon Bali", "Nusa Dua", 8500000.0, "Private Villa & Luxury Car");
        privateTrip.calculateDiscount(); // Memanggil calculateDiscount() versi PrivateTripPackage (Overriding)
        privateTrip.displayPrivateTripInfo();
    }
}