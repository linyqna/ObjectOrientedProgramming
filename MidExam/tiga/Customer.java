package MidExam.tiga;

public class Customer extends User {
    private boolean verification_status = false; 

    public Customer(UserProfile profile) {
        super(profile);
    }

    public boolean get_verification_status() {
        return verification_status;
    }

    public void apply_verification(String docFileName) {
        System.out.println("Need to upload document for verification.\n");
        System.out.println("Customer " + profile.get_name() + " upload document: " + docFileName);
        System.out.println("Waiting for Admin approval...");
    }
}
