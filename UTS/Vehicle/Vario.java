package UTS.Vehicle;

public class Vario extends Motorcycle {
    public String color;
    public double fuelCapacity;

    @Override
    public boolean powerOn() {
        System.out.println("Vehicle electrical system is powered on.");
        return true; 
    }

    public void openSeat() {
        System.out.println("Vario seat is opened.");
    }
}
