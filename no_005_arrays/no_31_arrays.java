package no_005_arrays;



/**
 * no_27_arrays
 */
public class no_31_arrays {


//-->>  function for linear searching.....
 
    public static int linSearch( int numbers[] , int key){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]== key ){
                return i ;
            }
         }
         return -1 ; 
    
        }





    public static void main(String[] args) {
        
//      float[] marks={100,70.5f,67.5f,86.5f,48,96,54};
 //     String[]marks={"raj","tejas","divesh","harshal"};
        
        // int[] marks={100,70,67,86,48,96,54};
 //    System.out.println(marks.length);
       
//   DISPLAYING THE ARRAY (NOOB WAY) 🫠  
/*      System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);
        
*/  
//   -----> DISPLAYING THE ARRAY BY FOR LOOP 😗 <------
/*
        for(int i =0; i<marks.length; i++){
            System.out.println("printing using for loop : ");
            System.out.println(marks[i]); // IS CALLED ARRAY TRAVERRSAL...
        }
    */    
// QUICK QUIZ ----> WRITE A JAVA PROGRAM TO PRINT THE ELEMENT OF AN ARRAY IN REVERSE ORDET...
/* 
        int[] marks2={100,70,67,86,48,96,54};  //marks2.length ----->>  7
        for(int i =marks2.length-1; i>=0; i--){ //marks2.length - 1  ----> 6
            System.out.println(marks2[i]);  // in first loop i=6 and then 5 , 4 , 3 , 2 , 1
        }
*/
//   ----->  DISPLAYING THE ARRAY IN FOR - EACH LOOP  🤩<------

        // for (int element : marks){    // here element is variable which take marks...
        //     System.out.println(element);
        // }



//   ----------------->  LINEAR SEARCH  🤩<-------------------------- 
    //  Linear search in Java refers to the process of sequentially checking each element in a list or array to find a specific value. 
    //  It's like looking through a list one by one until you find what you're searching for.

 
    int numbers[] = { 2 , 4 , 8 , 10 , 12 , 14 , 16 };
    int key = 10;   //  key is only  variable name 

   int  index = linSearch(numbers, key);

   if (index == -1) {
    System.out.println(" key is not found ");
     }

     else {
        System.out.println( "Key is Found!! -> key index is : " + index);
    }

    

    }
}