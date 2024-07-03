/* Anisha Dasgupta
   Date: 3/7/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Types of dice rolled out in array along with the scores array to figure out the maximum value. Methods are used to indicate each scenario to gain each types of scores.
*/

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Dice{
    public static void main(String[] args) {
        int [] dice = new int [5];//array of dice rolled out each time for five times
        int [] scores = new int [6];//array that holds scores for each kind of checks stored from each method at the bottom
        Random r = new Random();
        Arrays.sort(dice);
        System.out.print("Dice: ");
        for (int i = 0; i < dice.length; i++){
            dice[i] = r.nextInt(6) + 1;//dice array will hold values from 1-6
            System.out.print(dice[i] + " ");
        }
        System.out.print("\nResult: High Score " + findHighScore(dice, scores));//print max score by calling the method
    }
    public static int checkSingles(int[] dice, int goal){//checks if the value is equal to the goal value that is inputted from the user
        int sum = 0;
        for (int i = 0; i < dice.length; i++){
            if (dice[i] == goal){
                sum += goal;//goal is not called by the scanner until the very end of the method--instruction was not very clear but TA suggested
            }
        }
        return sum;

    }
    public static int checkThreeOfKind(int[] dice){//Checks of three consecutive similar values
        for (int i = 0; i < dice.length; i++){
            if (dice[i] == dice[i+1] && dice[i] == dice[i+2]){
                return 30;
            }
            else {
                return 0;
            }
        }
        return 0;
    }

    public static int checkFourOfKind(int[] dice){//checks for four values that are the same
        if ((dice[0] == dice [1] && dice[1] == dice[2] && dice[2] == dice[3])){//in this case, the patterns are obvious, only two options in this case
            return 40;
        }
        else if ((dice[1] == dice [2] && dice[2] == dice[3] && dice[3] == dice[4])){
            return 40;
        }
        else{
            return 0;
        }
        
    }
    public static int checkFiveOfKind(int[] dice){//checks if all values are the same in the array
        if (dice[0] == dice[1] && dice[1] == dice[2] && dice[2] == dice[3] && dice[3] == dice[4]){
            return 50;
        }
        else{
            return 0;
        }
    }
    public static int checkFullHouse(int[] dice){//if all five values are the same, can be fullhouse
        if (dice[0] == dice[1] && dice[1] == dice[2] && dice[2] == dice[3] && dice[3] == dice[4]){
            return 35;
        }
        else if ((dice[0] == dice[1] && dice[2] == dice[4]) || (dice[0] == dice[2] && dice[3] == dice[4])) {//if dices are values are same but one value is different in the middle of the array
            return 35;
        }
        else {
            return 0;
        }
    }
    public static int checkStraight(int[] dice){//checks for similar values through ascending order, there are two options
        if (dice[0] == 1 && dice[1] == 2 &&dice[2] == 3 &&dice[3] == 4 &&dice[4] == 5){
            return 45;
        }
        else if (dice[0] == 2 && dice[1] == 3 &&dice[2] == 4 &&dice[3] == 5 &&dice[4] == 6){
            return 45;
        }
        else{
            return 0;
        }
    }
    public static int findHighScore(int[] dice, int [] scores){//calculates maximum within the score
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPlease input your goal: ");
        int goal = scan.nextInt();//goal is initialized and used for checkSingles method

        //scores array is given values
        scores[0] = checkSingles(dice, goal);
        scores[1] = checkThreeOfKind(dice);
        scores[2]= checkFourOfKind(dice);
        scores[3]= checkFiveOfKind(dice);
        scores[4]= checkFullHouse(dice);
        scores[5]= checkStraight(dice);

       int  maxScore = 0;//initalize max
        for (int i = 0; i < scores.length; i++){//check if each value is greater
            if (scores[i] > maxScore){
                maxScore = scores[i];
            }
        }
        return maxScore;
    }
    
}

