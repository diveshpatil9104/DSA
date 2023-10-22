package no_002_patterns;

/**
 * no_10_pattern9
 */
public class no_10_pattern9 {

    public static void main(String[] args) {

/*----- PATTERN 9 
        A A A 
        B B B
        C C C
 */

        int n = 3;
        char ch = 'A' ; 
        for(int line= 1; line <= n; line++){
            for (int  j = 1; j <=n; j++) {
                System.out.print(ch + " ");
                
                
            }
            System.out.println();
            ch++;
        }
      
    }
}