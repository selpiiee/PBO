public class Main {
    public static void main(String[] args) {
        // Inisialisasi Warehouse & Merchandise
        Warehouse gfWarehouse = new Warehouse("GF Central Hub", "Bangkok, Thailand");
        
        Merchandise plushie = new Merchandise("TH01", "Look Khunnoo Hugable Plushie", "Doll", 1190.0, 10);
        Merchandise photocard = new Merchandise("TH02", "GMMTV Exclusive Photocard", "Collectible", 250.0, 50);

        gfWarehouse.addMerchandise(plushie);
        gfWarehouse.addMerchandise(photocard);

        // Check stok awal di warehouse
        gfWarehouse.checkStock();

        // Inisialisasi Customer
        Customer cust = new Customer("Selvy", "selvy@gmail.com", "08123456789");

        // 3. Customer membuat PreOrder
        PreOrder po1 = new PreOrder("PO-2026-001");
        po1.addMerchandise(plushie, 1);
        po1.addMerchandise(photocard, 2);

        cust.createOrder(po1);

        // Display Informasi
        cust.getInfo();
        po1.getInfo();
        
        // Update Status PO
        po1.updateStatus("Shipped to Indonesia");
        System.out.println("Updated Status\t: " + po1.getStatus());

        // Check sisa stok warehouse setelah dibeli
        gfWarehouse.checkStock();
    }
}
