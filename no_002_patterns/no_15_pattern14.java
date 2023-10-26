package no_002_patterns;

public class no_15_pattern14 {
    public static void main(String[] args) {
        
/*----- PATTERN 14
        A 
        B C
        D E F G
 */

        int n = 4;
        char ch = 'A';
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(ch + " ");
                ch++;
                
            }
            System.out.println();
        }
        
    }
}
