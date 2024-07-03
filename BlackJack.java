/* Anisha Dasgupta
   Date: 4/23/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Printing out all the values from previous classes by invoking them within this main method
*/
import java.util.Scanner;
public class BlackJack {
    public static void main(String[] args){
        boolean playAgain = true;
        do{
            Scanner scan = new Scanner (System.in);
            Deck deck = new Deck();
            System.out.println("The unshuffled deck:");//display the unshuffled deck
            System.out.println(deck);

            deck.shuffle();
            System.out.println("\nThe shuffled deck:");//display shuffled deck using shuffle()
            System.out.println(deck);

            Hand user = new Hand (10); //creating an array for hand with size 10 for user and dealer
            Hand dealer = new Hand (10);

            user.addCard(deck.dealCard());//add card to user
            user.addCard(deck.dealCard());
            dealer.addCard(deck.dealCard());//add card to dealer
            dealer.addCard(deck.dealCard());

            System.out.println("\nYour hand: " + user.toString());
            System.out.println("Hand Value: " + user.getValue());

            while(user.getValue() < 21){
                System.out.print("Would you like to hit? (y/n): ");//giving option to user if to hit or not
                String option = scan.nextLine().toLowerCase();
                if (option.equals("n")) {//break out of loop if n
                    break;

                } else if (option.equals("y")) {//keep displaying hand value if y
                    user.addCard(deck.dealCard());
                    System.out.println("Your hand: " + user);
                    System.out.println("Hand Value: " + user.getValue());
                } else{//incorrect type error message
                    System.out.println("Invalid Choice, select y or n");
                }
            }

            System.out.println("\nDealer's Hand (before hitting): " + dealer);//print out a summary of the number of hits shown above
            System.out.println("Hand Value: " + dealer.getValue());
            while (dealer.getValue() < 17 && user.getValue() <= 21) {
                System.out.println("Hitting...");
                
                System.out.println("Dealer Hand: " + dealer);
                dealer.addCard(deck.dealCard());//must have this or else it will go in a continuous loop
                System.out.println("Hand Value: " + dealer.getValue());
            }
            System.out.println("\nResults: ");//final results of the values with total of dealer and user
            System.out.println("User Hand Value: " + user.getValue());
            System.out.println("Dealer Hand Value: " + dealer.getValue());
            
            if (user.getValue() == 21 && dealer.getValue() == 21) {//determining the winner using the following criteria of value points
                System.out.println("Dealer and user won, a draw");
            } else if (user.getValue() == 21) {//anyone who gets 21 immediately wins, if both gets the same value, both wins
                System.out.println("User wins!");
            } else if (dealer.getValue() == 21) {
                System.out.println("Dealer wins!");
            } else if (user.getValue() > 21 && dealer.getValue() > 21) {//both gets higher than 21, busted
                System.out.println("Both busted");
            } else if (user.getValue() > 21) {//if anyone gets above 21, immediate lost
                System.out.println("Dealer wins!");
            } else if (dealer.getValue() > 21) {
                System.out.println("User wins!");
            } else {//otherwise, check whcih number is closer to 21 for win
                if (user.getValue() > dealer.getValue()) {
                    System.out.println("User wins!");
                } else if (dealer.getValue() > user.getValue()) {
                    System.out.println("Dealer wins!");
                } else {
                    System.out.println("It's a draw.");
                }
            }

            System.out.print("\nDo you want to play again? (yes/no): ");//ask user if play again
            String choice = scan.nextLine().toLowerCase();
            if(choice.equals("yes")) {
                playAgain = true;
            }
            else if(choice.equals("no")) {
                playAgain = false;
            }
        }while (playAgain);//if play again is true, the while loop will start over, if false, it will end game

        System.out.println("Goodbye");
        
    }

}