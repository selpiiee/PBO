public class Main {
    public static void main(String[] args) {
        System.out.println("=== CUSTOMER ====");
        Customer customer = new Customer();
        customer.log_in(101, "password123");
        customer.apply_verification("ktp.jpg");
        System.out.println("Status Verifikasi: " + customer.get_verification_status());

        System.out.println("\n=== ADMIN ===");
        Admin admin = new Admin();
        admin.log_in(999, "adminpass");
        admin.add_vehicle();
        admin.verify_user();
    }
}
