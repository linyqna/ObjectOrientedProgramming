package Jobsheet9.Experiment1;

public class SmartFridge extends Refrigerator implements Audible {
    private int volume;

    public SmartFridge(int volume, int numberOfDoors, double price, String color, String brand) {
        super(numberOfDoors, price, color, brand);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void increaseVolume(int increment) {
        this.volume += increment;
    }

    @Override
    public void decreaseVolume(int decrement) {
        this.volume -= decrement;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Volume: " + volume;
    }
}
