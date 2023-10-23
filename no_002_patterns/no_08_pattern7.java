package no_002_patterns;

public class no_08_pattern7 {
    public static void main(String[] args) {
        
/* ------- PATTERN 7

    1 
    2 3 
    3 4 5 
    4 5 6 7 
    
*/

    int n = 4;

    for (int line = 0; line < n; line++) {
        for (int num = 0; num <= line; num++) {
            System.out.print(line+num+1);
            
        }
        
        System.out.println();
    }
 
    }
}
