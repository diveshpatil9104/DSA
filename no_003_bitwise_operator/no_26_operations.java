package no_003_bitwise_operator;

public class no_26_operations {
    public static void main(String[] args) {
        
/* ------------------------------------------ GET iTH BIT  ------------------------------------------------------------------------------------------------------------------   
      1. GET iTH BIT 

EG. n = 15   ,  i = 2; 
        BNINARY REPRESENTATION OF 15  00001111

        i = 2
        SO iTH BIT MEANS PUT iTH PLACE = 1 AND  OTHERS ARE O 

                       | 0 | 0 | 0 | 0 | 1 | 1 | 1 | 1 |
                  i =  | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 |
STEP   : 00001111      i=2  
----> &  00000100  ----->  1<<i   ()
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
        SO iTH BIT MEANS PUT iTH PLACE = 1 AND  OTHERS ARE O 

                       | 0 | 0 | 0 | 0 | 1 | 1 | 1 | 1 |
                  i =  | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 |
STEP   : 00001111      i=2  
----> |  00000100  ----->  1<<i   ()
        -----------
         00001111    
         ans is ----> 15
 */

        int n1 = 15;
        int i1 = 2;
        int bitmask1 = 1<<i1;
        System.out.println(n1|bitmask1);



/* ------------------------------------------ CLEAR iTH BIT  ------------------------------------------------------------------------------------------------------------------   
      3. CLEAR GET iTH BIT 

EG. n = 15   ,  i = 2; 
        BNINARY REPRESENTATION OF 15  00001111

        i = 2
        SO iTH BIT MEANS PUT iTH PLACE = 1 AND  OTHERS ARE O 

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
        SO iTH BIT MEANS PUT iTH PLACE = 1 AND  OTHERS ARE O 

                       | 0 | 0 | 0 | 0 | 1 | 1 | 1 | 1 |
                  i =  | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 |
STEP   : 00001111       
         00001100  -----> ~(0<<i)    (i=2 )
     & -----------
         00001100                                                               
                                                                            
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
 
 
 
 
 
 
    }
}
 