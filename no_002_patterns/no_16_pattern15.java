package no_002_patterns;

public class no_16_pattern15 {
    public static void main(String[] args) {

/*----- PATTERN 15
        A 
        B C
        C D E
 */



 int n =  3;
 char ch;
 for (int i = 0; i < n; i++) {
     for (int j = 0; j <= i; j++) {
         ch = (char) ('A' + i + j);
         System.out.print(ch + " ");
         
     }
     System.out.println();
     
 }
    }
}
