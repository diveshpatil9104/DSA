package no_002_patterns;

public class no_14_pattern13 {
    public static void main(String[] args) {
        

               
/*----- PATTERN 13 
        A 
        B B
        C C C
 */

        int n =  3;
        char ch;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                ch = (char) ('A' + i);
                System.out.print(ch + " ");
         
            }
         System.out.println();
     
        }

    }
}
