/* Anisha Dasgupta
   Date: 4/23/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Using number of decks to swap and incrementing nextCard
*/
import java.util.Random;
public class Deck{
    private Card[] deck = new Card [52];//array of card called deck expect length 52
    private int nextCard;//counter to keep traack of cards

    public Deck (){//initialize card array with each 52 cards
        nextCard = 0;
        for (int s = 0; s < 4; s++){//nexted loop to create 52 cards to fill each deck element; 13 ranked cards for each 4 suits
            for (int r =0; r< 13; r++ ){
                deck[nextCard] = new Card (r,s);
                nextCard++;
            }
        }
    }

    public void shuffle(){//randomly shuffle cards in deck
        Random r = new Random();
        int size = deck.length;
        for (int i = 0; i < size - 1; i++){//choose index number and swap element with current element start at 0
            int swap = r.nextInt(size - i) + i;//swap minimum of 52 swaps
            Card temp = deck[i];//swapping 
            deck[i] = deck[swap];
            deck[swap] = temp;
        }
        nextCard=0;//must initalize to 0 so that the user can start playing from the beginning once the deck is shuffled

    }
    public Card dealCard(){//return next card in deck either shuffled or not
        if (nextCard < deck.length) {
            return deck[nextCard++];
        }else{
            return null;
        }

    }
    @Override
    public String toString() {
        //for loop on the deck
        //for each card, call its toString
        String temp = "";//important to note that it is string when concatenating
        for (int i = 0; i < deck.length; i++){
            temp += deck[i] + " ";
        }
        return temp;
    }
}