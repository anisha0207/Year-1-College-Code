/* Anisha Dasgupta
   Date: 4/4/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Using insertion and selection sort to find out the time it took to iterate through the array in descending order
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class SortsCompare{
    public static void main(String[]args){
        System.out.println("Enter an int length greater than 50");
        Scanner scan = new Scanner (System.in);
        int length1 = scan.nextInt(); //ask user for the length of the array
        int [] array1 = new int [length1]; //sets an array with the size given by the user

        for (int i =0; i < array1.length; i++){
            Random rand = new Random ();
            array1[i] = rand.nextInt(array1.length-1);//randomly fill in the array from 0 to the length of the array minus 1
        }
        System.out.println("\nYour random array (unsorted): "); //display the unsorted array using for each loop
        System.out.print("[");
        for (int element : array1){
            System.out.print(element+ ", ");
        }
        System.out.println("]");

        System.out.println("\nYour array in descending order (using insertion sort): ");//
        long startInsertTime=System.nanoTime();//start the timer
        for (int i = 1; i < array1.length; i++){//use insertion sort to sort the array in descending order
            int value = array1[i];
            int j;
            for (j = i; j > 0 && array1[j-1] < value; j--){
                array1[j] = array1[j-1];
            }
            array1[j] = value;
        }
        long endInsertTime=System.nanoTime();//end the timer
        long totalInsertTime = endInsertTime - startInsertTime;//calcualte total time it took for the loop to iterate through the array

        System.out.print("[");
        for (int element1 : array1){//print the sorted array that used insertion sort
            System.out.print(+ element1+ ", ");
        }
        System.out.println("]");
        System.out.println("Running time: " + (totalInsertTime) + "ns");//print out the time it took for that insertion sort

        System.out.println("\nYour random array (unsorted): ");//again print the unsorted array
        System.out.print("[");
        for (int element : array1){
            System.out.print(element+ ", ");
        }
        System.out.println("]");

        System.out.println("\nYour array in descending order (using selection sort): ");
        long startInsertTime1=System.nanoTime();//start timer
        for (int i = 0; i < array1.length-1; i++){//use selection sort for descending order
            int max = i;
            for (int j = i +1; j< array1.length; j++){
                if (array1[j] > array1[max]){
                    max = j;
                }
            }
            int temp = array1[max];
            array1[max] = array1[i];
            array1[i] = temp;
        }
        long endInsertTime1=System.nanoTime();//end time
        long totalInsertTime1 = endInsertTime1 - startInsertTime1;//total time calculation

        System.out.print("[");
        for (int element2 : array1){//print the selection sorted array in descending order
            System.out.print(element2+ ", ");
        }
        System.out.println("]");
        System.out.println("Running time: " + (totalInsertTime1) + "ns");//print total time it took to do selection sort

        if (totalInsertTime1 > totalInsertTime){//now compare between two sorting, which was quicker
            System.out.println("\nSelection sort was quicker than insertion sort");
        } else{
            System.out.println("\nInsertion sort was quicker than selection sort");
        }

    }
}
