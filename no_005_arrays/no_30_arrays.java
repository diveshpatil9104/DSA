package no_005_arrays;

import java.util.Scanner;

/**
 * no_26_arrays
 */
public class no_30_arrays {

// creating function for call by reference ...  ( we will study function in next chapter)

        public static void update( int marks[], int nonchangeble){       // (update) is name of function
                nonchangeble = 10;
                for (int i = 0; i < marks.length; i++) {
                        marks[i] = marks[i] + 1;
                }
        }     




        public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these 500 students You have 2 options:
           1. create 500 variables
           2. use Arrays (recommanded) 
    THERE ARE THREE MAIN  WAYS TO CREAT AN ARRAYS IN JAVA...
        */
// 1----> DECLARATION AND MEMORY ALLOCATION..
/*      int []marks = new int[5];
        
        //INITIALIZATION
        marks[0]=100;
        marks [1]=60;
        marks [2]=70; 
        marks[3] = 80; 
        marks[4]=90;
//      marks[5]=100; throwns an error..⧮
        System.out.println(marks[4]);      
*/        


// 2----> DECLAREATION AND THEN MRMORY ALLOCATION..
 /*     int []marks;
        marks = new int[5];
        
        //INITIALIZATION
        marks[0]=100;
        marks [1]=60;
        marks [2]=73; 
        marks[3] = 80; 
        marks[4]=90;
        System.out.println(marks[4]);
*/ 
// 3----> DECLARATION , MEMORY ALLOCATION AND INITIALIZATION AT THE SAME TIME ..
/* 
        int []marks={100,70,67,86,48,96,54};
        System.out.println(marks[0]);
*/
/*------------------------INPUT AND OUTPUT----------------------

        int marks[]=new int[100];
        Scanner sc = new Scanner(System.in);
        // int phy = sc.nextInt(); for simple

        System.out.print("phy marks:");
        marks[0]= sc.nextInt();  // for array 
        
        System.out.print("chem marks:");
        marks[1]= sc.nextInt(); //chem
        
        System.out.print("math marks:");
        marks[2]=sc.nextInt(); //math
        
        marks[2]=100;  // for updating math marks..
        // marks[2]= marks[2]-99 ;  
        int sum= marks[0]+marks[1] + marks[2] ;
        

        System.out.println("phy:" + marks[0] + "\nchem:"+ marks[1] + "\nmath:" + marks[2]  + "\ntotal marks: " + sum  ); //one line print
        // System.out.println( "chem:"+ marks[1]);
        // System.out.println("math:" + marks[2]);
        // System.out.println("total marks: " + sum);
*/

// ------------------------------ PASSING ARRAY AS AN ARGUMENT ----------------------

/*       there are two types for passing the variable in function (we study function or methods in next chpter ) 
        1.  PASS BY VALUE - THEY ARE NOT REFLECT IN FUNCTION ..
        2. PASS BY REFERENCE - when you pass an object to a FUNCTION (method) , you're passing a copy of the reference to that 
                                object. This means changes made to the object's content within the FUNCTION affect the 
                                original object outside the method ...
                        [ARRAY IS TYPE OF PASS BY REFERENCE ]
        
*/ 
        int marks[] = { 98 , 99 , 100 };
        int nonchangeble = 5;
        update(marks , nonchangeble);
        System.out.println(nonchangeble);

        for (int i = 0; i < marks.length; i++) {
                System.out.print(marks[i] + " ");
                
        }
        System.out.println( ); // here the result is  99 , 100 , 101 bcoz we update values in function and these means changes
                                //  made in  the FUNCTION affect the original object outside the function...
                                //    AND nonchangable IS NOT CHANGE BCOZ OF IT IS NOT ARRAY .. 







    }
}