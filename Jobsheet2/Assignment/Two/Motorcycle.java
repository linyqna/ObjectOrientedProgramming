package Jobsheet2.Assignment.Two;

public class Motorcycle {
    public String plateNo;
    public String brand;
    public String color;
    public int speed = 0;
    public boolean isEngineOn = false;

    public int acceleration(int increment) {
        int aftIncrement = speed + increment;
        return aftIncrement;
    }

    public int reduction(int decrement) {
        int aftDecrement = speed - decrement;
        return aftDecrement;
    }

    public void turnOn() {
        System.out.println("Is Motorcycle Engine Turn On?");
        if (speed == 0 || speed < 0) {
            System.out.println("No, Motorcycle Engine is Off.");
        } if (speed > 0) {
            System.out.println("Yes, Motorcycle Engine is On. The Speed is "  + speed + " km/h");
        }
    }

    public void displayInfo() {
        System.out.println("Plate Number: " + plateNo);
        System.out.println("Brand       : " + brand);
        System.out.println("Color       : " + color);
    }
}
