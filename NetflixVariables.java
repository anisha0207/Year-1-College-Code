/*
 Anisha Dasgupta
   Date: 2/1/2024
   CSE7 Spring 2024: Lab 1
   IDE: VSCode; JDK: 11
   Calculate the cost off hosting a pizza party using the input from user 
 */

import java.util.Scanner;

public class NetflixVariables{
    public static void main(String[]args){
        //Declaring the Scanner is done for you
        Scanner input = new Scanner(System.in); 

        // declare 10 relevent variables to meet constraints in instructions 
        int numMovie = 5; //number of movies
        int numViews = 100000; //number of views for each movie or show
        char userProfile = '1'; //When searching the first letter, movies or shows will pop up 
        String movieName = "Barbie"; //Name of movie or show
        boolean views = true; //Pause or play the movie or show
        double avgViews = 133456.7; //Top 10 movies or shows
        String genre = "Comedy"; //genre of each movie or show under description
        final double subscription = 6.99; //subscribe Netflix, payment
        int timeOfMovie = 3; //how long is the movie or episode of show
        int numShows = 12; //number of shows
        //prompt user for first name, last name and birth year
        //use Scanner object (input) to read input and store (don't count towards 10 variables)
        System.out.println("What is your first name?");
        String firstName = input.next();
        System.out.println("What is your last name?");
        String lastName = input.next();
        System.out.println("What is your birth year?");
        int birthYear = input.nextInt();

        //create a variable that is the result of some arithmetic expression
        int currentYear = 2024;
        int age = currentYear - birthYear;
        //display variables and information
        System.out.println("First name: "+ firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Birthyear: "+ birthYear);
        System.out.println("Age: " + age);
        System.out.println("Number of movies: " + numMovie);
        System.out.println("Number of Shows: " + numShows);
        System.out.println("Name of movie: " + movieName);
        System.out.println("Number of average viewers: " + avgViews);
        System.out.println("Number of actual viewer: " + numViews);
        System.out.println("Genre: " + genre);
        System.out.println("Subscription payment: " + subscription);
        System.out.println("Time length of the movie: ");
        System.out.println("User Profile: " + userProfile);
        System.out.println("Viewers Comparision: " + views);

        //challenge: create username using first name last name and birth year
        System.out.print(lastName.substring(0,5));

        System.out.print(firstName.charAt(0));

        System.out.println(currentYear % 100);





    }
}
