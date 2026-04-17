package Season_01;

import java.util.Date;
import java.util.Scanner;

public class HomeTask_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- 1. Current Date and Time ---");
        // Create a new Date object (it automatically captures the current time)
        Date currentDate = new Date();
        System.out.println("System Date and Time: " + currentDate.toString());

        System.out.println("\n--- 2. Math Operations ---");
        System.out.print("Enter a number to perform math operations on: ");
        double number = scanner.nextDouble();

        System.out.print("Enter an exponent (for power calculation): ");
        double exponent = scanner.nextDouble();

        System.out.println("\n--- Results ---");
        // Square Root
        double squareRoot = Math.sqrt(number);
        System.out.printf("Square Root of %.2f: %.4f%n", number, squareRoot);

        // Trigonometry (Note: Math trig functions expect radians, not degrees)
        double sineVal = Math.sin(number);
        double cosVal = Math.cos(number);
        double tanVal = Math.tan(number);

        System.out.printf("Sine: %.4f%n", sineVal);
        System.out.printf("Cosine: %.4f%n", cosVal);
        System.out.printf("Tangent: %.4f%n", tanVal);

        // Power
        double powerResult = Math.pow(number, exponent);
        System.out.printf("%.2f raised to the power of %.2f: %.4f%n", number, exponent, powerResult);

        // Random Number (Generates a double between 0.0 and 1.0)
        double randomNum = Math.random();
        System.out.printf("Random Number (between 0 and 1): %.4f%n", randomNum);

        scanner.close();
    }
}
