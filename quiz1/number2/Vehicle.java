package quiz1.number2;

public class Vehicle {

    private String plateNumber;
    private String brand;
    private String model;
    private String vehicleType;

    private Customer customer;
    private Service service;
    private Employee employee;

    public Vehicle(String plateNumber, String brand, String model, String vehicleType) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.vehicleType = vehicleType;
    }

    // Getter
    public String getPlateNumber() {
        return plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Service getService() {
        return service;
    }

    public Employee getEmployee() {
        return employee;
    }

    // Setter
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    // Menghitung total biaya service
    public double calculateTotalCost() {

        if (service == null) {
            return 0;
        }

        if (vehicleType.equalsIgnoreCase("Car")) {
            return service.getServicePrice() + 50000;
        }

        if (vehicleType.equalsIgnoreCase("Motorcycle")) {
            return service.getServicePrice() + 20000;
        }

        return service.getServicePrice();
    }

    // Menampilkan informasi kendaraan
    public void displayVehicleInfo() {

        System.out.println("Plate Number : " + plateNumber);
        System.out.println("Brand        : " + brand);
        System.out.println("Model        : " + model);
        System.out.println("Vehicle Type : " + vehicleType);

        if (service != null) {
            System.out.println("Service      : " + service.getServiceName());
            System.out.println("Service Price: Rp" + service.getServicePrice());
        }

        if (employee != null) {
            System.out.println("Employee     : " + employee.getName());
            System.out.println("Position     : " + employee.getPosition());
        }

        System.out.println("Total Cost   : Rp" + calculateTotalCost());
    }
}