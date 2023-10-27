package no_002_patterns;

public class no_17_pattern16 {
    public static void main(String[] args) {



/*----- PATTERN 16
        D 
        C D 
        B C D
        A B C D 
 */
        int n = 4;
        char ch;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                ch = (char) ('A' + n - i-1+j);
                System.out.print(ch);
                
                
            }
            System.out.println();
            
        }
        

    }
}
