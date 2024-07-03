/* Anisha Dasgupta
   Date: 2/1/2024
   CSE7 Spring 2024: Lab 1
   IDE: VSCode; JDK: 11
   the purpose is to print the formatted phoone number given user input
*/
import java.util.Scanner;
public class phoneNumber {
    public static void main (String[]args){
        long phoneNumber;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a 10 digit phone number: ");
        phoneNumber = in.nextLong();
        
        long lineNumber, prefix, areaCode;

        lineNumber = phoneNumber % 10000; //7890
        phoneNumber /= 10000; //123456

        prefix = phoneNumber % 1000; //456
        phoneNumber /= 1000; //123
        areaCode = phoneNumber;

        System.out.println("Formatted Phone Number: (" + areaCode + ") " + prefix + "-" + lineNumber);






    }
}