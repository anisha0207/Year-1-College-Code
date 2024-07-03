//This code will run factorials given the value from the user. 
//We will use the usual scanner adn then have a for loop where it will iterate from the value
//the value will go down by one until it reaches 0, but not including
//it will print that sequence 
//we will have sum that will multiply with i after every iteration
//there will be add for total number of iterations along with average 
//average will be calculated using the add divided by the count which is also initialized
//factorial is calculated by multiplying every iteration
//scanner closed
import java.util.Scanner;
public class factorials{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a positive integer: ");
        int value = scan.nextInt();
        int sum = 1;
        double add = 0;
        int count = 0;
        double average = 0;
        System.out.print("Sequence: ");
        for (int i = value; i > 0; i--){
            System.out.print(""+ i + " ");
            sum = sum * i;
            add += i;
            count++;
            average = (add/count);
        }
        System.out.println("\nThe factorial of your input is " + sum);
        System.out.printf("Average value: %.3f", average);
        scan.close();

    }
}