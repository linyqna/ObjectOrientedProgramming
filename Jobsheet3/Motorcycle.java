package Jobsheet3;

public class Motorcycle {
    public String platNo;
    public boolean isMachineOn;
    public int kecepatan;

    public void displayStatus() {
        System.out.println("Plate Number: " + this.platNo);

        if (isMachineOn) {
            System.out.println("Machine On");
        } else {
            System.out.println("Machine Off");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("=========================");
    }
}
