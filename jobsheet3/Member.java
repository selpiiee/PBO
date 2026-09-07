package jobsheet3;

public class Member {
    private String idCardNumber;
    private String name;
    private int limitLoan;
    private int loanAmount;

    public Member(String idCardNumber, String name, int limitLoan) {
        this.idCardNumber = idCardNumber;
        this.name = name;
        this.limitLoan = limitLoan;
        this.loanAmount = 0;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public String getName() {
        return name;
    }

    public int getLimitLoan() {
        return limitLoan;
    }

    public int getLoaAmount() {
        return loanAmount;
    }

    public void loan(int amount) {
        if (loanAmount + amount > limitLoan) {
            System.out.println("Sorry, the loan amount exceeds the Limit!");
        } else {
            loanAmount += amount;
        }
    }

    public void installment(int amount) {
        if (amount < (0.10 * loanAmount)) {
            System.out.println("Sorry, the installment must be 10% of the loan amount");
        } else if (amount > loanAmount) {
            System.out.println("Installment amount exceeds current loan!");
            loanAmount = 0;
        } else {
            loanAmount -= amount;
        }
    }
}
