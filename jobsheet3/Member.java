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
        if (amount <= 0) {
            System.out.println("Installment amount must be greater than 0!");
        } else if (amount > loanAmount) {
            System.out.println("Installment amount exceeds current loan!");
            loanAmount = 0;
        } else {
            loanAmount -= amount;
        }
    }
}
