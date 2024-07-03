/* Anisha Dasgupta
   Date: 3/05/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Calls onto the list of movies and allows users to add, remove or show the list of movies using methods
*/

import java.util.Scanner;
import java.util.Arrays;

public class NetflixMenuMethods{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        String[] myList = new String[20];
        
        //10 movies from previous.. feel free to change! 
        myList[0] = "Scary Movie 1";
        myList[1] = "Scary Movie 2";
        myList[2] = "Forrest Gump";
        myList[3] = "Ringo";
        myList[4] = "Rango";
        myList[5] = "Fist Fight";
        myList[6] = "Over the hedge";
        myList[7] = "Ella Enchanted";
        myList[8] = "Spy Kids";
        myList[9] = "Scary Movie 3";

        int numMovies = 10; //holds the number of movies currently in myList array
        boolean loopContinue = true;

        do{
            displayMenu();
            int choice = Integer.parseInt(s.nextLine()); //assuming input is valid
            switch(choice){
                case 1: 
                    // display list
                    //System.out.println(Arrays.toString(myList)); //will include elements that have not been set yet
                    //don't use length in loop to access array elements -- if the array is only partially full
                    viewMyList(myList, numMovies);
                    break;
                case 2: 
                    //ask for movie
                    //add to list
                    boolean movieAdded = addMovie(myList,numMovies,s);
                    if(movieAdded){
                        numMovies++;
                    }
                    viewMyList(myList,numMovies);
                    break;
                case 3: 
                    //ask for movie
                    if(deleteMovie(myList, numMovies, s)){
                        numMovies--;
                    }
                    viewMyList(myList,numMovies);
                    break;
                case 4: loopContinue = false; break;
                default: System.out.println("Invalid option");
            }
        }while (loopContinue);
    }
/* display menu is called once per main dowhile loop
this method doesn't need to return anything
all we want to do is set up print statements, telling the user what options they have*/
   public static void displayMenu(){ 
    // options are display/add/delete/exit
    System.out.println("1. Display my list");
    System.out.println("2. Add a movie");
    System.out.println("3. Delete a movie");
    System.out.println("4. Exit");
    System.out.println("Choose your option: ");
   }

   public static void viewMyList(String[] list, int count){ 
    System.out.println(Arrays.toString(list));
    for(int i = 0; i < count; i++){
        System.out.print(list[i]+ ", ");
    }
   }

    public static boolean addMovie(String[] list, int count, Scanner s){
        System.out.println("Enter a movie: ");
        String movie = s.nextLine();
        for(int i = 0; i < count; i++){
            list[i] = movie;
            return true;
            
        }
        return false; 
    }
    public static String getMovie(Scanner s){ 
        System.out.println("Enter a movie: ");
        return s.nextLine();
    }
    public static boolean deleteMovie(String[] list, int count, Scanner s){ 
        System.out.println("Enter a movie to delete: ");
        String movie = s.nextLine();
        for(int i = 0; i < count; i++){
            if(list[i].equals(movie)){
                return true;
            }
        }
        return false;
    }





 }