package no_002_patterns;


public class no_18_pattern17 {

    
    public static void main(String[] args) {


/*----- PATTERN 17
         
             *
            **
           ***
          ****
*/     
        int n = 4;
        for (int i = 1; i <= n; i++) {
            
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