package Quiz.Quiz1.no1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private String orderID;
    private int amount;
    private LocalDate orderDate;
    private Customer cust;
    private ArrayList<Product> products;

    public Order(String orderID, Customer cust, int amount, LocalDate orderDate) {
        this.orderID = orderID;
        this.cust = cust;
        this.amount = amount;
        this.orderDate = orderDate;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product != null) {
            Stock stock = product.getStok();
            
            if (stock != null && stock.getQuantity() > 0) {
                this.products.add(product);
                stock.setQuantity(stock.getQuantity() - 1);
                
                System.out.println("Product " + product.getProductName() + " successfully added to order " + this.orderID + ". Stock remaining: " + stock.getQuantity());
            } else {
                System.out.println("Failed to add " + product.getProductName() + ": Stock is empty or not assigned!");
            }
        }
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public void createOrder() {
        System.out.println("Order with ID " + orderID + " was successfully submitted.");
    }

    public void editOrder(int newAmount, LocalDate newOrderDate) {
        if (newAmount > 0) {
            this.amount = newAmount;
        } 
        if (newOrderDate != null) {
            this.orderDate = newOrderDate;
        }
        System.out.println("Order data is updated.");
    }

    public String getInfo() {
        String info = "";
        info += "\n\t------ Order Detail ------\n";
        info += "\tOrder ID           : " + this.orderID + "\n";
        info += "\tOrder Date         : " + this.orderDate + "\n";
        info += "\tTotal Amount       : " + String.valueOf(amount) + "\n";
        info += "\tOrdered Products   :\n";
        
        if (products.isEmpty()) {
            info += "No products added";
        } else {
            for (Product p : products) {
                info += "\n\t   -" + p.getProductName() + ", Price: " + String.format("%.0f", p.getProductPrice())  + "\n";
            }
        }

        return info;
    }
}
