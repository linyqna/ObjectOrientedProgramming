package Jobsheet9.Experiment1;

public class Main {
    public static void main(String[] args) {

        Tv tv = new Tv("LED", 20, 5000000, "Black", "Samsung");
        Refrigerator fridge = new Refrigerator(2, 3000000, "Silver", "LG");
        SmartFridge smartFridge = new SmartFridge(15, 2, 7000000, "White", "Samsung");
        Fan fan = new Fan("Standing", 500000, "White", "Miyako");

        System.out.println("=== TV ===");
        System.out.println("Brand: " + tv.getBrand());
        System.out.println("Price: " + tv.getPrice());
        System.out.println("Color: " + tv.getColor());
        System.out.println("Screen Type: " + tv.getScreenType());
        System.out.println("Initial Volume: " + tv.getVolume());

        tv.increaseVolume(5);
        System.out.println("Volume after increase: " + tv.getVolume());

        tv.decreaseVolume(3);
        System.out.println("Volume after decrease: " + tv.getVolume());

        System.out.println("\n=== FRIDGE ===");
        System.out.println("Brand: " + fridge.getBrand());
        System.out.println("Price: " + fridge.getPrice());
        System.out.println("Color: " + fridge.getColor());
        System.out.println("Number of Doors: " + fridge.getNumberOfDoors());

        System.out.println("\n=== SMART FRIDGE ===");
        System.out.println("Brand: " + smartFridge.getBrand());
        System.out.println("Price: " + smartFridge.getPrice());
        System.out.println("Color: " + smartFridge.getColor());
        System.out.println("Number of Doors: " + smartFridge.getNumberOfDoors());
        System.out.println("Initial Volume: " + smartFridge.getVolume());

        smartFridge.increaseVolume(5);
        System.out.println("Volume after increase: " + smartFridge.getVolume());

        smartFridge.decreaseVolume(3);
        System.out.println("Volume after decrease: " + smartFridge.getVolume());

        System.out.println("\n=== FAN ===");
        System.out.println("Brand: " + fan.getBrand());
        System.out.println("Price: " + fan.getPrice());
        System.out.println("Color: " + fan.getColor());
        System.out.println("Type: " + fan.getType());
    }
}
