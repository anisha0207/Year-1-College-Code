/* Anisha Dasgupta
   Date: 2/29/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Rock, Paper, Scissors gernerator using reader's input of names and number of rounds to determine who wins in each round
*/

import java.util.Scanner;
public class RPS{
  public static void main(String[] args) {     
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 names and number of round: ");
        String player1 = scan.next();
        String player2 = scan.next();
        int rounds = scan.nextInt();
        int count1 = 0; //number of wins for player1
        int count2 = 0;//number of wins for player2
        int Rock = 0;
        int Paper = 1;
        int Scissors = 2;
        String winner = "";
        String moveType1 = ""; //intializing rock, paper, scissor for player 1
        String moveType2 = ""; //intializing rock, paper, scissor for player 2
        while (rounds <= 0){
       
            System.out.print("Rounds must be greater than 0: ");
            rounds = scan.nextInt();
        }
        System.out.println(player1 + " vs " + player2 + " for " + rounds + " rounds");
        for (int r = 1; r <= rounds; r++) {
            int Move1 = (int) (Math.random() * 3); // Generating numbers 0 to 2 for player 1
            int Move2 = (int) (Math.random() * 3); // Generating numbers 0 to 2 for player 2

            // If tie, change
            while (Move1 == Move2) {
                Move2 = (int) (Math.random() * 3);
            }

            // initialize: Rock = 0, Paper = 1, Scissors = 2 for player 1
            switch (Move1) {
                case 0:
                    moveType1 = "Rock";
                    break;
                case 1:
                    moveType1 = "Paper";
                    break;
                case 2:
                    moveType1 = "Scissors";
                    break;
            }
            // initialize: Rock = 0, Paper = 1, Scissors = 2 for player 2
            switch (Move2) {
                case 0:
                    moveType2 = "Rock";
                    break;
                case 1:
                    moveType2 = "Paper";
                    break;
                case 2:
                    moveType2 = "Scissors";
                    break;
            }
            //winner conditions for player 1 or 2
            if (Move1 == 0 && Move2 == 2) {
                winner = player1;
                count1++;
            }
            else if(Move1 == 1 && Move2 == 0){
                winner = player1;
                count1++;
            } 
            else if (Move1 == 2 && Move2 == 1) {
                winner = player1;
                count1++;
            } else {
                winner = player2;
                count2++;
            }
            //prints out the types of moves each player did for each round
            System.out.println(player1 + " - " + moveType1 + "; " + player2 + " - " + moveType2);
            System.out.println("Round " + r + ": " + winner + " wins with " + moveType1);
        }

        // total count of wins for each player
        System.out.println(player1 + " wins " + count1 + " and " + player2 + " wins " + count2);
        

        
    }
}

