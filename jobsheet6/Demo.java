public class Demo {
    public static void main(String[] args) {
        System.out.println("=== 1. OBJEK DENGAN PARAMETERLESS CONSTRUCTOR ===");
        OpenTripPackage trip1 = new OpenTripPackage();
        trip1.displayOpenTripInfo();

        System.out.println("\n=== 2. OBJEK DENGAN PARAMETERIZED CONSTRUCTOR ===");
        OpenTripPackage trip2 = new OpenTripPackage("Bromo Sunrise Tour", "Probolinggo", 50.0, 6);
        PrivateTripPackage trip3 = new PrivateTripPackage("Bali Honeymoon", "Nusa Dua", 600.0, "Luxury Car & Gala Dinner");

        System.out.println("--- Open Trip ---");
        trip2.displayOpenTripInfo();

        System.out.println("\n--- Private Trip ---");
        trip3.displayPrivateTripInfo();

        System.out.println("\n=== 3. MODIFIKASI NILAI ATRIBUT OBJEK ===");
        // Mengubah atribut yang diwarisi dari Parent Class (price) dan Atribut Child Class (minQuota)
        trip2.setPrice(45.0);
        trip2.setMinQuota(10);

        System.out.println("--- Setelah Modifikasi (Open Trip) ---");
        trip2.displayOpenTripInfo();
    }
}