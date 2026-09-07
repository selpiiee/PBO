package jobsheet3;

public class User {
    public String username;
    public String name;
    public String email;
    public String address;
    public String job;

    public User(String username, String name, String email) {
        this.username = username;
        this.name = name;
        this.email = email;
    }

    public void printInfo() {
        System.out.println("Username\t: " + username);
        System.out.println("Name\t\t: " + name);
        System.out.println("Email\t\t: " + email);
        System.out.println("Address\t\t: " + address);
        System.out.println("Job\t\t: " + job);
        System.out.println("=========================");
    }
}
