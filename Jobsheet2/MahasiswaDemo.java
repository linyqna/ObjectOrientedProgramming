package Jobsheet2;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        m1.displayBiodata();
        System.out.println(" ");

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "090887";
        m2.nama = "Lucia Torres";
        m2.alamat = "Blitar";
        m2.kelas = "2G";

        m2.displayBiodata();
        System.out.println(" ");

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "0110202";
        m3.nama = "Selvy Nur";
        m3.alamat = "Kepanjen, Malang";
        m3.kelas = "2G";

        m3.displayBiodata();
    }
}