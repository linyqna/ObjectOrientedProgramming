package Jobsheet7.PackageFinal;

public class PackageDemo {
    public static void main(String[] args) {
        System.out.println("\n==== Constructor Parameterized ====\n");

        Customer cust1 = new Customer("Aji Widjaja", "082xxxxxxxx");
        Customer cust2 = new Customer("Bella Marinda", "083xxxxxxxx");
        Customer cust3 = new Customer("Melinda Lin", "087xxxxxxxx");
        Customer cust4 = new Customer("Mayang Sari", "089xxxxxxxx");

        Regular reg1 = new Regular("RES-112", cust1, cust3, "Jl. Nanyang, Guanzhou", 12, 12);
        System.out.println(reg1.displayDetail());

        Express exp1 = new Express("RES-122", cust2, cust4, "Jl. Banana, Piskip", 3, 20000, 5);
        System.out.println(exp1.displayDetail());

        System.out.println("\n==== Constructor Parameterless ====\n");
        
        Customer cust5 = new Customer();
        cust5.setName("Panji Waroyo");
        cust5.setPhone("084xxxxxxxx");
        
        Regular reg2 = new Regular();
        reg2.setNoResi("RES-113");
        reg2.setPengirim(cust5);
        reg2.setPenerima(cust3);
        reg2.setAlamatPengiriman("Jl. Padjajaran, Seminar");
        reg2.setWeight(12);
        reg2.setEstimasiDay(2);
        System.out.println(reg2.displayDetail());

        System.out.println("\n==== Update Detail ====\n");

        reg1.setPenerima(cust2);
        System.out.println(reg1.displayDetail());

        exp1.setWeight(5);
        exp1.setPriorityCost(25000);
        System.out.println(exp1.displayDetail());

       
    }
}
