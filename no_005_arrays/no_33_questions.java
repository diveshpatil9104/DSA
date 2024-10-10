package no_005_arrays;
import java.util.Arrays;
import java.util.Scanner;


/**
 * no_29_practice_set
 */
public class no_33_questions {

 
// ----->> function for QN NO.8      int number[] = { 1 , 3, 8 , 5 , 6 , 7};


    public static boolean search( int numbers[]){
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i-1]>numbers[i]) {
                
                return false;

                
            }
            
        }
        return true;

    }    

// ----->> function for QN NO.9
    public static int linsearch( String menu[] , String key){
        for( int i = 0; i < menu.length; i++){
                if ( menu[i] == key) {
                    return i;  
                    } 
                }    
                    
            return -1;    


            }


//  ---->> function for QN NO.21       (optimized code) :

    public static boolean sorted(int matrix3[][], int key2) {

        int row = 0;
        int col = matrix3[0].length-1;

        while (row< matrix3.length && col>=0) {

            if (matrix3[row][col]==key2) {
                System.out.println(" found key at index : ( " + row + " " + col + " )");
                return true;
                
            }
            else if (key2<matrix3[row][col]){
                col--;

            }else{
                row++;
            }
           
        } 
        System.out.println("key not found ");   
        return false;   
        
        

    }
        
    

    

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        
        
//QN NO.1----> CREATE AN ARRAY  AND CALCULATE THEIR SUM
/*
       int sum=0;
       int[] marks = {32,45,65,86,75,75,99};
            for(int i=0; i<marks.length; i++){
                sum=sum+marks[i];
                
            }

                System.out.println(sum);
 */



// QN NO.2----> WRITE A JAVA PROGRAM TO FIND OUT WHETHER A GIVEN INTEGER IS PRESENT IN AN ARRAY OR NOT
/*        
        int[]list={43,65,86,53,64,75,24,64}; 
        System.out.print("enter the number: ");
        int a =sc.nextInt();
        boolean  inArray= false;

        for(int element:list){
            if (element==a) {
                 inArray=true;
                break;
            }
        }
        if(inArray){
            System.out.printf("%d IS PRESENT IN ARRAY\n" ,a);
        }
        
         else{
            System.out.printf("%d IS NOT PRESENT IN ARRAY\n" ,a);

        }
        
 */     



// QN NO.3----> CALCULATE THE AVG . MARKS FROM AN ARRAY CONTAINING MARKS OF ALL STUDENTS IN PHYSICS USING FOT-LOOP..

/*      int[] phymarks = {32,45,65,86,75,75,99,100};
        int sum=0;
        for(int marks: phymarks){               // this santax means give me a phymarks in marks one by one ...
            sum = sum+ marks;    
        }System.out.println( "avg. marks of students in the class: " +sum/phymarks.length);
*/ 


// QN NO.4----> CREATE A JAVA PROGRAM TO ADD TWO MATRICES OF SIZE 2 X 3 ..

        int matA[][] = new int [2][3];
        matA[0][0]= 1; 
        matA[0][1]= 2; 
        matA[0][2]= 3; 
        matA[1][0]= 1;    
        matA[1][1]= 2; 
        matA[1][2]= 3; 

        int matb[][] = new int [2][3];
        matb[0][0]= 1; 
        matb[0][1]= 2; 
        matb[0][2]= 3; 
        matb[1][0]= 1; 
        matb[1][1]= 2; 
        matb[1][2]= 3; 

        int sum[][] = new int [2][3];

        System.out.println(" Printing first matrix");

        for (int i = 0; i < matA.length; i++) {
            for(int j = 0; j<3; j++){
                System.out.print(" " + matA [i][j]);
            }
            System.out.println();
            
        }

        System.out.println(" Printing second matrix ");

        for (int i = 0; i < matb.length; i++) {
            for(int j = 0; j< 3; j++){
                System.out.print(" " + matb[i][j]);
            }
            System.out.println();
            
        }

        System.out.println("Sum of two matrix is : ");

        for (int i = 0; i < sum.length; i++) {
            for( int j = 0; j< 3; j++){
            sum[i][j] = matA[i][j] + matb[i][j];    

            System.out.print( " " + sum[i][j]);
            }   
            
         System.out.println();
        }
     

