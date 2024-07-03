
/* Anisha Dasgupta
   Date: 2/6/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Find the season in appropriate month and day from reader's input
*/
import java.util.Scanner;

public class SeasonsSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the date (String, int)");
        String month = input.next();
        int day = input.nextInt();
        String season = "";

        //TO DO: add a switch statement to set the value of season using Month and Day
        switch(month){
            case "Janurary": 
                season = "winter"; 
                break;
            case "February": 
                season = "winter"; 
                break;
            case "March": 
                switch(day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19: 
                        season = "winter"; 
                        break;
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        season = "spring";
                        break;
                }
            case "April": 
                season = "spring";
                break;
            case "May": 
                season = "spring";
                break;
            case "June": 
                switch(day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19: 
                        season = "spring"; 
                        break;
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        season = "summer";
                        break;
                }
            case "July": 
                season = "summer";
                break;
            case "August": 
                season = "summer";
                break;
            case "September": 
                switch(day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19: 
                    case 20:
                        season = "summer"; 
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        season = "fall";
                        break;
                }
            case "October": 
                season = "fall";
                break;
            case "November": 
                season = "fall";
                break;
            case "December": 
                switch(day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19: 
                        season = "fall";
                        break;
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        season = "winter";
                        break;
            default: System.out.println("Invalid Month");
                }
        }
        System.out.println(month + " " + day + " falls during " + season);
        input.close();
    }
}