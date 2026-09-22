package quiz1.number2;

public class Main {

    public static void main(String[] args) {

        // CUSTOMER

        Customer customer1 = new Customer(
            "Naravit",
            "081234567890"
        );

        Customer customer2 = new Customer(
            "Phuwintang",
            "082345678901"
        );


        // SERVICE

        Service service1 = new Service(
            "Oil Change",
            100000
        );

        Service service2 = new Service(
            "Machine Service",
            300000
        );

        Service service3 = new Service(
            "Tune Up",
            250000
        );


        // EMPLOYEE

        Employee employee1 = new Employee(
            "EMP001",
            "Aou Thanaboon",
            "Mechanic"
        );

        Employee employee2 = new Employee(
            "EMP002",
            "Teeradech",
            "Senior Mechanic"
        );


        // VEHICLE 2 CAR + 2 MOTORCYCLE

        Vehicle car1 = new Vehicle(
            "N 1234 AB",
            "BMW",
            "M4",
            "Car"
        );

        Vehicle car2 = new Vehicle(
            "N 5678 CD",
            "Honda",
            "Civic Turbo",
            "Car"
        );

        Vehicle motorcycle1 = new Vehicle(
            "N 1111 EF",
            "Ninja",
            "ZX25R",
            "Motorcycle"
        );

        Vehicle motorcycle2 = new Vehicle(
            "N 2222 GH",
            "Yamaha",
            "Aerox Ultimate Turbo",
            "Motorcycle"
        );


        // CUSTOMER - VEHICLE

        customer1.addVehicle(car1);
        customer1.addVehicle(motorcycle1);

        customer2.addVehicle(car2);
        customer2.addVehicle(motorcycle2);



        // VEHICLE - SERVICE

        car1.setService(service2);
        car2.setService(service3);

        motorcycle1.setService(service1);
        motorcycle2.setService(service2);


        // VEHICLE - EMPLOYEE

        car1.setEmployee(employee2);
        car2.setEmployee(employee1);

        motorcycle1.setEmployee(employee1);
        motorcycle2.setEmployee(employee2);


        // DISPLAY SERVICE

        System.out.println("          BENGKEL SAYA");
        System.out.println("---------------------------------");

        System.out.println("\nSERVICE INFORMATION");
        System.out.println("--------------------------------------");

        service1.displayServiceInfo();
        service2.displayServiceInfo();
        service3.displayServiceInfo();
        System.out.println();



        // CUSTOMER 1

        System.out.println();
        System.out.println("CUSTOMER INFORMATION");
        System.out.println("---------------------------------");

        System.out.println("Name        : " + customer1.getName());
        System.out.println("Phone Number: " + customer1.getPhoneNumber());

        System.out.println("\n--- Vehicle 1 ---");
        car1.displayVehicleInfo();

        System.out.println("\n--- Vehicle 2 ---");
        motorcycle1.displayVehicleInfo();


        // CUSTOMER 2

        System.out.println();
        System.out.println("CUSTOMER INFORMATION");
        System.out.println("---------------------------------");

        System.out.println("Name        : " + customer2.getName());
        System.out.println("Phone Number: " + customer2.getPhoneNumber());

        System.out.println("\n--- Vehicle 1 ---");
        car2.displayVehicleInfo();

        System.out.println("\n--- Vehicle 2 ---");
        motorcycle2.displayVehicleInfo();
    }
}