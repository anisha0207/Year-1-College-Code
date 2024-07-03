/* Anisha Dasgupta
   Date: 3/7/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Display three arrays, first two given by the user, the last array used to merge. Creating a method that stores scanner for length of array
*/

import java.util.Scanner;
import java.util.Arrays;
public class MergeArray{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the 1st non-descending array: ");
        int  given_length1 = getLength(s);//calling onto the method
        int array1[] = new int [given_length1];//create array to store the length of values given by user
        System.out.println("Enter the element: "); //move to main
        for (int i = 0; i < given_length1; i++){//storing each value called from the user and storing in array1
            int value1 = s.nextInt();
            array1[i] = value1;
        }

        System.out.println("Enter the length of the 2nd non-descending array: ");
        int given_length2 = getLength(s);//calling onto the method
        int array2[] = new int [given_length2];//create array to store the length of values given by user
        System.out.println("Enter the element: "); //move to main
        for (int i = 0; i < given_length2; i++){//storing each value called from the user and storing in array1
            int value2 = s.nextInt();
            array2[i] = value2;
        }

        System.out.println("The 1st array: " + Arrays.toString(array1));
        System.out.println("The 2nd array: " + Arrays.toString(array2));
        int array3[] = new int [given_length1 + given_length2];//merged array of array1 and array2 of each length into one full array
        int inOne = 0;//initialize for comparison
        int inTwo = 0;
        int inThree = 0;

        while (inOne < given_length1 && inTwo < given_length2){//comparing values between array 1 and array 2 and sorting them manually
            if (array2[inTwo] < array1[inOne]){
                array3[inThree] = array2[inTwo];
                inTwo++;
                inThree++;
                //System.out.println("one");
            }
            else if (array1[inOne] < array2[inTwo]){
                array3[inThree] = array1[inOne];
                inOne++;
                inThree++;
                //System.out.println("two");
            }
            else{
                array3[inThree] = array1[inOne];//if nothing compares, return the array1
                inOne++;
                inThree++;
                //System.out.println("three");
            }
            }
            while (inOne < given_length1){ //print out the array1 in that order into the merged array
                array3[inThree] = array1[inOne];
                inOne++;
                inThree++;
            }
            while (inTwo < given_length2){//print out array 2 in that order into the merged array
                array3[inThree] = array2[inTwo];
                inTwo++;
                inThree++;
            }
        System.out.println("Merged array: " + Arrays.toString(array3));

    }

    public static int getLength(Scanner s){//creates a method that creates a scanner called from user to store number of length of an array
        int given_len = s.nextInt();
        return given_len;
    }
}