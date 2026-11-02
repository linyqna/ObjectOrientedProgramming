package Jobsheet9.Experiment1;

public class Main {
    public static void main(String[] args) {
        // Instantiating objects of concrete classes
        Fan fan1 = new Fan("Standing Fan", 30.0, "White", "Miyako");
        Tv tv1 = new Tv("OLED 4K", 15, 500.0, "Black", "Samsung");
        Refrigerator fridge1 = new Refrigerator(2, 350.0, "Silver", "LG");
        SmartFridge smartFridge1 = new SmartFridge(20, 2, 900.0, "Metallic Black", "Sharp");

        tv1.increaseVolume(5);
        smartFridge1.decreaseVolume(3);

        System.out.println("=== FAN INFO ===");
        System.out.println(fan1.getInfo());

        System.out.println("\n=== TV INFO ===");
        System.out.println(tv1.getInfo());

        System.out.println("\n=== REFRIGERATOR INFO ===");
        System.out.println(fridge1.getInfo());

        System.out.println("\n=== SMART FRIDGE INFO ===");
        System.out.println(smartFridge1.getInfo());
    }
}