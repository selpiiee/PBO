public class UserProfile {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    private String doc; // jpg, png, pdf

    public int getUser_id() { return userId; }
    public String getPassword() { return password; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return emailId; }
    
    public void edit_profile() {
        System.out.println("Profile updated successfully.");
    }

    public void show_documents() {
        System.out.println("Displaying document: " + doc);
    }
}
