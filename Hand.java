/* Anisha Dasgupta
   Date: 4/23/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Using Hand class to find the value of points that person got from the cards it holds from soft and hard values
*/
public class Hand{
    private Card[] hand;//array of Card objects represent current hand
    private int numCards;

    public Hand (int size){
        hand = new Card[size];//declare cards array to be length of size
        numCards = 0;//initialize
    }
    public void addCard(Card card){//add card to current hand (array of cards)
        if (numCards < hand.length){
            hand[numCards++] = card;
        }
    }
    public int getValue(){//three variables must be 0 for adding values
        int softValue = 0;
        int hardValue = 0;
        int ace = 0;

        for (int i = 0; i < numCards; i++) {
            int ranking = hand[i].getRank();
            if (ranking == 0) { // Ace
                softValue += 11;
                hardValue += 1;
                ace++;
            } else if (ranking >= 10) { // Face cards (Jack, Queen, King) worth 10 points towards total value
                softValue += 10;
                hardValue += 10;
            } else { // Non-face cards (1,2,3,4...) value coreesponding to card rank
                softValue += (ranking + 1);
                hardValue += (ranking + 1);
            }
        }

        if (softValue <= 21 && ace > 0) {//soft value is less than or equal to 21, ace is greater than 0, return soft value, otherwise, return hard value
            return softValue;
        } else {
            return hardValue;
        }
    }
    @Override 
    public String toString() {
        //for loop on Hand
        //for each card, call its toString
        String temp = "";//important to note that it is string when concatenating
        for (int i = 0; i < numCards; i++){
            temp += hand[i] + " ";
        }
        return temp;
    }
}