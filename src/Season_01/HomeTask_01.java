package Season_01;

import java.util.Scanner;

public class HomeTask_01 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Simple Calculator ---");

        // 1. Get first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // 2. Get operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // 3. Get second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        // Perform the calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                validOperation = false;
        }

        // Print result if the operation was valid
        if (validOperation) {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }

        scanner.close(); // Always close the scanner when done
    }
}

