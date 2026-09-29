package Jobsheet6.Package;

public class Package {
    public String noResi;
    public Customer pengirim;
    public Customer penerima;
    public String alamatPengiriman;
    public double weight;

    public Package() {
        this.noResi = "-";
        this.pengirim = new Customer();
        this.penerima = new Customer();
        this.alamatPengiriman = "-";
    }

    public Package(String noResi, Customer pengirim, Customer penerima, String alamatPengiriman, double weight) {
        this.noResi = noResi;
        this.pengirim = pengirim;
        this.penerima = penerima;
        this.alamatPengiriman = alamatPengiriman;
        this.weight = weight;
    }

    public double hitungBiaya() {
        return 10000 * this.weight;
    }

    public String displayInfo() {
        String info = "";
        info += "\n==== Package Detail ====\n";
        info += "No Resi         : " + this.noResi + "\n";
        info += "Sender          : " + this.pengirim.name + " (" + this.pengirim.phone + ")" + "\n";
        info += "Recipient       : " + this.penerima.name + " (" + this.penerima.phone + ")" + "\n";
        info += "Shipping Address: " + this.alamatPengiriman + "\n";
        info += "Shipping Detail : \n";

        return info;
    }
}
