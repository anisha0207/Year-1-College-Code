/* Anisha Dasgupta
   Date: 2/15/2024
   CSE7 Spring 2024: Lab 1
   IDE: VSCode; JDK: 11
   Indicate whether the word is a palindrome based on input from reader
*/

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String reverse = "";
        String noSpace = "";
        for (int i = 0; i<word.length(); i++){
            if(!Character.isWhitespace(word.charAt(i))){
                noSpace += word.charAt(i);
            }
        }
        for(int i= noSpace.length()-1; i >= 0; i--){
            reverse += noSpace.charAt(i);
        }
            
        boolean isTrue = noSpace.equals(reverse);

        if (isTrue){
            System.out.printf("palindrome: %s\n", word);
        }
        else {
            System.out.printf("not a palindrome: %s\n", word);
        }
    }
}