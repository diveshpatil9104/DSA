package no_002_patterns;

public class no_21_pattern20 {
    public static void main(String[] args) {
        


/*----- PATTERN 20
         
   1   
  121
 12321
1234321

*/     

        int n = 4;

        // PRINTING LINES

        for (int i = 1; i <=n; i++) {

            // PRINTING SPACES
            for (int j =  1; j <= n-i; j++) {
                System.out.print(" ");

            }
                
            // PRINTING 1ST TRIANGLE
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

                // PRINTING 2ND TRIANGLE 
                for (int l = i - 1; l >= 1; l--) {
                    System.out.print(l);
                }
    
            System.out.println();
            
        }
            



    }
}
