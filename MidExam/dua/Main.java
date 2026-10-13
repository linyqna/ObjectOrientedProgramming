package MidExam.dua;

public class Main {
    public static void main(String[] args) {
        Vario motor = new Vario();
        
        motor.brand = "Honda";
        motor.engineCapacity = 160;
        motor.mode = "Eco";
        motor.color = "Matte Black";
        motor.fuelCapacity = 5.5; 
        
        boolean isPoweredOn = motor.powerOn();
        
        if (isPoweredOn) {
            motor.startMachine();
            motor.openSeat();
        }
    }
}
