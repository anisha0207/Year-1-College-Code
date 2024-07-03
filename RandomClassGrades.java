import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class RandomClassGrades {
    public static int getLength(Scanner s) {
        int temp;
        do {
            while (!s.hasNextInt()) {
                System.out.print("invalid, must be an integer, try again: ");
                s.next(); // restart scanner
            }
            temp = s.nextInt(); // call out scanner again
            if (temp < 5 || temp > 200) {
                System.out.print("invalid, try again (must be within the range 5-200): ");
            }
        } while (temp < 5 || temp > 200);
        return temp;
    }

    public static void fillArray(int[] array, Random ranGen) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ranGen.nextInt(101);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int searchArray(int[] arr, int key) {
        // Binary search
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid; // Return the index of the key
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Return -1 if key not found
    }

    public static int searchArray(int[] arr, char key) {
        // Linear search for counting occurrences of letter grades
        int count = 0;
        for (int score : arr) {
            char gradeLetter;
            if (score >= 90) {
                gradeLetter = 'A';
            } else if (score >= 80) {
                gradeLetter = 'B';
            } else if (score >= 70) {
                gradeLetter = 'C';
            } else if (score >= 60) {
                gradeLetter = 'D';
            } else {
                gradeLetter = 'F';
            }
            if (gradeLetter == key) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Enter the size of the class: ");
        int size = getLength(scan);
        int[] array1 = new int[size];
        fillArray(array1, r);

        System.out.println("Class Grades: ");
        printArray(array1);

        System.out.println("Sorting...");
        Arrays.sort(array1);
        System.out.println("Class Grades (Sorted): ");
        printArray(array1);

        double sum = 0;
        for (int score : array1) {
            sum += score;
        }
        double average = sum / array1.length;
        System.out.printf("Average grade for the class: %.3f\n", average);

        System.out.print("\nEnter a letter grade or specific score: ");
        if (scan.hasNextInt()) {
            int score = scan.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Score must be between 0 and 100.");
            } else {
                int index = searchArray(array1, score);
                if (index != -1) {
                    System.out.println(score + " found at index " + index );
                } else {
                    System.out.println(score + " not found in the class.");
                }
            }
        } else if (scan.hasNext()) {
            String gradeInput = scan.next().toUpperCase();
            char grade = gradeInput.charAt(0);
            if (gradeInput.equals("A") || gradeInput.equals("B") || gradeInput.equals("C") ||
                gradeInput.equals("D") || gradeInput.equals("F")) {
                int count = searchArray(array1, grade);
                System.out.println("Number of " + gradeInput + "'s in class: " + count);
            } else {
                System.out.println("Invalid input. Please enter a valid letter grade (A, B, C, D, F) or an integer score.");
            }
        }
    }
}