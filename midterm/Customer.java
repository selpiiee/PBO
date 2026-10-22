public class Customer extends User {
    private boolean verificationStatus = false;

    public boolean get_verification_status() {
        return verificationStatus;
    }

    public void apply_verification(String doc) {
        System.out.println("Verification applied using document: " + doc);
        this.verificationStatus = true;
    }
}
