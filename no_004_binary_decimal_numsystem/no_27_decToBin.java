package no_004_binary_decimal_numsystem;

import java.util.Scanner;

public class no_24_decToBin {

    public static void main(String[] args) { 
        
        try (Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the decimal number you want to convert into binary number : ");
        int num = sc.nextInt();
        int mynum = num;
        int binnum = 0;
        int pow = 0;

        while (num!=0) {

            int rem = num%2;
            binnum = binnum + (int)(rem * Math.pow(10, pow));
            pow++;

            num = num /2;
        }
         System.out.println("binary of  "+ mynum + " : " + binnum);
    }            

                   
    }
}