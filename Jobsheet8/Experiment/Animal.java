package Jobsheet8.Experiment;

public abstract class Animal {
    public double weight;
    public String makanan;
    public String habitat;

    public Animal(double weight, String makanan, String habitat) {
        this.weight = weight;
        this.makanan = makanan;
        this.habitat = habitat;
    }

    public abstract void moving();

    public abstract void breath();

    public void printInfo() {
        System.out.println("Weight  : "  + this.weight);
        System.out.println("Makanan : " + this.makanan);
        System.out.println("Habitat : " + this.habitat);
    }
}
