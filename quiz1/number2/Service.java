package quiz1.number2;

public class Service {

    private String serviceName;
    private double servicePrice;

    public Service(String serviceName, double servicePrice) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }

    // Getter
    public String getServiceName() {
        return serviceName;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    // Setter
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    // Menampilkan informasi service
    public void displayServiceInfo() {
        System.out.println(
            serviceName + " - Rp" + servicePrice
        );
    }
}