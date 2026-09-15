import java.util.ArrayList;

public class Warehouse {
    private String warehouseName;
    private String location;
    private ArrayList<Merchandise> inventory;

    public Warehouse(String warehouseName, String location) {
        this.warehouseName = warehouseName;
        this.location = location;
        this.inventory = new ArrayList<>();
    }

    public String getLocation() {
        return location;
    }

    public void addMerchandise(Merchandise merch) {
        inventory.add(merch);
    }

    public void checkStock() {
        System.out.println("=== Warehouse Inventory: " + warehouseName + " (" + location + ") ===");
        for (Merchandise merch : inventory) {
            System.out.println("Item\t: " + merch.getName() + "\t| Stock\t: " + merch.getStock());
        }
        System.out.println("---------------------------------");
    }
}
