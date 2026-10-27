package Jobsheet8.Experiment;

public class Snake extends Animal{
    public boolean isBerbisa;

    public Snake(boolean isBerbisa, double weight, String makanan, String habitat) {
        super(weight, makanan, habitat);
        this.isBerbisa = isBerbisa;
    }

    @Override
    public void moving() {
        System.out.println("Mengerutkanotot segala sisi hingga membentuk lengkungan");
        System.out.println("Menemukan titik penahan seperti natu atau pohon");
        System.out.println("Menggunakan sisik untuk mendorong tubuh ke depan");
        System.out.println(" ");
    }

    @Override
    public void breath() {
        System.out.println("Otot kering rusuk kontraksi, udara masuk lewat hidung");
        System.out.println("Trakea mengirimkan udara ke paru paru");
        System.out.println("Otot tulang rusuk relaksasi, udara dikeluarkan lewat hidung");
        System.out.println(" ");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Berbisa : " + (this.isBerbisa ? "Ya" : "Tidak"));
        System.out.println(" ");
    }
}
