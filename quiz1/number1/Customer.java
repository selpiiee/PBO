

public class Customer {
    private String customerId;
    private String customerName;
    private String address;
    private String phoneNumber;

    public Customer(String customerId, String customerName, String address, String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addCustomer() {
        System.out.println("Customer " + customerName + " successfully added");
    }

    public void editCustomer(String newName, String newAddress, String newPhoneNum) {
        this.customerName = newName;
        this.address = newAddress;
        this.phoneNumber = newPhoneNum;
        System.out.println("ID: " + customerId + " updated");
    } 

    public void deleteCustomer() {
        if (this.customerId.equals(customerId)) {
            this.customerId = null;
            this.customerName = null;
            this.address = null;
            this.phoneNumber = null;
            System.out.println("Customer " + customerId + " deleted");
        }
    }

    public void getInfo() {
        System.out.println("----- Detail Customer -----");
        System.out.println("ID: " + customerId);
        System.out.println("Name: " + customerName);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("---------------------------");
    }
}