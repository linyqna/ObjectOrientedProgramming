package Jobsheet9.Experiment1;

public class Tv extends ElectronicDevice implements Audible {
    private String screenType;
    private int volume;

    public Tv(String screenType, int volume, double price, String color, String brand) {
        super(price, color, brand);
        this.screenType = screenType;
        this.volume = volume;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
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
        return super.getInfo() + ", Screen Type: " + screenType + ", Volume: " + volume;
    }
}