package Season_04;

class PaymentProcessor {

    // 1. No parameters
    public void processPayment() {
        System.out.println("Processing default payment.");
    }

    // 2. One integer parameter
    public void processPayment(int amount) {
        System.out.println("Processing payment of amount " + amount + ".");
    }

    // 3. Two parameters (integer and string)
    public void processPayment(int amount, String customerName) {
        System.out.println("Processing payment of " + amount + " for " + customerName + ".");
    }
}

public class Lab_01 {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Calling the overloaded methods
        processor.processPayment();                  // Calls the first method
        processor.processPayment(500);               // Calls the second method
        processor.processPayment(1500, "Ali");       // Calls the third method
    }
}