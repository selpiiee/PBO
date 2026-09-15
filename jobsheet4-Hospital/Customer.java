import java.util.ArrayList;

public class Customer {
    private String name;
    private String email;
    private String phoneNum;
    private ArrayList<PreOrder> orderList;

    public Customer(String name, String email, String phoneNum) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.orderList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void createOrder(PreOrder order) {
        orderList.add(order);
    }

    public ArrayList<PreOrder> getOrderList() {
        return orderList;
    }

    public void getInfo() {
        System.out.println("Customer Name : " + name);
        System.out.println("Email         : " + email);
        System.out.println("Phone Number  : " + phoneNum);
        System.out.println("Total Orders  : " + orderList.size());
        System.out.println("---------------------------------");
    }
}
