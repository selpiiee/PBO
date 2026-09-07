package jobsheet3;

public class Motor {
    public String plateNumber;
    public boolean isEngineOn;
    public int speed;

    public void displayStatus() {
        System.out.println("Plate Number: " + this.plateNumber);

        if (isEngineOn) {
            System.out.println("Engine ON");
        }
        else {
            System.out.println("Engine OFF");
        }

        System.out.println("Speed: " + this.speed);
        System.out.println("====================");
    }
}