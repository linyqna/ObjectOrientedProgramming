package Jobsheet3.Assignment;

public class TestCooperative {
    public static void main(String[] args) {
        Member mmb1 = new Member("111333444", "Donny", 5000000);

        System.out.println("Member Name: " + mmb1.getName());
        System.out.println("Loan Limit: " + mmb1.getBorrowLimit());

        System.out.println("\nBorrow 10,000,000...");
        mmb1.borrow(10000000);

        System.out.println("\nBorrow 4,000,000...");
        mmb1.borrow(4000000);

        System.out.println("\nPaying 50,000... installments");
        mmb1.installment(50000);

        System.out.println("\nPaying 1,000,000 installments");
        mmb1.installment(1000000);

        System.out.println("\nPaying 3,000,000 installments");
        mmb1.installment(3000000);
    }
}
