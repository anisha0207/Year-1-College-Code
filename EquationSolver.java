/* Anisha Dasgupta
   Date: 2/15/2024
   CSE7 Spring 2024: Lab 1
   IDE: VSCode; JDK: 11
   Find the solutions to two set of equations using input from user
*/

import java.util.Scanner;

public class EquationSolver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 6 positive integers: ");

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;

        // Input validation for 6 integers (do-while loops six times)
        //num1
         boolean loopNeeded = true;
            do {
                boolean validInt1 = scan.hasNextInt();
                if(validInt1){
                    int valid1 = scan.nextInt();
                    num1 = valid1;
                    loopNeeded = false;
                }
                else {
                    System.out.println("Error: not an integer");
                    String junk = scan.next();
                }
            }while(loopNeeded);
            //num2
        boolean loopNeeded1 = true;
            do {
                boolean validInt2 = scan.hasNextInt();
                if(validInt2){
                    int valid2 = scan.nextInt();
                    num2 = valid2;
                    loopNeeded1 = false;
                }
                else {
                    System.out.println("Error: not an integer");
                    String junk1 = scan.next();
                }
            }while(loopNeeded1);
            //num3
        boolean loopNeeded2 = true;
            do {
                boolean validInt3 = scan.hasNextInt();
                if(validInt3){
                    int valid3 = scan.nextInt();
                    num3 = valid3;
                    loopNeeded2 = false;
                }
                else {
                    System.out.println("Error: not an integer");
                    String junk2 = scan.next();
                }
            }while(loopNeeded2);
            //num4
        boolean loopNeeded3 = true;
            do {
                boolean validInt4 = scan.hasNextInt();
                if(validInt4){
                    int valid4 = scan.nextInt();
                    num4 = valid4;
                    loopNeeded3 = false;
                }
                else {
                    System.out.println("Error: not an integer");
                    String junk3 = scan.next();
                }
            }while(loopNeeded3);
            //num5
        boolean loopNeeded4 = true;
            do {
                boolean validInt5 = scan.hasNextInt();
                if(validInt5){
                    int valid5 = scan.nextInt();
                    num5 = valid5;
                    loopNeeded4 = false;
                }
                else {
                    System.out.println("Error: not an integer");
                    String junk4 = scan.next();
                }
            }while(loopNeeded4);
            //num6
        boolean loopNeeded5 = true;
            do {
                boolean validInt6 = scan.hasNextInt();
                if(validInt6){
                    int valid6 = scan.nextInt();
                    num6 = valid6;
                    loopNeeded5 = false;
                }
                else {
                    System.out.println("Error: not an integer");
                    String junk5 = scan.next();
                }
            }while(loopNeeded5);

        boolean solutionFound = false;
        int resultX = -10, resultY = -10;
        // Brute force approach to find solutions
        for (int x = -10; x <= 10; x++) {
            for (int y = -10; y <= 10; y++) {
                if (num1 * x + num2 * y == num3 && num4 * x + num5 * y == num6) {
                    solutionFound = true;
                    resultX = x;
                    resultY = y;
                    //store x and y 
                    //break;
                }
            }
           //if (solutionFound) break;
        }

        if (!solutionFound) {
            System.out.println("There is no solution");
        } else { 
            System.out.println("x = " + resultX + ", y = " + resultY);
        }

        scan.close();
    }
}