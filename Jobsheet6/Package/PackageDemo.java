package Jobsheet6.Package;

public class PackageDemo {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Aji Widjaja", "082xxxxxxxx");
        Customer cust2 = new Customer("Bella Marinda", "083xxxxxxxx");
        Customer cust3 = new Customer("Melinda Lin", "087xxxxxxxx");
        Customer cust4 = new Customer("Mayang Sari", "089xxxxxxxx");

        Regular reg1 = new Regular("RES-112", cust1, cust3, "Jl. Nanyang, Guanzhou", 12, 12);
        System.out.println(reg1.displayDetail());

        Express reg2 = new Express("RES-122", cust2, cust4, "Jl. Banana, Piskip", 3, 20000, 5);
        System.out.println(reg2.displayDetail());

        System.out.println("\n==== Update Detail ====\n");

        reg1.penerima = cust2;
        System.out.println(reg1.displayDetail());

        reg2.weight = 5;
        reg2.priorityCost = 25000;
        System.out.println(reg2.displayDetail());
    }
}
