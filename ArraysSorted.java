/* Anisha Dasgupta
   Date: 2/29/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Reads from reader the inputs of an array and indicate whether the ranges exist within the array
*/
import java.util.Scanner;
public class ArraysSorted{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array: "); //asks for length
        int length = scan.nextInt();
        int [] values = new int[length]; //stores the size into new array list
        System.out.print("Enter the values: ");
        for (int i = 1; i <= length; i++){
            values[i] = scan.nextInt();//values are stored in the array list 
        }

        System.out.print("\nEnter the range of values to check: ");
        int begin = scan.nextInt(); //store start range
        int end = scan.nextInt(); //store end range

        boolean statement = true;
        for (int i = begin; i< end; i++){
            if (values[i]> values[i+1]){
                statement = false; //only false if values in the array don't have the range list above
            }
        }

        if (statement){//true
            System.out.println("yes, the array is sorted between elements " + begin + " and " + end + " (indices " + (begin+1) + " to " + (end+1) + ")");  
        }
        else{//false
            System.out.println("no, the array is not sorted between elements " + begin + " and " + end + " (indices " + (begin+1) + " to " + (end+1) + ")");  
        }
    }
}