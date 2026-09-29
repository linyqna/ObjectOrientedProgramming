package Jobsheet6.Package;

public class Express extends Package {
    public int priorityCost;
    public int estimasiHour;

    public Express() {
        super();
        this.priorityCost = 0;
        this.estimasiHour = 0;
    }

    public Express(String noResi, Customer pengirim, Customer penerima, String alamatPengiriman, double weight, int priorityCost, int estimasiHour) {
        super(noResi, pengirim, penerima, alamatPengiriman, weight);
        this.priorityCost = priorityCost;
        this.estimasiHour = estimasiHour;
    }

    public double hitungBiaya() {
        return super.hitungBiaya() + this.priorityCost;
    }

    public String displayDetail() {
        String info = super.displayInfo();
        info += "\n";
        info += "\tService         : Express\n";
        info += "\tBiaya Prioritas : Rp" + String.format("%,.0f", (double) this.priorityCost) + "\n";
        info += "\tEstimased Time  : " + this.estimasiHour + " Hours\n";
        info += "\tTotal Cost      : Rp" + String.format("%,.0f", (double) this.hitungBiaya()) + "\n";

        return info;
    }
}
