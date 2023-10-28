package no_002_patterns;

public class no_20_pattern19 {
    public static void main(String[] args) {
        

/*----- PATTERN 19

          ****
           ***
            **
             *
*/     
        int n = 4;
        for ( int i = n; i >= 1; i--) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                    
                }
            System.out.println();
            
        }
    }
}
