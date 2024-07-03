public class NetflixSearch{
    public static void main(String[]args){
        String[] movieLibrary = new String[100];
        movieLibrary[0] = "The Matrix";
        movieLibrary[1] = "The Godfather";
        movieLibrary[2] = "The Shawshank Redemption";
        movieLibrary[3] = "Lawrence of Arabia";
        movieLibrary[4] = "Casablanca";
        movieLibrary[5] = "Forrest Gump";
        movieLibrary[6] = "Pulp Fiction";
        movieLibrary[7] = "The Dark Knight";
        movieLibrary[8] = "Citizen Kane";
        movieLibrary[9] = "Schindler's List";
        movieLibrary[10] = "The Wizard of Oz";
        movieLibrary[11] = "Psycho";
        movieLibrary[12] = "Inception";
        movieLibrary[13] = "Titanic";
        movieLibrary[14] = "Goodfellas";
        movieLibrary[15] = "Reservoir Dogs";
        movieLibrary[16] = "The Heat";
        movieLibrary[17] = "Saving Private Ryan";
        movieLibrary[18] = "2001: A Space Odyssey";
        movieLibrary[19] = "Space Jam";
        int numMovies = 20;

        displayList(movieLibrary,numMovies);
        numMovies += fillList(movieLibrary,numMovies); 
        System.out.println();

        //display filled array
        displayList(movieLibrary,numMovies);
        System.out.println();
        //add calls to search methods to test in a variety of ways
        int length = 10;
        int movieKey = 5;
        search(movieLibrary, numMovies, length);
        System.out.println();
        search(movieLibrary, numMovies, movieKey);
    }

    public static void displayList(String[]list, int count){
     //display only 5 elements per line
     for (int i = 0; i< count; i++){
        if (i % 5 == 0){
            System.out.println();
        }
        System.out.print(list[i] + ", ");
        //display only 5 elements per line
        //use loop to iterate through list to display movie titles to user
        //count represents number of elements in array

     }

    }
    public static int fillList(String[]list, int count){
        //add at least 10 additional moveis to the list array
        list[count]= "Barbie";
        list[count+1]= "Toy Story";
        list[count+2]= "Frozen";
        list[count+3]= "Moana";
        list[count+4] = "The Lion King";
        list[count+5]= "The Little Mermaid";
        list[count+6]= "Beauty and the Beast";
        list[count+7]= "Aladdin";
        list[count+8]= "The Nightmare Before Christmas";
        list[count+9]= "The Princess and the Frog";
        list[count+10] = "Tangled";
        list[count+11] = "Encanto";
        list[count+12] = "Lightyear";
        list[count+13] = "Turning Red";
        list[count+14] = "Far from Home";
        return 15; //change this to return the number of elements added to list

    }

    //overload search by defining it twice
    public static void search(String[]list, int count, int lenKey){
        for (int i = 0; i < count; i++){
            if(list[i].length() == lenKey){
                System.out.println(list[i]);
                return;
            }

        }

    }

    public static void search(String[]list, int count, String movieKey){
        int mid, low, high;
        int keyIndex = -1;
        low = 0;
        high = list.length -1;
        while(high>=low){
            mid = (high+low)/2;
            if (list[mid].compareTo(movieKey) < 0){
                low = mid+1;
            } else if (list[mid].compareTo(movieKey)> 0){
                high = mid-1;
            } else{
                keyIndex = mid;
                break;
            }
        }
    }
    



    }
