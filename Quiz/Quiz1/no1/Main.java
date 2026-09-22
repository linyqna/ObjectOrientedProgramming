package Quiz.Quiz1.no1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop Gaming", "PR-001", 15000000, "Electronics");
        laptop.addProduct();
        System.out.println(laptop.getInfo());
        
        laptop.createStock(25, 1);
        System.out.println(laptop.getInfo());
        
        Product cashing = new Product("Cashing Handphone", "PR-002", 30000, "Accessories");
        cashing.addProduct();
        cashing.createStock(10, 1);
        System.out.println(cashing.getInfo());

        Customer cust1 = new Customer("CUST-10", "Budi", "Kepanjen, Malang", "08111111");
        cust1.addCustomer();
        cust1.addOrder("ORD-999", 1, LocalDate.now(), laptop);
        System.out.println(cust1.getInfo());

        Customer cust2 = new Customer("CUST-20", "Bejo", "Solo, Jateng", "089000000");
        System.out.println(cust2.getInfo());

        laptop.modifyProduct("Laptop Gaming 2.0", 0, "High-End Electronics");
        
        cust1.editCustomer(null, "Kediri, Jatim", "08765");
        System.out.println(cust1.getInfo());

        Order ord1 = new Order("ORD-118", cust1, 2, LocalDate.of(2026, 4, 13));
        ord1.addProduct(cashing);
        ord1.createOrder();
        System.out.println(ord1.getInfo());

        laptop.selectStock("PR-001");
    }
}
