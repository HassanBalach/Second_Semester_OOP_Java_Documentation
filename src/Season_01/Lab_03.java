package Season_01;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Lab_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Original Price:");
        double productPrice = input.nextDouble();

        System.out.println("Enter Discount Percentage:");
        double discountPer = input.nextDouble();

        double discountAmount = (productPrice * discountPer) / 100;
        double finalPrice = productPrice - discountAmount;

        LocalDateTime now = LocalDateTime.now();

        System.out.println("Original Price: " + productPrice);
        System.out.println("Discount: " + discountPer + "%");
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("Transaction Date & Time: " + now);

    }
}


