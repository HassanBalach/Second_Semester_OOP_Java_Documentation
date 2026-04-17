package Season_01;
import java.util.Scanner;
public class Lab_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double monday , tuesday , wednesday , thursday , friday , saturday , sunday ;
        double totalDistance;
        System.out.print("Enter Distance Cover On Monday (in Km): ");
        monday = input.nextDouble();
        System.out.print("Enter Distance Cover On Tuesday (in Km): ");
        tuesday = input.nextDouble();
        System.out.print("Enter Distance Cover On Wednesday (in Km): ");
        wednesday = input.nextDouble();
        System.out.print("Enter Distance Cover On Thursday (in Km): ");
        thursday = input.nextDouble();
        System.out.print("Enter Distance Cover On Friday (in Km): ");
        friday = input.nextDouble();
        System.out.print("Enter Distance Cover On Saturday (in Km): ");
        saturday = input.nextDouble();
        System.out.print("Enter Distance Cover On Sunday (in Km): ");
        sunday = input.nextDouble();

        totalDistance = monday + tuesday + wednesday + thursday + friday + saturday + sunday;
        System.out.println("Total Distance run this Week: " + totalDistance + "km");

        input.close();

    }
}
