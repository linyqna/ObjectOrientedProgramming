package Jobsheet9.Experiment1;

public class ElectronicDevice {
    private double price;
    private String color;
    private String brand;

    public ElectronicDevice(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getInfo() {
        return "Brand: " + brand + ", Color: " + color + ", Price: $" + price;
    }
}
