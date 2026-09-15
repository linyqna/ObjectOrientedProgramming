package Jobsheet4.Expedition;

import java.time.LocalDate;
import java.util.ArrayList;;

public class Customer {
    private String id;
    private String name;
    private ArrayList<Transaction> historyTransaction;
    
    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
        this.historyTransaction = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        String info = "";
        info += "Customer ID             : " + this.id + "\n";
        info += "Customer Name           : " + this.name + "\n";
        info += "Package Shipping History: \n";

        if (!historyTransaction.isEmpty()) {
            
            for (Transaction trans : historyTransaction) {
                info += trans.getInfo();
            }
        } else {
            info += "\tThere is No Transaction History Yet.";
        }

        info += "\n";

        return info;
    }

    public void addTransaction(String noResi, LocalDate dateKirim, LocalDate dateTerima, Customer penerima, Courier kurir) {
        Transaction trans = new Transaction(noResi, dateKirim, dateTerima, penerima, kurir);
        this.historyTransaction.add(trans);
    }
}
