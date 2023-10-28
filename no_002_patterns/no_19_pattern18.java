package no_002_patterns;

public class no_19_pattern18 {
    public static void main(String[] args) {
        

/*----- PATTERN 18

        ****    
        ***
        **
        *
*/  
        int n = 4;

        for (int i = n; i >=1; i--) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
                
            }
            System.out.println();
        }
    }
}
