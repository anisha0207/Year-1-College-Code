/* Anisha Dasgupta
   Date: 2/6/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Find the season in appropriate month and day from reader's input
*/
import java.util.Scanner;
public class NetflixSelections {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your password?");
        String password = scan.next();
        //if the numeric value of the first character is between 65 and 90 or 97 and 122 (upper/lower)
        //its a letter, and is valid. otherwise, it's not. 
        if (password.length() > 8){
            System.out.println("Your password length is above the recommended. Try Again.");
        } 
        else {
            System.out.println("Your password has reached its recommended length.");
        }
        char firstChar = password.charAt(0); //get char
        int charInt = (int)firstChar; //cast to int
        if (64 < charInt && charInt < 91 || 96 < charInt && charInt < 123) { //check if in letter range
            System.out.println("Password starts with a letter, verified.");
        }

        else {
            System.out.println("Need to start your password with a letter.");
        }

        //generating random number for password ranges 1-20
        //1-10 : randomize from that range
        //11-20: randomize from that range
        System.out.println("Pick numbers from 1-20: ");
        int random = scan.nextInt();
        switch(random){
            case 1: 
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: System.out.println((int)(Math.random() * 10) + 1); break;
            case 11: 
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:System.out.println((int)(Math.random() * 20) + 11); break;
            default: System.out.println("Invalid. Please pick ranges 1-20."); break;
        }


    }
}
    