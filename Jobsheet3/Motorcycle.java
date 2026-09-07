package Jobsheet3;

public class Motorcycle {
    private String platNo;
    private boolean isMachineOn;
    private int kecepatan;

    public String getPlatNo() {
        return platNo;
    }

    public void setPlatNo(String platNo) {
        this.platNo = platNo;
    }

    public boolean getIsMachineOn() {
        return isMachineOn;
    }

    public void setIsMachineOn(boolean isMachineOn) {
        this.isMachineOn = isMachineOn;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if (!this.isMachineOn && kecepatan > 0) {
            System.out.println("If the machine off, the speed cannot be more than 0");
        } else {
            this.kecepatan = kecepatan;
        }
    }

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
