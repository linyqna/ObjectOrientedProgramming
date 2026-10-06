package Jobsheet7.PackageFinal;

public class Express extends Package {
    private int priorityCost;
    private int estimasiHour;

    public int getPriorityCost() {
        return priorityCost;
    }

    public void setPriorityCost(int priorityCost) {
        this.priorityCost = priorityCost;
    }

    public int getEstimasiHour() {
        return estimasiHour;
    }

    public void setEstimasiHour(int estimasiHour) {
        this.estimasiHour = estimasiHour;
    }

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

    public double hitungBiaya(int priorityCost) {
        return super.hitungBiaya() + priorityCost;
    }

    @Override
    public double hitungBiaya() {
        return super.hitungBiaya() + this.priorityCost;
    }

    public String displayDetail() {
        String info = super.displayInfo();
        info += "\n";
        info += "\tService         : Express\n";
        info += "\tBiaya Prioritas : Rp" + String.format("%,.0f", (double) this.getPriorityCost()) + "\n";
        info += "\tEstimased Time  : " + this.getEstimasiHour() + " Hours\n";
        info += "\tTotal Cost      : Rp" + String.format("%,.0f", (double) this.hitungBiaya()) + "\n";

        return info;
    }
}
