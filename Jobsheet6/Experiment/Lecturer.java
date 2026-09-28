package Jobsheet6.Experiment;

public class Lecturer extends Employee{
    public String nidn;

    public Lecturer(String nip, String name, double salary, String nidn) {
        super(nip, name, salary);
        this.nidn = nidn;
    }

    // public Lecturer() {
    //     System.out.println("Object from Lecturer Class made.");
    // }

    public String getInfo() {
        return "NIDN    : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}
