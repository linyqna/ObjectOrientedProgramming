package Quiz.Quiz1.no1;

import java.util.ArrayList;
import java.time.LocalDate;

public class Customer {
    private String customerID;
    private String customerName;
    private String address;
    private String phone;
    private ArrayList<Order> historyOrders;

    public Customer(String customerID, String customerName, String address, String phone) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
        this.historyOrders = new ArrayList<>();
    }

    public ArrayList<Order> getHistoryOrders() {
        return historyOrders;
    }

    public void setHistoryOrders(ArrayList<Order> historyOrders) {
        this.historyOrders = historyOrders;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addCustomer() {
        System.out.println("Customer " + customerName + " successfully added.");
    }

    public void editCustomer(String newName, String newAddress, String newPhone) {
        if (newName != null) {
            this.customerName = newName;
        } if (newAddress != null) {
            this.address = newAddress;
        } if (newPhone != null) {
            this.phone = newPhone;
        }

        System.out.println("Customer data is updated.");
    }

    public void deleteCustomer() {
        if (!historyOrders.isEmpty()) {
            this.customerID = null;
            this.customerName = null;
            this.address = null;
            this.phone = null;
            historyOrders.clear();
        }

        System.out.println("Customer data is deleted.");
    }

    public String getInfo() {
        String info = "";
        info += "\n==== CUSTOMER DETAIL ====\n";
        info += "ID            : " + this.customerID + "\n";
        info += "Name          : " + this.customerName + "\n";
        info += "Address       : " + this.address + "\n";
        info += "Phone Number  : " + this.phone + "\n";
        info += "Order History : \n";

        if (!historyOrders.isEmpty()) {
            System.out.println("");
            for (Order ord : historyOrders) {
                info += ord.getInfo();
            }
        } else {
            info += "\tThere is No Order History Yet.";
        }

        info += "\n";
        return info;
    }

    public void addOrder(String orderID, int amount, LocalDate orderDate, Product product) {
        Order ord = new Order(orderID, this, amount, orderDate);
    
        if (product != null) {
            ord.addProduct(product);
        }
        
        this.historyOrders.add(ord);
        System.out.println("Order " + orderID + " successfully added for customer " + this.customerName);
    }
}
