package no_002_patterns;
public class no_12_pattern11 {
    public static void main(String[] args) {
        /*----- PATTERN 11
        A B C
        D E F
        G H I
*/

int n = 3;
char ch = 'A';
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        System.out.print(ch + " ");
        ch++;
        
    }
    System.out.println();

}
    }
}