// QN NO.5----> WRITE A JAVA PROGRAM TO FIND THE MAXIMUM ELEMENT IN JAVA ARRAY.
/* 
    
        int largest = Integer.MIN_VALUE; // - infinity  (minimum value)
        int numbers[] = { 2 , 13 , 6 , 16 , 10};

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest= numbers[i];
                
            }
         }    
            
            System.out.println("largest number in array is : " + largest);
*/



// QN NO.6----> WRITE A JAVA PROGRAM TO FIND THE MINIMUM ELEMENT IN JAVA ARRAY.
/* 
        int lowest = Integer.MAX_VALUE;   // + infinity value (maximum value)
        int numbers[] = { 2 , 13 , 6 , 16 , 10};
        for (int i = 0; i < numbers.length; i++) {
            if (lowest > numbers[i]) {
                lowest = numbers[i];
                
            }
         }    
       System.out.println( "lowest number is : " + lowest);

*/



// QN NO.7----> WRITE A JAVA PROGRAM TO REVERSE AN ARRAY..
/*
        int[] marks = {32,45,65,86,75,75,99};
            for (int i=marks.length-1; i>=0;i-- ){
                System.out.println(marks[i]);
            }
*/


// QN NO.8----> WRITE A JAVA PROGRAM TO FIND WHETHER AN ARRAY IS SORTED OR NOT ...

            int number[] = { 1 , 3, 4 , 5 , 6 , 7};
            System.out.println(search(number));






// QN NO.9 ------> WRITE A PROGRAM TO FIND THE SPECIFIC FOOD BY USER IN THE MENU WHICH IS ARRAY. 

            String menu[] = { "pavbhaji" , "vadapaav" , "paneer" , "chicken" , "aalu bhaji" , "puran poli" , "dosa" , "samosa"};
            String key = "vada rassa";
            int index = linsearch(menu, key);
                if (index ==-1) {
                    System.out.println(" sorry food is not in menu ");
                    
                }
                else {
                System.out.println("your food present in index : " + index);}
             


/* QN NO.10 -------> WRITE A PROGRAMS TO FOLLOWING PAIRS OF GIVEN ATTAY IN JAVA..

              int numbers[] = { 2 , 4 , 6 , 8 , 10};

              EXPECTED OUTPUT ---->>
                (2,4) (2,6) (2,8 ) (2,10)
                (4,6) (4,8) (4,10 )
                (6,8) (6,10) 
                (8,10) 
*/

/*        int numbers[] = { 2 , 4 , 6 , 8 , 10};
        int  np = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];   // 2 , 4 ,6 ,8 , 10

            for( int j= i+1; j< numbers.length; j++){
                System.out.print( "(" + curr + " , "+ numbers[j]+ ") ");
                np++;
            }
            System.out.println();
        }
        System.out.println("numbers of pairs :" + np);

*/


/* QN NO.12 -------> write a program to print subarray
 
            int numbers[]={ 2 , 4 , 6, 8 ,10};

            expexted output -->

            2                           
            2 4 
            2 4 6
            2 4 6 8
            2 4 6 8 10

            4
            4 6 
            4 6 8
            4 6 8 10

            6
            6 8
            6 8 10

            8
            8 10
            
            10
*/             
        

 /*       int numbers[]={ 2 , 4 , 6, 8 ,10};
        System.out.println(numbers.length + "\n");
        int ts = 0;
       
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for(int j = i; j < numbers.length; j++){
                int end = j;

                for( int k = start; k<= end; k++) { 
                    
                System.out.print(numbers[k] + " ");     // printing subarray
                  
                }
            ts++;
            System.out.println();
            }
       
        System.out.println();

        }
        System.out.println( "total subarray: " + ts);
*/ 



// QN NO.14-------> write a program to find the  max subarray sum..
            // int numbers[]={ 2 , 4 , 6, 8 ,10};

