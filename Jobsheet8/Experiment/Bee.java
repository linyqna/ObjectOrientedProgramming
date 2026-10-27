package Jobsheet8.Experiment;

public class Bee extends Animal{
    public String kasta;

    public Bee(String kasta, double weight, String makanan, String habitat) {
        super(weight, makanan, habitat);
        this.kasta = kasta;
    }

    @Override
    public void moving() {
        System.out.println("Mengepakkan sayap ke depan");
        System.out.println("Memutar sayap hampir 90 derajat");
        System.out.println("Mengepakkan sayap ke belakang");
        System.out.println(" ");
    }

    @Override
    public void breath() {
        System.out.println("otot perut mmengendur, udara msuk melalui lubang di segmen tubuh");
        System.out.println("Trakea mengirim oksigen");
        System.out.println("Otot perut berkonstraksi, udaradikeluarkan");
        System.out.println(" ");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Kasta   : " + this.kasta);
        System.out.println(" ");
    }
}
