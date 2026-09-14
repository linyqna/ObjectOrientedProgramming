package Jobsheet4.Hospital;

public class Employee {
    private String nip;
    private String name;

    public Employee(String nip, String name) {
        this.nip = nip;
        this.name = name;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return name + " (" + nip + ")";
    }
}
