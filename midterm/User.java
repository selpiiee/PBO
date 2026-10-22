public class User {
    protected int userId;
    protected String password;

    public boolean log_in(int userId, String password) {
        return this.userId == userId && this.password.equals(password);
    }

    public void recover_password() {
        System.out.println("Password recovery initiated.");
    }

    public void log_out() {
        System.out.println("User logged out.");
    }
}
