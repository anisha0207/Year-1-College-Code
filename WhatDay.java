/* Anisha Dasgupta
   Date: 2/29/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Finding the day of the week by reading the input from user with the month, day and year inputs and calculating using codes and mod 7
*/
import java.util.Scanner;
public class WhatDay{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month;
        int day;
        int year;

        System.out.println("Enter the month from 1-12: ");
        month = scan.nextInt();//ask for month
        while (month >12 || month < 1){
            System.out.println("Invalid, try again");//if error
            month = scan.nextInt();
        }
        System.out.println("Enter the day from 1-31: ");
        day = scan.nextInt();//ask for day
        while (day >31 || day < 1){
            System.out.println("Invalid, try again");//if error
            day = scan.nextInt();
        }
        System.out.println("Enter the year from 1700-2399: ");
        year = scan.nextInt();//ask for year
        while (year >2399 || year < 1700){
            System.out.println("Invalid, try again");// if error
            year = scan.nextInt();
        }

        int yearCal = (year % 100 + (year % 100 / 4)) % 7; //year code
        int []listOfMonth = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5}; //array of month given
        int [] listOfCentury = {4, 2, 0, 6, 4, 2, 0}; //array of century given
        int century = year / 100 * 100;
        int Codem = listOfMonth[month - 1]; //month code
        int Codec = listOfCentury[(century - 1700) / 100]; //century code
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);//indicate if it is leap year: only if it is divisible by 4 or 400 but not by 100
        String[] Weeklist = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}; //array of week

        if ((month == 1 || month == 2) && leapYear) { //if it is january or Febraury AND a leap year: subtract one from year code
            yearCal -= 1;
        }

        int week1 = (yearCal + Codem + Codec + day); //find the total before mod
        int week2 = week1 % 7; //this includes with mod 7
        
        System.out.println(week1 + " mod " + "7 = " + week2 + ". This was a " + Weeklist[week2] + "!"); //final result
        
    }
}
 