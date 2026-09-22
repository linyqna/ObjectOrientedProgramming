package Quiz.Quiz1.no2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vehicle {
    private String plateNumber;
    private String brand;
    private String model;
    private String vehicleType; 
    private LocalDate serviceDate;
    private Employee mechanic;
    private ArrayList<Service> services;

    public Vehicle(String plateNumber, String brand, String model, String vehicleType, LocalDate serviceDate) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.vehicleType = vehicleType;
        this.serviceDate = serviceDate;
        this.services = new ArrayList<>();
    }

    public String getPlateNumber() { 
        return plateNumber; 
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() { 
        return brand; 
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() { 
        return model; 
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public String getVehicleType() { 
        return vehicleType; 
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    
    public LocalDate getServiceDate() { 
        return serviceDate; 
    }

    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }

    public Employee getMechanic() {
        return mechanic;
    }

    public void setMechanic(Employee mechanic) { 
        this.mechanic = mechanic; 
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }
    
    public void addService(Service service) { 
        this.services.add(service); 
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Service s : services) {
            total += s.getServicePrice();
        }
        
        if (this.vehicleType.equalsIgnoreCase("Car")) {
            total += 50000;
        } else if (this.vehicleType.equalsIgnoreCase("Motorcycle")) {
            total += 20000;
        }
        return total;
    }

    public String getInfo() {
        String info = "";
        info += "\tDate         : " + this.serviceDate + "\n";
        info += "\tVehicle Info : " + this.brand + " " + this.model + " (" + this.vehicleType + ") - " + this.plateNumber + "\n";
        info += "\tMechanic     : " + (this.mechanic != null ? this.mechanic.getName() + " (" + this.mechanic.getEmployeeId() + ")" : "Belum ditentukan") + "\n";
        info += "\tServices     :\n";
        
        if (!services.isEmpty()) {
            for (Service s : services) {
                info += s.getInfo(); 
            }
        } else {
            info += "\t  There is no service record yet.\n";
        }
        
        double serviceFee = this.vehicleType.equalsIgnoreCase("Car") ? 50000 : 20000;
        info += "\t  - Service Fee (" + this.vehicleType + ") (Rp" + serviceFee + ")\n";
        info += "\tTotal Cost   : Rp" + this.calculateTotalCost() + "\n";
        info += "\n";
        
        return info;
    }
}
