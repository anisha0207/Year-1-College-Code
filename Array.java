import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Array{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = getLength(s);
        int[] numbers = new int[length];
        fillArray(numbers);
        displayArray(numbers);

        double sum = 0;
        for (int score : numbers) {
            sum += score;
        }
        double average = sum / length;
        System.out.printf("Average grade for the class: %.5f\n", average);

        int result1 = searchArray(numbers, 27);
        // checking for random key (27)
        if (result1 == -1) {
            System.out.println("Key not found");
        } else {
           System.out.println(numbers[result1]+ " found at index="+result1);
        }
        int result2 = searchArray(numbers, numbers[2]);
        // checking for key that exists (may exist at more than one index)
        if (result2 == -1) {
            System.out.println("Key not found");
        } else {
           System.out.println(numbers[result2] +" found at index="+result2);
        }
    }
    public static int getLength(Scanner scan) {
        int temp;
        do {
            while (!scan.hasNextInt()) {
                System.out.print("invalid, must be an integer, try again: ");
                scan.next(); // restart scanner
            }
            temp = scan.nextInt(); // call out scanner again
            if (temp < 15 || temp > 150) {
                System.out.print("invalid, try again (must be within the range 5-200): ");
            }
        } while (temp > 15 || temp < 150);
        return temp;
    }
    public static void fillArray(int[] array) {
        Random r = new Random();
        /*for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(50) + 27;//random between 27-76
        }*/
        int i = 0;
        do {
            array[i] = r.nextInt(50) + 27;
            i++;
        }while(i < array.length);
    }

    public static void displayArray(int[] array) {
        /*for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();//display code with 10 elements each line*/
        double sum = 0;
        int count = 0;
        for (int num : array){
            System.out.print(num + " ");
            sum+= num;
            count++;
            if(count%10 == 0){
                System.out.println();
            }
        }
        System.out.println("The average is: " + (sum / array.length));
    }


    public static int searchArray(int[] array, int key) {
        // linear search
        for (int i = 0; i < array.length -1; i++){
            if(array[i] == key){
                System.out.println(array[i]);
                return i;//check within each key
            }
        }
        return -1;
    }

}