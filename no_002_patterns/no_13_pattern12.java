package no_002_patterns;

public class no_13_pattern12 {
    public static void main(String[] args) {
        
/*----- PATTERN 12 
        A B C 
        B C D
        C D E
 */

        int n =  3;
        char ch;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ch = (char) ('A' + i + j);
                System.out.print(ch + " ");
                
            }
            System.out.println();
            
        }

        
    }
}
