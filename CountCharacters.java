/* Anisha Dasgupta
   Date: 4/9/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   sorting between counts and characters using reader's inputs
*/
import java.util.Scanner;
import java.util.Arrays;
public class CountCharacters{
    public static void main(String[]arg){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or phrase: ");//asks the user for word or phrase
        String word = scan.nextLine();

        char[] message = new char[word.length()];//creates a new array using the length of the word or phrase given by the user
        System.out.println(message);
        for (int i = 0; i<word.length(); i++){
            message[i] = word.charAt(i);
            System.out.print(message[i]);//prints the letters within the word stored in the array
        }

        char [] alphabet = new char[26];
        for (int i = 0; i < 26; i++){
            alphabet[i] = (char)('A' + i);
            System.out.print(alphabet[i]);//creates a whole list of alphabets and uses count to figure out the placement of the word within the alphabet
        }
        //System.out.print(alphabet.toString());

        int [] counts = new int[26];

        for (char element : message){
            if (element >= 'A' && element <= 'Z'){
                counts[element - 'A']++;//words must have capital letter in it, but if it doesn't, ignore
            }
        }
        //System.out.println(counts);

        for (int i = 0; i < counts.length; i++){
            int index = counts[i];
            char indexAlph = alphabet[i];
            int j = i-1;
            while (j >= 0 && counts[j] < index){
                counts[j + 1] = counts[j];
                alphabet[j + 1] = alphabet[j];
                j--;
            }
            counts[j + 1] = index;
            alphabet[j + 1] = indexAlph;//sorting the word using count and alphabet 
        }
       
        int unique = 0;
        for (int i =0; i< alphabet.length; i++){
            if (counts[i] > 0){
                unique++;
                System.out.println("The letter " + alphabet[i] + " occurs " + counts[i] + " times.");//finding the number of occurances using only capital letters, ignore lower case
                
            }
        }
        System.out.println("There are " + unique + " letters in the phrase.");
        
    }

}