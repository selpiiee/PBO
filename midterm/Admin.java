public class Admin extends User{
    public void update_vehicle_details(int vehicleId) {
        System.out.println("Updating vehicle details for ID: " + vehicleId);
    }

    public void add_vehicle() {
        System.out.println("New vehicle added.");
    }

    public void retrieve_complain() {
        System.out.println("Retrieving user complaints...");
    }

    public void verify_user() {
        System.out.println("User verified by Admin.");
    }
}
