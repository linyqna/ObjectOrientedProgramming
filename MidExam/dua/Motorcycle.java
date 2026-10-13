package MidExam.dua;

public class Motorcycle extends Vehicle{
    public int engineCapacity;
    public String mode;

    @Override
    public boolean powerOn() {
        System.out.println("Vehicle electrical system is powered on.");
        return true; 
    }

    public void startMachine() {
        System.out.println("Motorcycle engine is started.");
    }
}
