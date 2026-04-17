package Season_03;

class Account {
    String accountNumber;
    String accountHolderName;
    double balance;

    // Constructor
    Account(String accNo, String name) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = 0;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    double getBalance() {
        return balance;
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class AccountTest {
    public static void main(String[] args) {

        Account a1 = new Account("12345", "Hassan");

        a1.displayAccountInfo();

        a1.deposit(5000);
        a1.withdraw(2000);
        a1.withdraw(4000); // test insufficient

        System.out.println("Final Balance: " + a1.getBalance());

        a1.displayAccountInfo();
    }
}
