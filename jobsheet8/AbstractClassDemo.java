package jobsheet8;

public class AbstractClassDemo {
    public static void main(String[] args) {
        // Menguji objek Lebah
        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        System.out.println("=== INFO LEBAH ===");
        lebah1.cetakInfo();
        System.out.println("--- Cara Bergerak ---");
        lebah1.bergerak();
        System.out.println("--- Cara Bernapas ---");
        lebah1.bernapas();

        System.out.println("\n==================================\n");

        // Menguji objek Ular
        Ular ular1 = new Ular(true, 2.5, "Daging", "Semak-semak");
        System.out.println("=== INFO ULAR ===");
        ular1.cetakInfo();
        System.out.println("--- Cara Bergerak ---");
        ular1.bergerak();
        System.out.println("--- Cara Bernapas ---");
        ular1.bernapas();

    }
}