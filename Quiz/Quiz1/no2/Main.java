package Quiz.Quiz1.no2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee mechanic1 = new Employee("E-001", "Budi");
        Employee mechanic2 = new Employee("E-002", "Andi");

        Service oilChange = new Service("Oil Change", 150000);
        Service brakeFix = new Service("Brake Replacement", 300000);
        Service engineTuneUp = new Service("Engine Tune-Up", 250000);

        Customer customer1 = new Customer("Hamidi", "081222222");
        Customer customer2 = new Customer("Rinrin", "089888000");

        Vehicle car1 = new Vehicle("B 1234 ABC", "Toyota", "Avanza", "Car", LocalDate.of(2026, 9, 20));
        car1.setMechanic(mechanic1);
        car1.addService(oilChange);
        car1.addService(brakeFix);

        Vehicle moto1 = new Vehicle("B 4321 ZYX", "Yamaha", "NMAX", "Motorcycle", LocalDate.of(2026, 9, 21));
        moto1.setMechanic(mechanic2);
        moto1.addService(engineTuneUp);

        customer1.addVehicle(car1);
        customer1.addVehicle(moto1);

        Vehicle car2 = new Vehicle("D 5678 DEF", "Honda", "Civic", "Car", LocalDate.now()); // Menggunakan tanggal hari ini
        car2.setMechanic(mechanic1);
        car2.addService(engineTuneUp);

        Vehicle moto2 = new Vehicle("D 8765 WVU", "Honda", "Beat", "Motorcycle", LocalDate.now());
        moto2.setMechanic(mechanic2);
        moto2.addService(oilChange);

        customer2.addVehicle(car2);
        customer2.addVehicle(moto2);

        System.out.println(customer1.getInfo());
        System.out.println(customer2.getInfo());
    }
}
