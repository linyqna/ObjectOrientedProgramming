package MidExam.tiga;

public class User {
    protected UserProfile profile;

    public User(UserProfile profile) {
        this.profile = profile;
    }

    public void log_in(int user_id, String password) {
        System.out.println("User ID " + user_id + " successfully logged in.");
    }

    public void recover_password() {
        System.out.println("Initiating password recovery process...");
    }

    public void log_out() {
        System.out.println("User logged out from the system.");
    }
}
