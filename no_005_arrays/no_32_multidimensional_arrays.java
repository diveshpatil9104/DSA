package no_005_arrays;

import java.util.Scanner;

/**
 * no_28_multidimensional_arrays
 */
public class no_32_multidimensional_arrays {

    public static void main(String[] args) {
//        int [] marks ;  // A 1-D ARRAY
        int [] [] flats; // A 2-D ARRAY
        flats = new int [2][3]; 
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        
// ----->  Displying the 2d array (for loop) <------
/*         System.out.println("Printing a 2-D array using for loop");

        for(int i=0; i<flats.length; i++){    // flat length is 2
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
           System.out.println();
        }
*/ 

// ------->> Taking input in 2D array


        int numbers[][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        int n = numbers.length , m = numbers[0].length;
        System.out.print("enter the numbers: ");

        for (int i = 0; i < n; i++) {
            for(int j = 0; j< m; j++){
                numbers[i][j] = sc.nextInt();
                System.out.print(numbers[i][j] + " ");

            }
            System.out.println();
        }

        // for output

        // for (int i = 0; i < n; i++) {
        //     for(int j = 0; j< m; j++){
        //         System.out.print(numbers[i][j] + " ");
        //     }
        //     System.out.println();
        // }


// WE STUDY THIS TOPIC IN UPCOMING CODE IN DETAIL SO WE DONT INCLUDE THIS TOPIC QUESTIONS IN PRACTICE SET 


    }
}