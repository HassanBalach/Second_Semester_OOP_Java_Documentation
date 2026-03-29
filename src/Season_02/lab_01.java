package Season_02;

import java.util.Scanner;

public class lab_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your exam score");
        int score = input.nextInt();

        if(score <= 50){
            System.out.println("Fail");
        }else{
            System.out.println("Pass");
        }

        input.close();
    }

}
