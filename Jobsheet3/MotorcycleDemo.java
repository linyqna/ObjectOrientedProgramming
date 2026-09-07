package Jobsheet3;

public class MotorcycleDemo {
    public static void main(String[] args) {
        Motorcycle mtr1 = new Motorcycle();
        mtr1.displayStatus();

        mtr1.setPlatNo("B 0838 XZ");
        mtr1.setKecepatan(50);
        mtr1.displayStatus();

        Motorcycle mtr2 = new Motorcycle();
        mtr2.setPlatNo("N 9840 AB");
        mtr2.setIsMachineOn(true);
        mtr2.setKecepatan(-90);
        mtr2.displayStatus();

        Motorcycle mtr3 = new Motorcycle();
        mtr3.setPlatNo("D 8343 CV");
        mtr3.setKecepatan(60);
        mtr3.displayStatus();
    }
}
