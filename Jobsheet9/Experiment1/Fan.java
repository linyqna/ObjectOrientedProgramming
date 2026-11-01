package Jobsheet9.Experiment1;

public class Fan extends ElectronicDevice {
    private String type;

    public Fan(String type, double price, String color, String brand) {
        super(price, color, brand);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
