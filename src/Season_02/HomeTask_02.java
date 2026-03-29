package Season_02;

public class HomeTask_02 {
    public static void main(String[] args) {
        int i, j;
        for(i = 5 ; i >= 1; i--){
            for (j = 1; j <= i  ; j++){
                System.out.print(j);
            }
            System.out.println( " ");
        }


        int n = 5;
        for( i = 1; i <= n; i++) {

            // Spaces
            for( j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Increasing numbers
            for( j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Decreasing numbers
            for( j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }


        for( i = n - 1; i >= 1; i--) {

            for( j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for( j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for( j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

}
