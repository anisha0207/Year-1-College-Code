/* Anisha Dasgupta
   Date: 2/27/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   
*/
import java.util.Scanner;
import java.util.Arrays;
public class Roster{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[]names = nw String[8];
        int[]ratings = new Int[8];
        int [] jerseys = new Int[8];
        for(int i =0; i<names.length; i++){
            System.out.println("Player "+ (i+1) +": ");
            names[i] = in.nextLine(); 
            boolean loop = true;
            do{
                System.out.println("Rating: ");
                if (in.hasNextInt()){
                    //read integer as string, adn parse it to be interger SAFELY
                    int temp = Integer.parseInt(in.nextLine());
                    if (temp >= 1 && temp <= 9){
                        ratings[i] = temp;
                        loop = false;
                    }else{
                        System.out.println("invalid rating. out of range");
                    }
                } else{
                    in.nextLine();//clear scanner
                    System.out.println("invalid rating, try again");
                }
            }while(loop);
        }

        for (int i = 0; i<jerseys.length; i++){
            int tempJersey = (int) (Math.random( * 100));
            boolean isUnique = true;
            do{
               isUnique = true;
               for (int j = 0; j < 1; j++){
                    if (jersey[j] == tempJersey){
                        isUnique = false;
                        tempJersey = (int) (Math.random() * 100);
                        break;
                    }
                } 
            }while(!isUnique);
            jersey[i] = tempJersey;
                
        }
        char choice = ' ';
        do{
            System.out.println("Choose a menu option");
            System.out.println("o - Output roster");
            System.out.println("a - Output roster");
            System.out.println("u - update plater rating");
            System.out.println("q - Quit");

            choice = in.nextLine().charAt(index:0);
            switch (choice){
                case 'o'://go back and calculate average rating and print to 3 decimal places
                    for (int i = 0; i<names.length; i++){
                        System.out.printf("Player %d: %s; Jersey: %d; Rating: %d\n", i + 1, names[i], jerseys[i], ratings[i]);
                        sum += ratings[i];
                    }
                    //print average here
                    double average = sum / names.length;
                    System.out.printf("Average Rating: %.3f\n", average);
                    break;
                case 'a':
                    System.out.println("What rating do you want to search for? ");
                    int searchRating = in.nextInt(); // Go back and validate this
                    for(int i =0; i<names.length; i++){
                        //add if statement to check if rating[i] > searchRating
                         if (ratings[i] >= searchRating) {
                            System.out.printf("Player %d: %s; Jersey: %d; Rating: %d\n", i + 1, names[i], jerseys[i], ratings[i]);
                         }
                    }
                    break;
                case 'u':
                    System.out.println("Who do you want to update?");
                    String tempName = in.nextLine();
                    System.out.println("What should their new rating be? ");
                    int tempRate = in.nextInt();//Validate this

                    boolean rateChanged = false;

                    for (int i = 0; i<names.length; i++){
                        if (tempName.equals(names[i])){
                            ratings[i] = tempRate;
                            System.out.println("update successful!");
                            rateChanged = true;
                            break;
                        }
                    }

                    if (!rateChanged){
                        System.out.println("update unsuccessful!");
                    }
                    
                    break;
                case 'q':
                    System.out.println(x:"Goodbye");
                    break;
                default: System.out.println("Error, invalid menu choice");
            }
        } while (choice != 'q');

        in.close();
    }
}