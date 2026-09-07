package jobsheet3;

public class Motor {
    private String plateNumber;
    private boolean isEngineOn;
    private int speed;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setIsEngineOn(boolean isEngineOn) {
        this.isEngineOn = isEngineOn;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (!this.isEngineOn && speed > 0) {
            System.out.println("The speed must not exceed 0 when the engine is OFF");
        } 
        //experiment 2 - question number 4
        else if (speed > 100) {
            System.out.println("Speed cannot exceed 100!");
            this.speed = 100;
        } 
        //experiment 2 - question number 5
        else if (speed < 0) {
            System.out.println("Spedd cannot be negative!");
            this.speed = 0;
        } 
        else {
            this.speed = speed;
        }
    }

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