package Jobsheet6.Experiment;

public class InheritanceDemo {
    public static void main(String[] args) {
        Lecturer dosen1 = new Lecturer();

        dosen1.name = "Yansy Ayunigtyas";
        dosen1.nip = "34329837";
        dosen1.salary = 3000000;
        dosen1.nidn = "1989432435";

        System.out.println(dosen1.getInfo());
    }
}
