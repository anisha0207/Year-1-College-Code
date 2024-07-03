/* Anisha Dasgupta
   Date: 4/23/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Create Card() class to create rankName and suitName and return the values fo rank and suit for the following classes 
*/
public class Card{
    private int rank; //rand of card A-K face value; 0-12 int value
    private int suit; //suit of card; Club(0), heart(1), spade(2), diamond(3)

    //array holding facae value cards in order from low to high; "A" for ace, "2" for Two, "k" for king
    private static String[] rankName = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    //"C" for club, "H" for heart, "S" for spades, "D" for diamond
    private static String[] suitName = {"C", "H", "S", "D"};

    public Card(int rank, int suit) {//argument constructor rank/suit as parameters
        this.rank = rank;
        this.suit = suit;
    }
    //public Card() {//argument constructor with null within this
        //this(null, null);
    //}

    public int getRank(){
        return rank;
    }
    public int getSuit() {
        return suit;
    }

    public String getRankName() {//getter method 
        return rankName[rank];
    }

    public String getSuitName() {//getter method
        return suitName[suit];
    }

    @Override
    public String toString(){//return rankName and suitName
	    return getRankName() + "" + getSuitName(); 
    }


}