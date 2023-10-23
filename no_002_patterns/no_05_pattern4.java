package no_002_patterns;

public class no_05_pattern4 {
    public static void main(String[] args) {
        
/*
  ------- PATTERN 5
        
  *
  **
  ***
  ****

*/
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int star = 1; star <= i ; star++) {
                System.out.print("*");
                
            }
            System.out.println();
        }






    }
}
