package jobsheet3;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.displayStatus();

        motor1.plateNumber = "B 0838 XZ";
        
        int newSpeed = 50;

        if (!motor1.isEngineOn && newSpeed > 0) {
            System.out.println("The speed must not exceed 0 when the engine is OFF");
        } else {
            motor1.speed = newSpeed;
        }
        
        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.plateNumber = "N 9840 AB";
        motor2.isEngineOn = true;
        motor2.speed = 40;

        if (!motor2.isEngineOn && newSpeed > 0) {
            System.out.println("The speed must not exceed 0 when the engine is OFF");
        } else {
            motor2.speed = newSpeed;
        }

        motor2.displayStatus();

        Motor motor3 = new Motor();
        motor3.plateNumber = "D 8343 CV";
        motor3.speed = 60;

        if (!motor3.isEngineOn && newSpeed > 0) {
            System.out.println("The speed must not exceed 0 when the engine is OFF");
        } else {
            motor3.speed = newSpeed;
        }

        motor3.displayStatus();
    }
}