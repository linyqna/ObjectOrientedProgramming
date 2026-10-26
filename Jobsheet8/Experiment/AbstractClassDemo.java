package Jobsheet8.Experiment;

public class AbstractClassDemo {
    public static void main(String[] args) {
        Animal hwn1 = new Animal(10, "Grass", "Savana");
        hwn1.printInfo();
        hwn1.moving();
        hwn1.breath();
        System.out.println(" ");

        Bee bee1 = new Bee("Queen", 0.05, "Nektar", "Forest");
        bee1.printInfo();
        bee1.moving();
        bee1.breath();
    }
}
