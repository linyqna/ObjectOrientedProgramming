package Jobsheet7.PackageFinal;

public class Package {
    private String noResi;
    private Customer pengirim;
    private Customer penerima;
    private String alamatPengiriman;
    private double weight;
    private final double biayaPerKg = 10000;

    public String getNoResi() {
        return noResi;
    }

    public void setNoResi(String noResi) {
        this.noResi = noResi;
    }

    public Customer getPengirim() {
        return pengirim;
    }

    public void setPengirim(Customer pengirim) {
        this.pengirim = pengirim;
    }

    public Customer getPenerima() {
        return penerima;
    }

    public void setPenerima(Customer penerima) {
        this.penerima = penerima;
    }

    public String getAlamatPengiriman() {
        return alamatPengiriman;
    }

    public void setAlamatPengiriman(String alamatPengiriman) {
        this.alamatPengiriman = alamatPengiriman;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBiayaPerKg() {
        return biayaPerKg;
    }

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
        return getBiayaPerKg() * this.getWeight();
    }

    public final String displayInfo() {
        String info = "";
        info += "\n==== Package Detail ====\n";
        info += "No Resi         : " + this.getNoResi() + "\n";
        info += "Sender          : " + this.getPengirim().getName() + " (" + this.getPengirim().getPhone() + ")" + "\n";
        info += "Recipient       : " + this.getPenerima().getName() + " (" + this.getPenerima().getPhone() + ")" + "\n";
        info += "Shipping Address: " + this.getAlamatPengiriman() + "\n";
        info += "Shipping Detail : \n";

        return info;
    }
}
