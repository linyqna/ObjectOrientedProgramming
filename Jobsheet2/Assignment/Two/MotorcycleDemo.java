package Jobsheet2.Assignment.Two;

public class MotorcycleDemo {
    public static void main(String[] args) {
        Motorcycle mt = new Motorcycle();
        mt.plateNo = "AG6666BB";
        mt.brand = "Honda";
        mt.color = "Red";
        mt.speed = 20;
        
        mt.displayInfo();

        System.out.println(" ");
        mt.turnOn();

        System.out.println(" ");
        System.out.println("Motorcycle Speed After Acceleration: " + mt.acceleration(30));
    }
}