/* 
            int currsum = 0;
            int maxsum = Integer.MIN_VALUE;
            int numbers[]={ 2 , 4 , 6, 8 ,10};
            for (int i = 0; i < numbers.length; i++) {
                for(int j = i; j< numbers.length; j++){
                    currsum = 0;

                    for(int k= i; k<= j; k++){

                        currsum = currsum + numbers[k];
                    }
               
                    System.out.println(currsum);
                    if (maxsum<currsum) {
                        maxsum = currsum;
                        
                    }
                }
            }
            System.out.println("maxsum is :" + maxsum);
*/

// QN NO.15 -------> write a program to find the  max subarray sum using KADANE'S ALGORITHM..

// KADANE'S ALGORITHM ---->Kadane's Algorithm finds the maximum sum subarray, 
//                           and if all elements are negative, the maximum sum will be 0...time  complexity is very less 



            //int numbers[]={ -2 , -3 , 4, -1 ,-2 , 1, 5 , -3};

/* 
            int numbers[]={ -2 , -3 , 4, -1 ,-2 , 1, 5 , -3};


            int maxsum = Integer.MIN_VALUE;
            int currsum = 0;

            for (int i = 0; i < numbers.length; i++) {
                currsum = currsum + numbers[i];
                if (currsum<0) {
                    currsum = 0;
                 }
                    
                 maxsum = Math.max(currsum, maxsum);   // ------>> means>> if (maxsum<currsum) { maxsum = currsum;  }
                       
                    
               
            }

            System.out.println("our max subarray sum is : " + maxsum);
*/

 /*   QN NO.16 ---->> TRAPPING RAINWATER 
            
            Given n non-negative integers representing an elevation map where the width of each bar is 1 , compute how much
            water it can trap after raining 

            height =[ 4, 2, 0 , 6 , 3 ,2 ,5]
 */
            int height[] = { 4 , 2 , 0, 6 , 3 , 2 , 5 };
            int n = height.length;
             
            // calculating left max boundary array 
            
            int leftmax[] =  new int[n];
            leftmax[0] = height[0];

            for (int i = 1; i < height.length; i++) {
                leftmax[i] = Math.max(height[i], leftmax[i -1]); 
                //  System.out.print(leftmax[i] + " ");   //just checking array is correct or not..

            }
            // calculating right max boundary array
            
            int rightmax[]= new int [n];
            rightmax[n-1] = height[n-1];

            for (int i = n-2; i >= 0; i--) {
                rightmax[i] = Math.max(height[i], rightmax[i+1]);
                //  System.out.print(rightmax[i] + " " );  //just checking array is correct or not..
            
            }

            int trapped_water = 0;
            //loop

            for (int i = 0; i < n; i++) {
//                 water level = minimum of (left boundary , right boundary)
                    int water_level = Math.min(leftmax[i], rightmax[i]);

//                  trapped water = (water level - height of bar) * width of bar    (width of bar  =  1)
                    trapped_water +=  water_level - height[i];
               }

               System.out.println( "TRAPPED RAINWATER IN BAR : " + trapped_water);



/*  QN NO.17 -----> BUY AND SELL STOKES :
               
               YOU ARE GIVEN AN ARRAY PRICES WHERE prices[] IS THE PRICE OF A GIVEN STOKES ON THE ith DAY. YOU WANT TO
               MAXIMIZE YOUR PROFIT BY CHOOSING A SINGLE DAY IN THE FUTURE TO SELL THAT STOCK. 
               RETURN THE MAXIMUM PROFIT YOU CAN ACHIEVE FROM THIS TRANSACTION. IF YOU CANNOT ACHIEVE ANY PROFIT. return 
  
               int prices[] = {7 , 1 , 5 , 3 , 6 , 4}
*/  
            
            int prices[] = {7 , 1 , 5 , 3 , 6 , 4};
            int buy_prize = Integer.MAX_VALUE;  // + infinity value (maximum value)

            int max_profit = 0;

            for (int i = 0; i < prices.length; i++) {
                if ( buy_prize < prices[i]) {      // case for profit 
                    int profit =  prices[i] - buy_prize;   // todays profit 

                    max_profit = Math.max(max_profit, profit); 
                
                } else {
                    buy_prize = prices[i];
                }
                System.out.print( "$" + max_profit + " "  );
            }       
                System.out.println("\n");


        }

 
        // QN NO.18----> WRITE A JAVA PROGRAM TO REVERSE AN ARRAY USING SWAP METHOD ..
