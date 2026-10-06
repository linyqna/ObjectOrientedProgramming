package Jobsheet7.Manusia;

public class MainDemo {
    public static void main(String[] args) {
        System.out.println("=== Overriding Dosen ===");
        Dosen m1 = new Dosen();
        m1.bernafas();
        m1.makan();

        System.out.println("\n=== Overriding Mahasiswa ===");
        Mahasiswa m2 = new Mahasiswa();
        m2.bernafas();
        m2.makan();
    }
}
