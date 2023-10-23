package no_002_patterns;

public class no_06_pattern5 {
    public static void main(String[] args) {
        
/*  PATTERN 5
        1
        22
        333
        4444
*/
        int n = 5;
        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(line);
                
            }
            System.out.println();
            
        }




    }
}
