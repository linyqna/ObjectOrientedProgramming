package Jobsheet6.Experiment;

public class Lecturer extends Employee{
    public String nidn;

    public Lecturer() {
        System.out.println(salary);
        System.out.println("Object from Lecturer Class made.");
    }

    public String getAllInfo() {
        String info = "";
        info += "NIP    : " + super.nip + "\n";
        info += "Name   : " + super.name + "\n";
        info += "Salary : " + super.salary + "\n";
        info += "NIDN   : " + this.nidn + "\n";

        return info;
    }
}
