/* Anisha Dasgupta
   Date: 2/8/2024
   CSE7 Spring 2024: Lab 3
   IDE: VSCode; JDK: 11
   
*/

import java.util.Scanner;

public class DispenseChange {
    public static void main(String[] args){
        final int QUARTER = 25; 
        final int DIME = 10; 
        final int NICKEL = 5;
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter price of item (from 25 cents to a dollar): ");
        int value = scan.nextInt();

        int change = 100 - value; 

        int quarters = change / QUARTER;
        change %= QUARTER;

        int dimes = change / DIME;
        change %= DIME;

        int nickels = change / NICKEL;
        change %= NICKEL;

        int pennies = change;

        System.out.println("You bought an item for " + value + " cents and input a dollar, so your change is:");
        System.out.println("    " + quarters + " quarter(s)");
        System.out.println("    " + dimes + " dime(s)");
        System.out.println("    " + nickels + " nickel(s)");
        System.out.println("    " + pennies + " pennies");

    }
}
    
