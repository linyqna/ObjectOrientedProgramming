package Jobsheet4.Expedition;

public class Courier {
    private String idKurir;
    private String name;

    public Courier(String idKurir, String name) {
        this.idKurir = idKurir;
        this.name = name;
    }

    public String getIdKurir() {
        return idKurir;
    }

    public void setIdKurir(String idKurir) {
        this.idKurir = idKurir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return name + " (" + idKurir + ")";
    }
}
