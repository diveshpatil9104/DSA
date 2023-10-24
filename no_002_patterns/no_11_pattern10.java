package no_002_patterns;

/**
 * no_11_pattern10
 */
public class no_11_pattern10 {

    public static void main(String[] args) {

/*----- PATTERN 10 
        A B C
        A B C
        A B C
*/

        int n = 4;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(ch + " ");
                ch++;
                
            }
            System.out.println();
            ch = 'A';
        }


    }
}