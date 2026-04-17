package Season_04;

class Customer {
    // Private: Only accessible inside the Customer class
    private double balance;

    public Customer(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public: Accessible from anywhere
    public double getBalance() {
        return balance;
    }

    // Protected: Accessible in same package AND subclasses (like VIPCustomer)
    protected void setBalance(double amount) {
        this.balance = amount;
    }
}

class VIPCustomer extends Customer {

    public VIPCustomer(double initialBalance) {
        super(initialBalance);
    }

    // Overriding the protected method to add a specific rule
    @Override
    protected void setBalance(double amount) {
        if (amount >= 0) {
            super.setBalance(amount); // Calls the parent's setBalance safely
            System.out.println("VIP Balance updated successfully.");
        } else {
            System.out.println("Error: VIP Customers cannot have a negative balance.");
        }
    }
}

public class HomeTask_03 {
    public static void main(String[] args) {
        Customer normalCust = new Customer(100.0);
        VIPCustomer vipCust = new VIPCustomer(500.0);

        // ALLOWED: Calling public getBalance
        System.out.println("Normal Customer Balance: " + normalCust.getBalance());

        // ALLOWED: Calling protected setBalance (because Main is in the same package here)
        vipCust.setBalance(1000.0);
        System.out.println("VIP Customer Balance: " + vipCust.getBalance());

        // ALLOWED: Testing the overridden rule for VIP (no negatives)
        vipCust.setBalance(-50.0);

        // NOT ALLOWED (Uncomment to see the error):
        // System.out.println(normalCust.balance); // ERROR: balance has private access in Customer
    }
}

