package no_003_bitwise_operator;

public class no_26_operations {
    public static void main(String[] args) {
        
/* ------------------------------------------ GET iTH BIT  ------------------------------------------------------------------------------------------------------------------   
      1. GET iTH BIT 

EG. n = 15   ,  i = 2; 
        BNINARY REPRESENTATION OF 15  00001111

        i = 2
        SO GET iTH BIT MEANS PUT iTH PLACE = 1 AND  OTHERS ARE O 

                       | 0 | 0 | 0 | 0 | 1 | 1 | 1 | 1 |
                  i =  | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 |
STEP   : 00001111      i=2  
----> &  00000100  ----->  1<<i   (2)
        -----------
         0001000 
         ans is ----> 1 (means 1 is present in ith 2 place )
 */

        int n = 10;
        int i = 3;
        int bitmask = 1<<i;

        if ((n & bitmask )== 0) {
            System.out.println("0");

            
        } else {
            System.out.println("1");        


            
        }
// BINARY REPRESENTATION OF 10 IS 1010  AND ith(3) bit is 1

        
/* ------------------------------------------ SET iTH BIT  ------------------------------------------------------------------------------------------------------------------   
      2. SET iTH BIT 

EG. n = 15   ,  i = 2; 
        BNINARY REPRESENTATION OF 15  00001111

        i = 2
        SO SET iTH BIT MEANS SET iTH BIT (SET 0 AS 1 AND 1 AS 1).. 0 HOGA TO 1 KARNEKA AND 1 KA 1 HI RAHEGA KYONKI O ALREDY 1 PE SET HAIN 🙂


                       | 0 | 0 | 0 | 0 | 1 | 1 | 1 | 1 |
                  i =  | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 | 
STEP   : 00001111      i=2  
----> |  00000100  ----->  1<<i   (2)
        -----------
         00001111    
         ans is ----> 15
 */
 
        int n1 = 15;
        int i1 = 2;
        int bitmask1 = 1<<i1;
        System.out.println(n1|bitmask1);



/* ------------------------------------------ CLEAR iTH BIT  ------------------------------------------------------------------------------------------------------------------   
      3. CLEAR iTH BIT 

EG. n = 15   ,  i = 2; 
        BNINARY REPRESENTATION OF 15  00001111

        i = 2
        SO CLEAR iTH BIT MEANS CLEAR iTH BIT (SET 0 AS 0 AND 1 AS 0).. 1 HOGA TO 0 KARNEKA AND 0 KA 0 HI RAHEGA KYONKI O ALREDY CLEAR HAIN 🙂


                       | 0 | 0 | 0 | 0 | 1 | 1 | 1 | 1 |
                  i =  | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 |
STEP   : 00001111       
         11111011  -----> ~(1<<i)    (i=2 )
     & ----------- 
         00001011                                                               
                                                                            
         ans is ----> 11                                                          
 */                                                                            

        int n2 = 15;
        int i2 = 2;
        int bitmask2 = ~(1<<i2);
        System.out.println(n2&bitmask2);
 

        
/* ------------------------------------------ CLEAR LAST BIT  ------------------------------------------------------------------------------------------------------------------   
      4. CLEAR LAST BIT 

EG. n = 15   ,  i = 2; 
        BNINARY REPRESENTATION OF 15  00001111

        i = 2
        SO CLEAR LAST iTH BIT MEANS CLEAR iTH BIT (SET 0 AS 0 AND 1 AS 0 FOR ALL LAST TO iTH).. 1 HOGA TO 0 KARNEKA AND 0 KA 0 HI RAHEGA KYONKI O ALREDY CLEAR HAIN 🙂


                       | 0 | 0 | 0 | 0 | 1 | 1 | 1 | 1 |
                  i =  | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 |
STEP   : 00001111       
         00001100  -----> ~(0<<i)    (i=2 )
     & -----------
         00001100    // HERE WE CLEAR LAST ALL 2 BIT BCOZ I IS 2                                                            
                                                                            
         ans is ----> 12                                                     
 */ 
         int n3 = 15;
        int i3 = 2;
        int bitmask3 = (~0)<<i3;
        System.out.println(n3&bitmask3);


/* ------------------------------------------ CLEAR RANGE OF BIT  ------------------------------------------------------------------------------------------------------------------   
      4. CLEAR RANGE OF BIT 

EG. n = 15   ,  i = 2; 
        BNINARY REPRESENTATION OF 15  00001111

        i = 2
        SO iTH BIT MEANS PUT iTH PLACE = 1 AND  OTHERS ARE O 

                       | 0 | 0 | 0 | 0 | 1 | 1 | 1 | 1 |
                  i =  | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 |
STEP   : 00001111       
         00001100  -----> ~(0<<i)    (i=2 )
     & -----------
         00001100                                                               
                                                                            
         ans is ----> 12                                                     
 */ 
        int n4 = 10;
        int i4 = 2;
        int j = 4;
        int a = ((~0)<< (j+1));
        int b = (1<<i4)-1;
        int bitmask4 = a|b;
        System.out.println(n4&bitmask4);

 
        /* 
        QUESTION :  CHECK IF A NUMBER IS A POWER OF TOW OR NOT ...

        IN BINARY NUMBER THE & OF n and n-1 IS ALWAYS ZERO ... 
        for eg..

        4 & 3

        4 ---->  100
        3 ---->  001
        100
      & 001
      -------  
        0 

        16 & 15
        
        16 ---->  10000
        15 ---->  01111
        10000
      & 01111
        -----
          0  

      */
 
        int num = 4;
        if ((num&(num-1)) == 0) {
                System.out.println("Number is  Power of Zero");

        }else{
                System.out.println("Number is not Power of zero");      
                
        }
 
/*
         
        QUESTION : COUNT SET BIT IN A NUMBER 

        FOR EG: BINARY REPRESENTATION OF 10 IS :

        1010  :  NO OF SET BIT IS 2 ... 
EXPLANATION :  IN BINARY NUMBER SET BIT MEANS 1 HAS A TWO OCCURANCE..

HOW TO SOLVE THIS : 

        1.      n = 1010 
                n>>1            count 0 

        2.      n= 0101         count 1 
                n>>1
                                                using odd and even alogo ( number & 1 == 0 (even) else odd  )
        3.      n= 0010         count 1 
                n>>1

        4.      n = 0001        count 2 
                n>>1

        5.      n = 0000        
        if number is 0 then stop 

        ans ----->> count 2








         */
 
 
    }
}
