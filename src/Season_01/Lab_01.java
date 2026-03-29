package Season_01;

import java.util.Scanner;

public class Lab_01 {
    public static void main(String[] args) {
        //Creating Scanner Object:
        Scanner input = new Scanner(System.in);

        System.out.println("Enter  your first name?");
        String firstName = input.nextLine();

        System.out.println("Enter your Last Name?");
        String lastName = input.nextLine();

        System.out.println("Enter your age? ");
        int age = input.nextInt();
        input.nextLine();

        int futureAge = age + 5;

        System.out.println("Welcome " +firstName + " " +lastName );
        System.out.println( "You will be " + futureAge + " after 5 year from now");

    }
}