/*
        int[] marks = {32,45,65,86,75,75,99};
*/
            int[] arr = {32,45,65,86,75,75,99};
            int start = 0;
            int end = arr.length - 1;
    
            while (start < end) {
                // Swap elements at the start and end positions
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                
// printing the  array 
  
                // Move the pointers towards the center of the array
                start++;
                end--; 
            }

                for (int reverse : arr) {
                    System.out.print(reverse + " ");
                    
                }

System.out.println();
 
/*
QN NO. 19 ---->> SWAPPING ARRAY ALTERNATLY
    1)  arr[] = {1 , 2 , 7 , 8 , 5 }
        RESULT SHOULD BE =  2 , 1 , , 8 , 7, 5

    2)  arr[] = {69 , 23 , 3 , 5 , 4  , 1 }
        ---->>   23 , 69 , 5 , 3 , 1 , 4
*/

        int  arr1[] = {69 , 23 , 3 , 5 , 4  , 1 };

        for (int i= 0; i < arr1.length; i+=2) {
            if (i + 1 < arr1.length) {
                 int temp = arr1[i];
                arr1[i] = arr1[i+1];
                arr1[i+1] = temp;
            }
        }
        
        for (int value : arr1) {
            System.out.print(value + " ");
        
        }
                 
/*        
 QN NO. 20 ----> Problem Statement

    You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1) [means odd number ].
    Now, in the given array/list, "M' numbers are present twice and one number is present only once.
    You need to find and return that number which is unique in the array/list.

    FOR EG . ----> arr[] = {1 , 3 , 1 , 3 , 4 }
    EXPECTED OUTPUT ----> 4 

    EG.2 ----> arr[] = { 2 , 3 , 1 , 6 , 3 , 6 , 2 }
    EXPECTED OUTPUT ----> 1
    
*/ 

            int num[] = {2 , 3 , 1 , 6 , 3 , 6 , 2  , 1 ,4};
            int ans = 0;

            for (int i = 0; i<num.length; i++){
                ans= ans^num[i];   // KAAT DEGA JAB ANS AAUR num[i] SAME HOGA THIS OPERATION IS PERFORM IN BILEVEL   

            }
            System.out.println(" \n\nUnique Element = "+ans);


/* 
QN NO. 21 -----> Given an array of integers arr, return true if the number of occurrences of each value in the 
                        array is unique or false otherwise.

Example 1:

    Input: arr = [1,2,2,1,1,3]
    Output: true
    Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

Example 2:

    Input: arr = [1,2]
    Output: false

Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
*/


/*
    QN NO. 22 -----> DUPLICATE IN ARRAY : 
                    YOU ARE GIVEN AN ARRAY 'ARR' OF SIZE 'N' CONTAINING EACH NUMBER BETWEEN 1 TO 'N-1' AT LEAST ONCE.. THERE IS A SINGLE
                    INTEGER VALUE THAT IS PRESENT IN THE ARRAY TWICE..YOUR TASK IS TO FIND THE DUPLICATE INTEFER VALUE PRESENT IN THE ARRAY 
                
    FOR EG...     ARR[]  = {1 , 2 , 3 , 4 , 4 } 
            ... THE DUPLICATE INTEGER VALUE PRESENT                           IN THE ARRAY IS 4..HENCE, THE ANSWER IS 4 IN THIS CASE
*/

           int  ARR[] = {1 , 2 , 3 , 4 , 4 }; 
           int ans1 = 0;

           // XOR ing all element for cut same occurance (the result is 4 ko kaat dega)
           for (int i = 0; i < ARR.length; i++) {
            ans1 = ans1^ARR[i];
            

            
           }

           // XOR ing 1 to n-1 for getting same occurance (sab ko kaat dega except 4 )
           for (int i = 1; i < ARR.length; i++) {
            ans1 = ans1^i;
            
           }
           System.out.println(ans1);


