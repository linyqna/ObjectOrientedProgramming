package Jobsheet3.Assignment;

public class Member {
    private String idNumber;
    private String name;
    private int borrowLimit;
    private int loanAmount;

    public Member(String idNumber, String name, int borrowLimit) {
        this.idNumber = idNumber;
        this.name = name;
        this.borrowLimit = borrowLimit;
        this.loanAmount = 0;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorrowLimit() {
        return borrowLimit;
    }

    public void setBorrowLimit(int borrowLimit) {
        this.borrowLimit = borrowLimit;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void borrow(int count) {
        int total = loanAmount + count;
        if (total > borrowLimit) {
            System.out.println("Unable to process borrowing request.");
            System.out.println("The total loan amount exceeds the borrowing limit.");
        } else {
            loanAmount = total;
            System.out.println("Borrowing request success.");
            System.out.println("Current Loan Amount: " + loanAmount);
        }
    }

    public void installment(int nominal) {
        if (loanAmount > 0) {
            loanAmount -= nominal;
            System.out.println("Successful installment payment process.");
            if (loanAmount == 0) {
                System.out.println("The loan amount has reached 0. Repayment is complete.");
            } else {
                System.out.println("Current Loan Amount: " + loanAmount);
            }
        } else if (loanAmount == 0) {
            System.out.println("The loan amount has reached 0. Repayment is complete.");
        }
    }
}
