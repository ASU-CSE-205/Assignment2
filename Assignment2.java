// Assignment #: 2
//         Name: Suvan Kumar
//    StudentID: 1221910898
//      Lecture: MWF 10:10 - 11am
//  Description: This program takes in a list of integers of 
//               unspecified length from standard input until it is terminated 
//               by a zero. It outputs the minimum integer, count of odd integers, 
//               greatest even integer, and the sum of positive integers to standard output.


import java.util.*;  
import java.util.Scanner;

public class Assignment2 {

    public static void main(String args[]){ 

        Scanner scnr = new Scanner(System.in);
        int numHold = 0; //Setting initial value of numHold
        int minNum = 0; //Setting initial value of minNum
        int oddCount = 0; //Setting initial value of oddCount
        int topEven = 0; //Setting initial value of topEven
        int sumPositive = 0; //Setting initial value of sumPositive
        boolean check = true; //Setting initial value of check
    
        while (check = true) {
            numHold = scnr.nextInt(); //Read an integer
            if (numHold == 0) { //Checks to see if input is 0, causing the program to terminate
                check = false;
                break;
            }
            if (numHold < minNum) { //Checks to see if input is smaller than the minimum integer so far
                minNum = numHold;
            }
            if (numHold % 2 != 0) { //Checks to see if input is an odd integer
                oddCount += 1;
            }
            if (numHold % 2 == 0 && numHold > topEven) { //Checks to see if input is the largest even integer so far
                topEven = numHold;
            }
            if (numHold > 0) { //Checks to see if the input is a positive integer
                sumPositive += numHold;
            }
        }

        outputAnswer(minNum, oddCount, topEven, sumPositive); //Calls the output function
        
    }

 
    private static void outputAnswer(int num1, int num2, int num3, int num4) { //Function to output the results to standard output
        System.out.println("The minimum integer is " + num1);
        System.out.println("The count of odd integers in the sequence is " + num2);
        System.out.println("The largest even integer in the sequence is " + num3);
        System.out.println("The sum of positive integers is " + num4);
    }
        
    


}
