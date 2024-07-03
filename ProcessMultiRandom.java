/* Anisha Dasgupta
   Date: 3/28/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Using methods and 2D array list to create a list with randomized values
*/
import java.util.Scanner;
import java.util.Random;

public class ProcessMultiRandom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int seed = getSeed(scan);
        Random ran = new Random(seed);
        int length = ran.nextInt(98) + 2;//length from 2-98
        System.out.println("Length of the array: " + length);//counts the length of the array
        double[][] randomRagArr = createRandom(length, ran);
        display(randomRagArr);
        assign(randomRagArr, ran);
        display(randomRagArr);
        largestSum(randomRagArr);
    }

    public static int getSeed(Scanner s) {
        System.out.println("Enter a seed [2, 1000000]: "); //seed must be between those values, if not, error call out below
        int temp;
        do {//validate the value
            while (!s.hasNextInt()) {
                System.out.println("not an integer");
                s.next(); // restart scanner
            }
            temp = s.nextInt(); // call out scanner again
            if (temp < 2 || temp > 1000000) { 
                System.out.println("invalid seed");
            }
        } while (temp < 2 || temp > 1000000); 
        return temp;
    }

    public static double[][] createRandom(int len, Random r) {//creating an array based on the length given
        double[][] matrix = new double[len][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new double[r.nextInt(10) + 1];//randomize each row with elements 1-10
        }
        return matrix;
    }

    public static void display(double[][] list) {//display the array list with default 00.000 format
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.printf("%06.3f ", list[i][j]);
            }
            System.out.println();
        }
    }

    public static void assign(double[][] list, Random rand) {//randomize element from 0-100
        for (int r = 0; r < list.length; r++) {
            for (int c = 0; c < list[r].length; c++) {
                list[r][c] = rand.nextDouble() * 101;
            }
        }
    }

    public static void largestSum(double[][] list) {
        double[] sumsOfList = new double[list.length];
        double sum = 0; //find sum for average
        for (int r = 0; r < list.length; r++) {//iterating each loop to find the index and largest row
            for (int c = 0; c < list[r].length; c++) {
                sumsOfList[r] += list[r][c];
                sum += list[r][c];
            }
        }
        int indexMax = 0;
        double maxSum = sumsOfList[0];
        for (int i = 1; i < sumsOfList.length; i++) { //indicating the index value of the largest row
            if (sumsOfList[i] > maxSum) {
                indexMax = i;
                maxSum = sumsOfList[i];
            }
        }
        double average = sum / (double) (list.length); //average of all rows
        System.out.printf("The largest row is at index=%d with a sum of %.2f%n", indexMax, maxSum);
        System.out.printf("The average sum across all rows: %.2f%n", average);
    }
}
//Where are arguments being passed by value in the provided main method? How do you know? Be specific about line(s) of code.
/*Based on the variables like char, int, double and the name of the method with its argument reference allows for the arguments being passed
by a value in the main method. For example,  double[][] randomRagArr = createRandom(length, ran) on line 17 uses an int and random as parameters just as 
referenced from line 40.
/* 

//Where are memory references passed (by value) into methods in the provided main method? How do you know? Be specific about line(s) of code.
/* References can store values which then gets passed into the methods provided in the main. From line 18 and 20, display method is called twice
but the outputs are different due to the assign method in line 19. So basically, the display of the arrays goes from 00.000 from acutally having values in them. 
*/