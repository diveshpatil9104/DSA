package no_002_patterns;

public class no_22_pattern21 {
    
    public static void main(String[] args) {


/*----- PATTERN 19
        1234554321
        1234**4321
        123****321
        12******21
        1********1
  */      
        int n = 5;



        // FOR PRINTING LINES 

        for ( int i = 1; i <= n; i++) {
            
            // FOR PRINTING 1ST TRIANGLE
            for (int j = n; j >= i; j--) {
                System.out.print(n-j+1);

                
            } 

            // FOR PRINTING STARS
            for (int k = 1; k <i ; k++) {
                System.out.print("**");
                
            }

            // FOR PRINTING 2ND TRIANGLE
            
            for (int l = n; l >= i; l--) {
                System.out.print(l-i+1);

                
            }

            System.out.println();
        }


    }
}