/*
    QN NO. 23 -----> You are given two arrays 'A' and 'B' of size 'N' and 'M' respectively. Both these arrays are sorted in non-decreasing order. You have to find the intersection of these two arrays.
                    Intersection of two arrays is an array that consists of all the common elements occurring in both arrays.
    Note:
        1. The length of each array is greater than zero.
        2. Both the arrays are sorted in non-decreasing order.
        3. The output should be in the order of elements that occur in the original arrays.
        4. If there is no intersection present then return a single integer '-1'


for eg .    
           ARRAY1 = { 1 , 2 , 2 , 2 , 3 , 4 }
           ARRAY2 = { 2 , 2 , 3 , 3 }

           OUTPUT ----> { 2 , 2 , 3 }   (BCOZ THEY ARE COMMON ELEMENT OF ARRAY1 AND ARRAY2) BTW IT IS AS SAME AS INTERSECTION 
 */
 /* 
           int ARRAY1[] = {1 , 2 , 2, 2 , 2  ,3 ,4};
           int ARRAY2[] = {2 , 2 , 3 ,3 };
           
           for (int i = 0; i < ARRAY1.length; i++) {
            int answer2 = ARRAY1[i];
            for (int j = 0; j < ARRAY2.length; j++) {
                if (answer2 == ARRAY2[j]) {
                    System.out.print(" " + answer2); 
                    ARRAY2[j] = -2;    // ( update the match value after printing bcoz avoiding re-mapping [used any min value for updating in this case i use -2 ])
                    break;
                    
                }
                else{
                    System.out.println(-1);
                }
            }
            
           }
 */

//      BY OPTIMIZE WAY .... HERE IN QN WE GET HELP FROM NOTE NO.2 THEY SAY THAT KI BOTH THE ARRAY ARE SORTED IN NIN-DECRESING ORDER,
//                            WE ALSO TRY TO AVOID USE TWO FOR LOOP FOR i and j FOR GETTING MIN TIME CMPLEXCITY
    

           int i = 0;
           int j = 0;
           int ARRAY3[] = {1 , 2 , 2  ,3 , 5 , 6};
           int ARRAY4[] = {2 , 3 , 3 , 4 , 5 };

         

        while (i < ARRAY3.length && j < ARRAY4.length) {
            if (ARRAY3[i]==ARRAY4[j]) {
                    System.out.print(" " + ARRAY3[i]);
                    i++;
                    j++;
            }

                else if (ARRAY3[i]<ARRAY4[j]) {
                    i++;

                    
                }else{
                    j++;
                 }
       
         }   

         System.out.println();  // new line for next qn 

// ABOVE CONCEPT IS CALLED AS 2 POINTERS APPROCH 


/* 
    QN NO.24 -----> you are given an integer array of size 'n' an and integer s .. your task is to return he list of all pairs
                    of elements such that each sum of element of each pair equals 's' ...  
Note:
        Each pair should be    sorted ie the first value should be less than or equals to the second value.
        Return the list of pairs sorted in non-decreasing order of their first value.
        In case if two pairs have the same first value, the pair with a smaller second value should come first
        FOR EG : sum_array[] = { 1 , 2 , 3  , 4 , 5 , 6 };
        s = 5
        OUTPUT :  (1 4) (2 3 )
*/


        int sum_array[] = { 1 , 2 , 3  , 4 , 5 , 6 };
        int s = 5;

           for (int k = 0; k < sum_array.length; k++) {
                  
            for (int k2 = k+1; k2 < sum_array.length; k2++) {
                if ( sum_array[k] + sum_array[k2] == s) {
                    System.out.print("( " + sum_array[k] + " " + sum_array[k2] + " )");
                    
                }
                   
            }
            
        }

