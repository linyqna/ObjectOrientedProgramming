package MidExam.tiga;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("\n====================================================");
        System.out.println("\t\tSYSTEM INITIALIZATION");
        System.out.println("====================================================\n");

        UserProfile customerProfile = new UserProfile(101, "pw123", "John Doe", 30, "john@email.com", "id_card.pdf");
        UserProfile adminProfile = new UserProfile(999, "adminPass", "Alice Root", 45, "admin@system.com", "admin_badge.jpg");

        Customer customer1 = new Customer(customerProfile);
        Admin admin1 = new Admin(adminProfile);

        System.out.println("\t----- Customer Flow -----\n");

        System.out.println("   Customer Log-In:\n");
        customer1.log_in(customerProfile.get_User_id(), customerProfile.get_password());
        customerProfile.show_documents();
        
        System.out.println("\n   Customer Verification:\n");
        System.out.println("Current Verification Status: " + customer1.get_verification_status());
        customer1.apply_verification("id_card.pdf");

        System.out.println("\n   Customer Log-Out:\n");
        customer1.log_out();
        System.out.println();

        System.out.println("\t----- Admin Flow -----\n");

        System.out.println("   Admin Log-In:\n");
        admin1.log_in(adminProfile.get_User_id(), adminProfile.get_password());
        admin1.Retrieve_complain();
        
        System.out.println("\n   Admin Verification:\n");
        admin1.verify_user(customer1);
        
        System.out.println("\n   Admin Retrive Complain:\n");
        Vehicle newVehicle = admin1.add_vehicle();
        admin1.update_vehicle_details(newVehicle.getVehicleId());
        
        System.out.println("\n   Admin Log-Out:\n");
        admin1.log_out();
    }
}
