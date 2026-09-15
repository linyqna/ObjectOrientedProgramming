package Jobsheet4.Expedition;

import java.time.LocalDate;

public class Transaction {
    private String noResi;
    private LocalDate dateKirim;
    private LocalDate dateTerima;
    private Customer pengirim;
    private Customer penerima;
    private Courier kurir;
    
    public String getNoResi() {
        return noResi;
    }

    public void setNoResi(String noResi) {
        this.noResi = noResi;
    }

    public LocalDate getDateKirim() {
        return dateKirim;
    }

    public void setDateKirim(LocalDate dateKirim) {
        this.dateKirim = dateKirim;
    }

    public LocalDate getDateTerima() {
        return dateTerima;
    }

    public void setDateTerima(LocalDate dateTerima) {
        this.dateTerima = dateTerima;
    }

    public Customer getPengirim() {
        return  pengirim;
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

    public Courier getKurir() {
        return kurir;
    }

    public void  setKurir(Courier kurir) {
        this.kurir = kurir;
    }

    public Transaction(String noResi, LocalDate dateKirim, LocalDate dateTerima, Customer penerima, Courier kurir) {
        this.noResi = noResi;
        this.dateKirim = dateKirim;
        this.dateTerima = dateTerima;
        this.penerima = penerima;
        this.kurir = kurir;
    }

    public String getInfo() {
        String info = "";
        info += "\tResi Number: " + noResi;
        info += ", Package Recipient: " + penerima.getName();
        info+= ", Shipped Date: " + this.dateKirim;
        info += ", Recieved Date: " + this.dateTerima;
        info += ", Shipping Courier: " + kurir.getInfo();
        info += "\n";
        
        return info;
    }
}
