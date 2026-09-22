package Quiz.Quiz1.no2;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String phoneNumber;
    private ArrayList<Vehicle> vehicles;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vehicles = new ArrayList<>();
    }

    public String getName() { 
        return name; 
    }

    public String getPhoneNumber() { 
        return phoneNumber; 
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public String getInfo() {
        String info = "";
        info += "\n==== CUSTOMER DETAIL ====\n";
        info += "Name         : " + this.name + "\n";
        info += "Phone Number : " + this.phoneNumber + "\n";
        info += "Service History :\n";
        info += "\n ";
        
        if (!vehicles.isEmpty()) {
            for (Vehicle v : vehicles) {
                info += v.getInfo(); 
            }
        } else {
            info += "  There is No Vehicle History Yet.\n";
        }
        
        return info;
    }
}
