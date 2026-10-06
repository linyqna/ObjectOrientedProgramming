package Jobsheet7.Employee;

public class Staff extends Employee{
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public int getLembur() {
        return lembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public double getSalary(int lembur, double gajiLembur) {
        return super.getSalary() + lembur * gajiLembur;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + lembur * gajiLembur;
    }

    public void displayInfo() {
        System.out.println("NIP: " + this.getNip());
        System.out.println("Name: " + this.getName());
        System.out.println("Golongan: " + this.getGolongan());
        System.out.println("Overtime Count: " + this.getLembur());
        System.out.printf("Overtime Salary: %.0f\n", this.getGajiLembur());
        System.out.printf("Salary: %.0f\n", this.getSalary());
        System.out.println("__________________\n");
    }
}
