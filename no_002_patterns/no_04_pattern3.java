package no_002_patterns;

public class no_04_pattern3 {
    public static void main(String[] args) {
        

/*
-----   3RD PATTERN 

        3 2 1 
        3 2 1
        3 2 1 
*/
        int n = 3;
        for (int i = n; i >0; i--) {
            for (int j = n; j>0; j--) {
                System.out.print(j);
                
            }
            System.out.println();
            
        }
        System.out.println();

//     ----------- OR --------- 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n-j+1);
                
            }
            System.out.println();
            
        }





    }
}
