/* Anisha Dasgupta
   Date: 3/5/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Display the card using the array but this time using methods for simplification
*/
public class CardsMethods {
    public static void main(String[] args) {
        int card = generateCard();
        String suit = findSuit(card);
        String identity = findIdentity(card);
        System.out.println("You picked the " + identity + " of " + suit);
    }
public static int generateCard(){
    int num = (int) (Math.random()*52);
    return num;
}
public static String findSuit(int cardNum){
    String suitName;
    int suit = cardNum / 13;
    //Finding the suit name 
    if (suit == 0){
        suitName = "Diamonds";
    }
    else if (suit == 1){
        suitName = "Clubs";
    }
    else if (suit == 2){
        suitName = "Hearts";
    }
    else{
        suitName = "Spades";
    }
    return suitName;
}
public static String findIdentity (int cardNum){
    int identity = cardNum%13;
    String cardIdentity = "";
    switch (identity){
        case 0: cardIdentity = "Ace"; break;
        case 1: cardIdentity = "2"; break;
        case 2: cardIdentity = "3"; break;
        case 3: cardIdentity = "4"; break;
        case 4: cardIdentity = "5"; break;
        case 5: cardIdentity = "6"; break;
        case 6: cardIdentity = "7"; break;
        case 7: cardIdentity = "8"; break;
        case 8: cardIdentity = "9"; break;
        case 9: cardIdentity = "10"; break;
        case 10: cardIdentity = "Jack"; break;
        case 11: cardIdentity = "Queen"; break;
        case 12: cardIdentity = "King"; break;
        
    }return cardIdentity;
}
}