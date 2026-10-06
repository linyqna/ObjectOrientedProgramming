package Jobsheet7.Employee;

public class Manager extends Employee{
    private double tunjangan;
    private String bagian;
    private Staff st[];

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getBagian() {
        return bagian;
    }

    public void setStaff(Staff[] st) {
        this.st = st;
    }

    public void viewStaff() {
        System.out.println("__________________\n");
        for (int i = 0; i < st.length; i++) {
            st[i].displayInfo();
        }
        System.out.println("__________________\n");
    }

    public void displayInfo() {
        System.out.println("Manager: " + this.getBagian());
        System.out.println("NIP: " + this.getNip());
        System.out.println("Name: " + this.getName());
        System.out.println("Golongan: " + this.getGolongan());
        System.out.printf("Allowance: %.0f\n", this.getTunjangan());
        System.out.printf("Salary: %.0f\n", this.getSalary());
        System.out.println("Bagian: " + this.getBagian());
        System.out.println("__________________\n");
        this.viewStaff();
    }

    public double getSalary() {
        return super.getSalary() + tunjangan;
    }
}
