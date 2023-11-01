package no_004_binary_decimal_numsystem;

import java.util.Scanner;

public class no_29_binToDec {
    public static void main(String[] args) {



        try (Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the Binary number you want to convert into Decimal  number : ");
        int num = sc.nextInt();
        int mynum = num;
        int dec = 0;
        int pow = 0;

        while (num!= 0) {

           int  lastDigit = num %10;
            dec = dec + (int)(lastDigit * Math.pow(2, pow));

            num = num /10;
            pow++;
        }
        System.out.println("Decimal number of " + mynum + " is : "  + dec);
    }
            
    }
}
