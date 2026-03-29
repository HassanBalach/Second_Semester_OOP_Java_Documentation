package Season_02;

import java.util.Random;
import java.util.Scanner;

public class HomTask_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(100) + 1;
        System.out.println(secretNumber);

        System.out.println();
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println();
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have 7 attempts to guess it.");

        int attempt = 7;
        int i = 1;

        boolean guessCorrect = false ;

        for(i = 1 ; i <= attempt ; i++){

            System.out.print("Attempt 1: Enter your guess (1-100)");
             int guess = input.nextInt();

            if(guess == secretNumber){
                System.out.println("Congratulations! You guessed the number in " + i + " attempts.");
                break;
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            }else {
                System.out.println("Too low!");
            }


        }

        if(!guessCorrect){

            System.out.println("You lost! The number was: " + secretNumber);
        }

        input.close();
    }
}
