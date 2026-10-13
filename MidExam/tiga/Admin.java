package MidExam.tiga;

public class Admin extends User {
    public Admin(UserProfile profile) {
        super(profile);
    }

    public void update_vehicle_details(String vehicle_id) {
        System.out.println("Admin updated details for vehicle ID: " + vehicle_id);
    }

    public Vehicle add_vehicle() {
        System.out.println("Admin added a new vehicle to the system.");
        return new Vehicle("VEH-999");
    }

    public void Retrieve_complain() {
        System.out.println("Admin retrieved and reviewed customer complaints.");
    }

    public void verify_user(Customer customer) {
        System.out.println("Admin verified the account of customer: " + customer.profile.get_name());
    }
}