/* 
QN NO. 25 -----> You are given an array/list ARR consisting of N integers. Your task is to find all the distinct triplets present in the array which adds up to a given number K.
    An array is said to have a triplet {ARR[i], ARRU[j], ARR[k]} with sum = 'K' if there exists three
    indices i, j and k such that i!=j, j!=k and i!=j and ARR[i) + ARR[j] + ARR[k] = 'K'.
                Note:
    1.You can return the list of values in any order. For example, if a valid triplet is {1, 2, -3}, then {2, -3, 1}, {-3, 2, 1) etc is also valid triplet.
      also, the ordering of different triplets can be random i.e if there are more than one valid triplets, you can return them in any order.
    2. The elements in the array need not be distinct.
    3. If no such triplet is present in the array, then return an empty list, and the output printed for such a test case will be "-1".

    FOR EG : sum_array[] = { 1 , 2 , 3  , 4 , 5 , 6 };
                s = 12
    OUTPUT :  (1 , 5 , 6) ( 3 , 4 , 5 ) (2 , 4  , 6 ) 


*/
        System.out.println();
        int sum_array1[] = { 1 , 2 , 3  , 4 , 5 , 6 };
        int s1 = 12;

        for (int k = 0; k < sum_array1.length; k++) {
            for (int k2 = k+1; k2 < sum_array1.length; k2++) {
                for (int k3 = k2+1; k3 < sum_array1.length; k3++) {
                    if (sum_array1[k] + sum_array1[k2] + sum_array1[k3] == s1) {
                        System.out.print("( " + sum_array[k] + " " + sum_array[k2] + " " + sum_array1[k3] +  " )" );
                        
                        
                    }
                    
                }
                
            }
            
        }
System.out.println();

/*
      QN NO.26 -----> SORT THE ATTAY OF 0 1  
      
      EG... ARRAY[] = { 0 , 1,  0 , 0 , 1 , 0, 1}
      OUTPUT ---->    { 0 , 0 , 0 , 0 , 1 , 1 , 1}
*/

        
        int SORT_ARRAY[] = { 0 , 1,  0 , 0 ,1 , 0, 1};
        int i1 = 0;
        int i2 = SORT_ARRAY.length-1;

        while (i1 <  i2) {

            while (SORT_ARRAY[i1] == 0 && i1<i2) {
                
                i1++;
                
                
            }while (SORT_ARRAY[i2] == 1 && i1<i2){

                i2--;
                
            }if ( i1<i2){
                int temp = SORT_ARRAY[i1];
                SORT_ARRAY[i1] = SORT_ARRAY[i2];
                SORT_ARRAY[i2] = temp;

                i1++;
                i2--;

            }
                
            }

            for (int l : SORT_ARRAY) {
                System.out.print(" " + l);
                
            }
            // ABOVE CONCEPT IS CALLED AS 2 POINTERS APPROCH 


//   - FOLLOWING QUESTIONS    USING INBUILD SORT FUNCTION --------------------------------
/* 
        System.out.println();
        Arrays.sort(SORT_ARRAY);

        for (int l : SORT_ARRAY) {
            System.out.print(" " + l);
                
        }
        
   QN NO.27 ----> SORT THE ARAY OF 0 1 2
            FOR EG. int SORT_ARRAY1[] = {2, 0, 1, 0, 2, 0, 1, 0, 1, 2};
                    OUTPUT SHOULD BE = 0 0 0 0 1 1 1 2 2


*/        


        System.out.println();
        int SORT_ARRAY1[] = {2, 0, 1, 0, 2, 0, 1, 0, 1, 2};
        int k = 0;
        int k1 = 0;
        int k2 = SORT_ARRAY1.length - 1;

        while (k1 < k2) {

            if (SORT_ARRAY1[k1] == 0 && k1 < k2) {
            
                int temp = SORT_ARRAY1[k];
                SORT_ARRAY1[k] = SORT_ARRAY1[k1];
                SORT_ARRAY1[k1] = temp;
                k++;
                k1++;

            } else if (SORT_ARRAY1[k1] == 1 && k1 < k2) {
                k1++;

            } else {
                int temp = SORT_ARRAY1[k1];
                SORT_ARRAY1[k1] = SORT_ARRAY1[k2];
                SORT_ARRAY1[k2] = temp;
                k2--;

            }
        }

        for (int l : SORT_ARRAY1) {
            System.out.print(" " + l);
        }
        
        }
   
    } 
