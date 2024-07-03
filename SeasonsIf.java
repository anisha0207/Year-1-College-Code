/* Anisha Dasgupta
   Date: 2/6/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Find the season in appropriate month and day from reader's input
*/

import java.util.Scanner;

public class SeasonsIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the date (String, int)");
        String month = input.next();
        int day = input.nextInt();
        String season="";

        //TO DO: add an (complex) else-if statement to set the value of season using Month and Day
        if ((month.equalsIgnoreCase("January")) || (month.equalsIgnoreCase("February"))) {
            season = "winter"; }
        else if (month.equals("March")){
            if (day <20){
                season = "winter";
            }
            else{
                season = "spring";
                }
            }
        
        else if ((month.equalsIgnoreCase("April")) || (month.equalsIgnoreCase("May"))){
            season = "spring";}
        else if (month.equals("June")){
            if (day < 20){
                season = "spring";
                }
            else {
                season = "summer";
                }
            }
        else if ((month.equalsIgnoreCase("July")) || (month.equalsIgnoreCase("August"))){
            season = "summer";}
        else if (month.equals("September")){
            if (day < 21){
                season = "summer";
                }
            else {
                season = "fall";
                }
            }
        else if ((month.equalsIgnoreCase("October")) || (month.equalsIgnoreCase("November"))){
            season = "fall";}
        else if (month.equals("December")){
            if (day < 20){
                season = "fall";
                }
            else{
                season = "winter";
                }
            }
        
        
        
        System.out.println(month+" "+day+" falls during "+ season);
        input.close();
    }
}