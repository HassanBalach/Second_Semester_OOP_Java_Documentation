package Season_02;

import java.util.Scanner;

public class Lab_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is current temperature?");
        int temperature = input.nextInt();
        input.nextLine();

        System.out.println("How is the whether? (raining or sunny). ");
        String weatherCondition = input.nextLine();

        if(temperature <= 0 ){
            if(weatherCondition.equalsIgnoreCase("raining")){
                System.out.println("Wear a heavy coat and take an umbrella.");
            }else if(weatherCondition.equalsIgnoreCase("sunny")){
                System.out.println("Wear a heavy coat and sunglasses.");
            }
        }else if(temperature > 0 && temperature <= 10){
            if(weatherCondition.equalsIgnoreCase("raining")){
                System.out.println("Wear a warm jacket and take an umbrella.");
            }else if(weatherCondition.equalsIgnoreCase("sunny")){
                System.out.println("Wear a warm jacket and sunglasses.");
            }
        } else if (temperature >= 11 && temperature <= 20) {
            if(weatherCondition.equalsIgnoreCase("raining")){
                System.out.println("Wear a light jacket and take an umbrella.");
            }else if(weatherCondition.equalsIgnoreCase("sunny")){
                System.out.println("Wear a light jacket and sunglasses.");
            }
        } else {
            if(weatherCondition.equalsIgnoreCase("raining")){
                System.out.println("Wear light clothing and take an umbrella.");
            }else if(weatherCondition.equalsIgnoreCase("sunny")){
                System.out.println("Wear light clothing and sunglasses.");
            }
        }

    }


}
