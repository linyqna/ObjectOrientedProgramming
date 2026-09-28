package Jobsheet6.Experiment;

public class Employee {
    public String nip;
    public String name;
    protected double salary;

    public Employee() {
        System.out.println("Object from Employee Class made.");
    }

    public String getInfo() {
        String info = "";
        info += "NIP    : " + nip + "\n";
        info += "Name   : " + name + "\n";
        info += "Salary : " + salary + "\n";

        return info;
    }
}
