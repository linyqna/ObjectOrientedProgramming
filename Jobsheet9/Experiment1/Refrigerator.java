package Jobsheet9.Experiment1;

public class Refrigerator extends ElectronicDevice {
    private int numberOfDoors;

    public Refrigerator(int numberOfDoors, double price, String color, String brand) {
        super(price, color, brand);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
