package Jobsheet4.Expedition;

import java.time.LocalDate;

public class ExpeditionDemo {
    public static void main(String[] args) {
        Customer andi = new Customer("CUST-44", "Andi");
        Customer budi = new Customer("CUST-55", "Budi");
        Customer ani = new Customer("CUST-77", "Ani");

        Courier kur1 = new Courier("KUR-123", "Bobot");
        Courier kur2 = new Courier("KUR-987", "Bebet");

        andi.addTransaction("RESI-01", LocalDate.of(2025, 7, 17), LocalDate.of(2025, 7, 21), ani, kur2);
        ani.addTransaction("RESI-02", LocalDate.of(2026, 8, 2), LocalDate.of(2026, 8, 5), andi, kur1);
        andi.addTransaction("RESI-03", LocalDate.of(2026, 8, 11), LocalDate.of(2026, 8, 13), ani, kur1);

        System.out.println(andi.getInfo());
        System.out.println(budi.getInfo());
        System.out.println(ani.getInfo());
    }
}
