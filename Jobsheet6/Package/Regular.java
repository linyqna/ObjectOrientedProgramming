package Jobsheet6.Package;

public class Regular extends Package {
    public int estimasiDay;

    public Regular() {
        super();
        this.estimasiDay = 0;
    }

    public Regular(String noResi, Customer pengirim, Customer penerima, String alamatPengiriman, double weight, int estimasiDay) {
        super(noResi, pengirim, penerima, alamatPengiriman, weight);
        this.estimasiDay = estimasiDay;
    }

    public double hitungBiaya() {
        return super.hitungBiaya();
    }

    public String displayDetail() {
        String info = super.displayInfo();
        info += "\n";
        info += "\tService Type    : Regular\n";
        info += "\tEstimated Time  : " + this.estimasiDay + " Days\n";
        info += "\tTotal Cost      : Rp" + String.format("%,.0f", (double) this.hitungBiaya()) + "\n";

        return info;
    }
}
