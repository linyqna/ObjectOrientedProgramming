package Jobsheet4;

import java.time.LocalDate;

public class HospitalDemo {
    public static void main(String[] args) {
        Employee ani = new Employee("1234", "dr. Ani");
        Employee bagus = new Employee("4567", "dr. Bagus");

        Employee desi = new Employee("1234", "Ns. Desi");
        Employee eka = new Employee("4567", "Ns. Eka");

        Patient psn1 = new Patient("343298", "Puspa Widya");
        psn1.addConsultation(LocalDate.of(2021, 8, 11), ani, desi);
        psn1.addConsultation(LocalDate.of(2021, 9, 11), bagus, eka);

        System.out.println(psn1.getInfo());

        Patient psn2 = new Patient("997744", "Yenny Anggraeni");
        System.out.println(psn2.getInfo());
    }
}
