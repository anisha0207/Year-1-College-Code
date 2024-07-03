/* Anisha Dasgupta
   Date: 2/8/2024
   CSE7 Spring 2024: Lab 3
   IDE: VSCode; JDK: 11
   Using the random generator to pick a random card from the deck
*/

import java.util.Scanner;

public class Cards {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cardNumber;
        String suitName = "";
        String cardIdentity = "";
        System.out.println("Would you like to enter a card? ");
        String userInput = scan.next();
        char userChoice = userInput.charAt(0);

        if (userChoice == 'Y'){
            System.out.println("Enter a card number: ");
            cardNumber = scan.nextInt();
            }
        else {
            //randomly cast number to value 0-51
            cardNumber = (int) (Math.random() * 52);
            System.out.println("Random Number: " + cardNumber);
        }
        int suit, identity;
        suit = cardNumber / 13;
        if (suit == 0){
            suitName = "Diamonds";
        }
        else if (suit == 1){
            suitName = "Clubs";
        }
        else if (suit == 2){
            suitName = "Hearts";
        }
        else if (suit == 3){
            suitName = "Spades";
        }
        identity = cardNumber % 13;
        switch(identity){
            case 0: cardIdentity = "Ace"; break;
            case 10: cardIdentity = "Jack"; break;
            case 11: cardIdentity = "Queen"; break;
            case 12: cardIdentity = "King"; break;
            default: cardIdentity = (identity + 1) + ""; break;
        }
        System.out.println("You picked the " + cardIdentity +"of"+suitName+"!");
        }
    }

