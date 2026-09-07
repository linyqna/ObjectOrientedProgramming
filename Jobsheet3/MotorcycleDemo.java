package Jobsheet3;

public class MotorcycleDemo {
    public static void main(String[] args) {
        Motorcycle mtr1 = new Motorcycle();
        mtr1.displayStatus();

        mtr1.platNo = "B 0838 XZ";
        
        int kecepatanBaru = 50;

        if (!mtr1.isMachineOn && kecepatanBaru > 0) {
            System.out.println("If the machine off, the speed cannot be more than 0");
        } else {
            mtr1.kecepatan = kecepatanBaru;
        }
        
        mtr1.displayStatus();

        Motorcycle mtr2 = new Motorcycle();
        mtr2.platNo = "N 9840 AB";
        mtr2.isMachineOn = true;
        kecepatanBaru = 40;

        if (!mtr2.isMachineOn && kecepatanBaru > 0) {
            System.out.println("If the machine off, the speed cannot be more than 0");
        } else {
            mtr1.kecepatan = kecepatanBaru;
        }

        mtr2.displayStatus();

        Motorcycle mtr3 = new Motorcycle();
        mtr3.platNo = "D 8343 CV";
        kecepatanBaru = 60;

        if (!mtr3.isMachineOn && kecepatanBaru > 0) {
            System.out.println("If the machine off, the speed cannot be more than 0");
        } else {
            mtr1.kecepatan = kecepatanBaru;
        }

        mtr3.displayStatus();
    }
}
