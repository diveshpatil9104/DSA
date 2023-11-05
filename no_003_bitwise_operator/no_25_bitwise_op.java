package no_003_bitwise_operator;

public class no_25_bitwise_op {
    public static void main(String[] args) {
        
        // BITWISE OPERATORS
// -------------------------------------------BITWISE AND -------------------------------------------------------------------------------------------------------
/*  1. Binary AND & : 

        1  0  ----> 0
        0  0  ----> 0
        0  1  ----> 0
        1  1  ----> 1

FOR EG. ----> 5 & 6 
                      
BINARY REPRESENTAION OF 5 AND 6 :

        5 ---->  0101
        6 ---->  0110

        ANS ---->   0101
                  & 0110
                  --------  
                    0100    -----> 0100 IS 4 IN BINARY SO ANS IS : 4 IN DECIMAL

*/

        int a = 5;
        int b = 6;
        System.out.println("\nAND BIWISE OPERATOR : " + (a&b));   // HERE ANSWER IS 4 
/*
------------------------------------------------- BITWISE OR -----------------------------------------------------------------------------------
  
    2. Binary OR | : 

        1 | 0  ----> 1
        0 | 0  ----> 0
        0 | 1  ----> 1
        1 | 1  ----> 1

FOR EG. ----> 5 & 6 

BINARY REPRESENTAION OF 5 AND 6 :

        5 ---->  0101
        6 ---->  0110

        ANS ---->   0101
                  | 0110
                  --------  
                    0111    -----> 0111 IS  IN BINARY SO ANS IS : 7 IN DECIMAL

*/
        System.out.println("\nOR BIWISE OPERATOR : " + (5 | 6));

/* 
-------------------------------------------------- BITWISE XOR ------------------------------------------------------------------------------------------------------------------
  
    3. Binary XOR ^ : 

        1 ^ 0  ----> 1
        0 ^ 0  ----> 0
        0 ^ 1  ----> 1
        1 ^ 1  ----> 0

FOR EG. ----> 5 & 6 

BINARY REPRESENTAION OF 5 AND 6 :

        5 ---->  0101
        6 ---->  0110

        ANS ---->   0101
                  ^ 0110
                  --------  
                    0011    -----> 0011 IS IN BINARY SO ANS IS : 3 IN DECIMAL
 */

        System.out.println("\nXOR BITWISE OPERATOR : " + (5^6));  
   
/*   

--------------------------------------------- BINMARY ONE'S COMPLEMENT ----------------------------------------------------------------------------------------------------------------------------
     
    4. BINARY ONE'S COMPLEMENT ~

        ~1 ----> 0  
        ~0 ----> 1
        
        FOR EG. ~5    
        
BIANRY REPRESENTATION OF 5 : 

        5 ----> 0101

        ANS ---->    ~0101 ----> 1010
                   => 1010 IS IN BINARY SO ANS IS : 10 IN DECIMAL
*/   
        System.out.println("\nONE'S COMPLEMENT : " + (~5));     
/*  THIS ONE'S COMPLEMENT CODE GIVEN -6 OUTPUT BCOZ IN MEMORY 


The line of code `System.out.println("\nONE'S COMPLEMENT : " + (~5));` gives you the result `-6` because it's using the one's complement operator (`~`) in Java, which flips all the bits in the binary representation of the number. Here's a detailed explanation:

1. Binary Representation of 5: In binary, the decimal number 5 is represented as `00000101`. It's a positive number.

2. One's Complement Operation: When you apply the one's complement operator (~) to a number, it flips all the bits. So, `~00000101` becomes `11111010`.

3. Decimal Representation of the Result: Now, let's convert the one's complement result `11111010` back to decimal. In two's complement representation .. so , `11111010` becomes '00000101'
    the leftmost bit represents the sign (0 for positive and 1 for negative), and the remaining bits represent the magnitude.

   - in fist complement The leftmost bit is 1, which indicates a negative number.
   - The remaining bits `1111010` represent the magnitude.

4.Magnitude Calculation: To find the magnitude, we can perform the two's complement operation (flipping the bits and adding 1 to the result). 
However, in this case, 00000101
                      +       1
                      ----------
                       00000110     ---->  110 IS IN BINARY AND IN DECIMAL IT IS 6

5. Adding the Sign : Since the leftmost bit was 1 (indicating a negative number), you add a minus sign to the magnitude. so (6 becomes -6)

6.  Result: ~ 5 ---->  -6


--------------------------------------------------- BINARY LEFT SHIFTING ---------------------------------------------------------------------------------------------------------------------------

        5.  BINARY LEFT SHIFTING

 EG.         5 << 2
 MEANS ----> LEFT SHIFT OF 5 WITH 2 PLACE ... (THIS WILL BE HAPPENS IN BIT LEVEL OPERATION)

        5 << 2

        REPRESENTATION OF 5 IN BINARY 

        000101
        5<<2

ANS -->  010100    ---->> REMOVE FIRST 2 PLACE AND INSERT 0 IN LAST BY 2 TIMES  BECOZ WE  PERFORMED LEFT SHIFTING BY 2 
SO 010100 IN DECIMAL FORM WILL BE ----->> 20

THE DERIVATION IS ---->> a << b = a * 2^b
                eg.      5 << 2 = 5 * 2^2 ---->  20


*/

        System.out.println("\nBINARY LEFT SHIFTING : " + (5<<2));  // ans is 20

/* 

------------------------------------------------------- BINARY RIGHT SHIFT -------------------------------------------------------------------------------

       6.  BINARY RIGHT SHIFTING

 EG.         5 >> 2
 MEANS ----> LEFT SHIFT OF 5 WITH 2 PLACE ... (THIS WILL BE HAPPENS IN BIT LEVEL OPERATION)

        5 >> 2

        REPRESENTATION OF 5 IN BINARY 

        000101
        5 >> 2

ANS -->  000001    ---->> REMOVE LAST 2 PLACE AND INSERT 0 IN FIRST BY 2 TIMES  BECOZ WE PERFORMED RIGHT SHIFTING BY 2 
SO 000001 IN DECIMAL FORM WILL BE ----->> 1

THE DERIVATION IS ---->> a >> b = a / 2^b
                eg.      5 >> 2 = 5 / 2^2 ---->  1

*/
        System.out.println("\nBINARY RIGHT SHIFTING : " + (5 >> 2));
        System.out.println();
  

   
    }
}

