package Jobsheet8.Experiment;

public class Bee extends Animal{
    public String kasta;

    public Bee(String kasta, double weight, String makanan, String habitat) {
        super(weight, makanan, habitat);
        this.kasta = kasta;
    }
}
