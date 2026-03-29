package Season_02;

import java.util.Scanner;

public class HomeTask_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Month:");
        int month = input.nextInt();
        input.nextLine();

        System.out.println("Enter hemisphere");
        char hemisphere =  input.nextLine().toUpperCase().charAt(0);

        if(month < 1 || month > 12 ){
            System.out.println("Invalid month! Please enter between 1 and 12.");
            return;
        }

        String season = " ";

        switch (month){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;

            case 3:
            case 4:
                season = "Spring";
                break;

            case 5:
            case 6:
            case 7:
                season = "Summer";
                break;

            case 8:
            case 9 :
            case 10 :
            case 11:
                season = "Autumn";
                break;

        }

        if(hemisphere == 'S'){
            switch (season){
                case "Winter":
                    season = "Summer";
                    break;

                case "Summer":
                    season = "Winter";
                    break;

                case "Spring":
                    season = "Autumn";
                    break;

                case "Autumn":
                    season = "Spring";
                    break;
            }
        } else if (hemisphere != 'N') {
            System.out.println("Invalid Hemisphere! Use N or S.");
            return;
        }

        System.out.println("Season: " + season);


    }
}
