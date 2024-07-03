import java.util.Scanner;

import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the first word: ");
        String word1 = scanner.next();
        System.out.print("Enter the second word: ");
        String word2 = scanner.next();

        // Ensure that the words have the same length
        if (word1.length() != word2.length()) {
            System.out.println("The words must be of equal length.");
            return;
        }

        // Call the function to count matching characters
        int matchingCharacters = countMatchingCharacters(word1, word2);

        // Display the result based on the number of matching characters
        if (matchingCharacters == 1) {
            System.out.println("1 character matches.");
        } else {
            System.out.println(matchingCharacters + " characters match.");
        }
    }

    public static int countMatchingCharacters(String word1, String word2) {
        // Initialize a variable to count matching characters
        int matchCount = 0;

        // Iterate through each character in the words
        for (int i = 0; i < word1.length(); i++) {
            // Check if the characters at the same position match
            if (word1.charAt(i) == word2.charAt(i)) {
                // If they match, increment the match count
                matchCount++;
            }
        }

        // Return the total number of matching characters
        return matchCount;
    }
}
