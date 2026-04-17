package Season_04;

import java.util.Date;

// Base Account Class
class Account {
    protected int id;
    protected double balance;
    protected Date dateCreated;

    // Default Constructor
    public Account() {
        this.id = 0;
        this.balance = 0.0;
        this.dateCreated = new Date();
    }

    // Parameterized Constructor
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }
}

// Child Class
class CheckingAccount extends Account {
    private boolean isOverdraftAllowed;

    // CheckingAccount Constructor
    public CheckingAccount(int id, double balance, boolean isOverdraftAllowed) {
        super(id, balance); // Calls the Parameterized Constructor of Account
        this.isOverdraftAllowed = isOverdraftAllowed;
    }

    // Getters and Setters
    public boolean getIsOverdraftAllowed() {
        return isOverdraftAllowed;
    }

    public void setIsOverdraftAllowed(boolean isOverdraftAllowed) {
        this.isOverdraftAllowed = isOverdraftAllowed;
    }

    public void showAccountInfo() {
        System.out.println("ID: " + id + " | Balance: $" + balance +
                " | Overdraft Allowed: " + isOverdraftAllowed +
                " | Created: " + dateCreated);
    }
}

public class HomeTask_02 {
    public static void main(String[] args) {
        CheckingAccount acc1 = new CheckingAccount(101, 500.0, true);
        acc1.showAccountInfo();
    }
}
