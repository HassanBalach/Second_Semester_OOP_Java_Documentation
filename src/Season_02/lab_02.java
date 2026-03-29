package Season_02;

public class lab_02 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        for(i = 1; i <= 100 ; i++)
            if(i % 2 == 0){
            sum = sum + i;
       }
        System.out.println("Total Sum of All Even Number ( 1 to 100 ) are: " + sum );
    }
}
