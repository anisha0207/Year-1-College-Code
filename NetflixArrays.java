/* Anisha Dasgupta
   Date: 2/27/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   User's input on movie titles, ratings, runtime using array and loops
*/
public class NetflixArrays{
    public static void main(String[] args) {
        String[] movieInfo = new String[10]; //size 10
        movieInfo[0] = "Barbie/Greta Gerwig";
        movieInfo[1] = "Big Hero 6/Chris Williams";
        movieInfo[2] = "The Trouble with Harry/Alfred Hitchcock";
        movieInfo[3] = "The Quiet Man/John Ford";
        movieInfo[4] = "Star Wars/Akira Kurosawa";
        movieInfo[5] = "Jaws/Steven Spielberg";
        movieInfo[6] = "Indiana Jones/Steven Speilberg";
        movieInfo[7] = "Nashville/Robert Altman";
        movieInfo[8] = "Annie Hall/Woody Allen";
        movieInfo[9] = "Al Pacino/Micheal Powell";

        Scanner keyboard = new Scanner(System.in);
        int [] movieRatings = new int[10];
        for (int i = 0; i < movieRatings.length; i++){
            System.out.println("Enter a rating from 1-5 for " + (i+1));
            movieRatings[i] = keyboard.nextInt();
        }
        double[] movieRuntimes = new double[10];
        for(int i = 0; i < movieRuntimes.length; i++){
            movieRuntimes[i] = (double)((Math.random() *178) +22);
        }

        for (int i = 0; i < movieInfo.length; i++){
            System.out.println(movieInfo[i] + ": " + movieRatings[i] + "(rate), " + Math.round(movieRuntimes[i]*100.0)/100.0 + "(runtime)");
        }
    }
}