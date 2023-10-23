package no_002_patterns;

public class no_09_pattern8 {

    public static void main(String[] args) {

/*----PATTERN 8 

        1
        2 1 
        3 2 1
        4 3 2 1
        
*/
        
        int n = 4;
        for (int line = 1; line <= n; line++) {
        for (int num = 1; num <= line; num++) {
            System.out.print(line-num+1);
            
        }
        System.out.println();
            
        }

        
    }
}