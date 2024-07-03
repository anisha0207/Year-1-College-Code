import java.util.Scanner;
public class NetflixLoops{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //random number between 2 and 10 inclusive
        //range of numbers 10-2+1 = 9
        int number = (int) ((Math.random() * 9) + 2);
        //for loop to generate any number less than the random number until it is false
        String movieInfo = MovieInfo(number, keyboard);
        double sum = getSum (number, keyboard); 
        double average = sum / number;
        printResults(average, movieInfo);
        keyboard.close();
    }
    public static String MovieInfo(int number, Scanner keyboard){
        String movieInfo = "";
        for (int counter = 0; counter < number; counter++){
            System.out.println("Enter the title of a movie: ");
            String tempo = keyboard.nextLine();
            movieInfo += "Movie: " + tempo + "\n";
        }
        return movieInfo;
    }
    public static double getSum(int number, Scanner keyboard){
        double sum = 0;
        for (int counter = 0; counter < number; counter++){
            //valid rating
            boolean loopNeeded = true;
            do {
                System.out.println("Enter the title of a movie: ");
                String tempo = keyboard.nextLine();
                System.out.println("Enter a rating for " + tempo);
                boolean validInt = keyboard.hasNextInt();
                if(validInt){
                    int rating = keyboard.nextInt();
                    keyboard.nextLine();
                    sum += rating;
                    loopNeeded = false;
                }
                else {
                    System.out.println("Not an integer");
                    String junk = keyboard.next();
                }
            }while(loopNeeded);
           
        }
        return sum;
    }
    public static void printResults(double average, String movieInfo){
        System.out.printf("Average: %.4f\n", average);
        System.out.println(movieInfo);

        //print average to 4 decimal places
        //print movieInfo; giant string with all movie titles
    }
}
