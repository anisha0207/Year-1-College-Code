/* Anisha Dasgupta
   Date: 2/22/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Converting values given by reader to output a decimal or hexadecimal conversion
   1. Numbering systems are used to represent numbers in various formats.
   2. Binary is an important numbering system because it is the foundation of computing and storage in computer. It holds two symbols: 0 and 1. 
   3. Two other numbering systems are:
       1. Decimal: It uses digits 0 through 9 with base 10. This is used regularly. 
       2. Hexadecimal: uses digits 0 through 9 and letters A through F. This is used for deep digital computig in computer science. 
   4. The biggest value that an integer variable can hold depends on what value it is storing and its data type. A 32-bit integer
   can hold values from -2,147,483,647 to 2,147,483,647, negative to positive. The binary of this largest positve value we have here would be 
   0111 1111 1111 1111 1111 1111 1111 1111.
*/
import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String value = input.nextLine();
        
        if (value.length() == 8) {
            // Binary to decimal conversion
            int decimal = 0;
            for (int i = value.length() - 1; i >= 0; i--) {
                char digit = value.charAt(i);
                int digitValue;
                if (digit == '0') { //number is in binary form, either 0 or 1
                    digitValue = 0;
                } else {
                    digitValue = 1;
                }
                decimal += digitValue * Math.pow(2, value.length() - 1 - i);
            }
            System.out.println("The decimal equivalent of the binary number " + value + " is: " + decimal);
        } else if (value.length() == 4) {
            // Hexadecimal to decimal conversion
            int decimal = 0;
            String hex = "0123456789ABCDEF";
            for (int i = value.length() - 1; i >= 0; i--) {
                char digit = value.charAt(i);
                int digitValue = hex.indexOf(digit);//reading off of the string of hex
                decimal += digitValue * Math.pow(16, value.length() - 1 - i);
            }
            System.out.println("The decimal equivalent of the hex number " + value + " is: " + decimal);
        } else {
            System.out.println("Invalid input length.");
        }
    }
}