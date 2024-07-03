/* Anisha Dasgupta
   Date: 3/21/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Search random character array from key (A-Z), return the search using two searching methods (binary and linear)
*/
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class SearchChars {
    public static int getLength(Scanner scan) {
        int temp;
        do {
            while (!scan.hasNextInt()) {
                System.out.print("invalid, try again: ");
                scan.next(); // restart scanner
            }
            temp = scan.nextInt(); // call out scanner again
            if (temp <= 10) {
                System.out.print("invalid, try again (must be greater than 10): ");
            }
        } while (temp <= 10);
        return temp;
    }

    public static char getKey(Scanner scan) {
        char temp;
        boolean loop = true;
        do {
            System.out.print("Enter a key: ");
            temp = scan.next().charAt(0);
            if ((temp >= 'A' && temp <= 'Z') || (temp >= 'a' && temp <= 'z')) {
                loop = false;
            } else {
                System.out.println("Invalid input. Please enter a character between A-Z or a-z.");
            }
        } while (loop);
        return temp;
    }

    public static int generateInt(Random ran) {
        return ran.nextInt(2);
    }

    public static char generateChar(Random ran, int type) {
        char temp;
        if (type == 0) {
            // generate from A-Z
            temp = (char) (ran.nextInt(26) + 65);
        } else {
            // generate a-z
            temp = (char) (ran.nextInt(26) + 97);
        }
        return temp;
    }

    public static void displayChars(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void displayChars(char[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % n == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int[] linearSearch(char[] array, char key) {
        int[] result = {-1,0}; // Swapped positions of 0 and -1
        // result[0] = index where key is found (or -1 if not found)
        // result[1] is the number of comparison it took to find key

        for (int i = 0; i < array.length; i++) {
            result[1]++; // increment
            if (array[i] == key) { // Changed array[1] to array[i]
                result[0] = i; // Changed 1 to i
                break;
            }
        }
        return result;
    }

    public static int[] binarySearch(char[] array, char key) {
        int[] result = {-1, 0}; // Swapped positions of 0 and -1
        // result[0] = index where key is found (or -1 if not found)
        // result[1] is the number of comparison it took to find key
        int low = 0, high = array.length - 1, mid;
        while (low <= high) {
            result[1]++;
            mid = (high + low) / 2;
            if (array[mid] < key) {
                low = mid + 1; // search second half of array
            } else if (array[mid] > key) {
                high = mid - 1; // search first half of array
            } else {
                result[0] = mid;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Enter a length (must be greater than 10): ");
        int len = getLength(s);

        System.out.println("Enter a key: ");
        char key = getKey(s);

        char[] letters = new char[len];
        for (int i = 0; i < letters.length; i++) {
            int tempType = generateInt(r);
            letters[i] = generateChar(r, tempType);
        }

        displayChars(letters);
        Arrays.sort(letters);
        displayChars(letters, 7);

        int[] linearS = linearSearch(letters, key);
        int[] binaryS = binarySearch(letters, key);

        System.out.println(Arrays.toString(linearS));
        System.out.println(Arrays.toString(binaryS));

        s.close();
    }
}