package Jobsheet7.Manusia;

public class Mahasiswa extends Manusia{
    @Override
    public void makan() {
        System.out.println("Mahasiswa sedang makan di kost.");
    }

    public void tidur() {
        System.out.println("Mahasiswa sedang tidur setelah menyelesaikan praktikum.");
    }
}
