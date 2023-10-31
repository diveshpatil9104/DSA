package no_004_binary_decimal_numsystem;

import java.util.Scanner;

public class no_25_no_24_decToBin_bitmeth {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the decimal number you want to convert into binary number : ");
            int num = sc.nextInt();
            int mynum = num;

            int bin = 0;
            int pow = 0;

            while (num!=0) {
                 int bit  = num&1;

                bin = bin + (int) (bit * Math.pow(10, pow));

                pow++;
                num = num >>1;   // means shift by one in bitlevel operation (work as num = num/2)
 

            }
            System.out.println("binary of " + mynum + " : " + bin);

        }
        
    }
}
