/* Anisha Dasgupta
   Date: 2/10/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Getting input from reader on three values that will determine either mean,
   variance, max and min depending on what the reader's choice is.
*/
import java.util.Scanner;

public class StatMenu{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Math Program");
        System.out.println("\tA. Maximum\n\tB. Minimum\n\tC. Mean\n\tD. Variance");
        System.out.println("\t\t\tEnter your choice: ");
        char choice = input.next().charAt(0);
        if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D'){
            System.out.print("You must enter either A, B, C or D");
            System.exit(0);
        }
        System.out.println("Enter three integer numbers between 0 and 100, inclusive: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println("Three Numbers: " + num1+", "+ num2 +", "+ num3);

        if (num1 < 0 || num1 > 100 || num2 < 0 || num2 > 100 || num3 < 0 || num3 > 100){
            System.out.println("Invalid, must be within 0 to 100 inclusive.");
            System.exit(0);
        }

        switch (choice){
            case 'A':
                double max = (double)Math.max(num1, Math.max(num2, num3));
                System.out.printf("The maximum of (%d, %d, %d) is: %.3f\n", num1, num2, num3, max);
                break;
            case 'B':
                double min = (double)Math.min(num1, Math.min(num2, num3));
                System.out.printf("The minimum of (%d, %d, %d) is: %.3f\n", num1, num2, num3, min);
                break;
            case 'C': 
                double mean = (double)(num1 +num2 +num3)/3; 
                System.out.printf("The mean of (%d, %d, %d) is: %.3f\n", num1, num2, num3, mean);
                break;
            case 'D':
                double mean1 = (double) (num1 +num2 +num3)/3; 
                double variance = (double)(Math.pow((num1 - mean1), 2) + Math.pow((num2 - mean1), 2) + Math.pow((num3 - mean1),2))/3; 
                System.out.printf("The variance of (%d, %d, %d) is: %.3f\n", num1, num2, num3, variance);
                break;
        }
        input.close();
    }
}
    
