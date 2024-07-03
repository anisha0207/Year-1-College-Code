/* Anisha Dasgupta
   Date: 5/15/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Using vehicles to indicate whether parked or drive while alos gathering info on vin, make, model, year, door, and transmission placed in a 2D array
*/
import java.util.Scanner;

//starting code for Final Exam in CSE 007 Spring 2024
//The purpose of this class is to create, view, search and sort a parking lot filled with Vehicles. 
//The parking lot is conceptually a two-dimensional array with 10 rows and ragged columns (varying length) wherein each element is a Car. 

public class ParkingLot{
    private static Vehicle[][] parkingSpaces; //#rows and size of each row will be set in createLot 
    private static boolean driveOrPark = true;
    public static void main(String[]args){ //do not change anything in the main method
        Scanner scn = new Scanner(System.in);
        /**A note about user input in this program: 
         * you should assume that the user will input the correct data type (either string or int) when prompted
         * the value of the integer menu choice will be checked, but all other input should be valid when prompted (vin, make, model, year)
         */
        createLot(); //set the size of the parkingSpaces matrix and rows
        fillLot();  //fill the parkingSpaces array with Car objects
        boolean loopNeeded = true;

        do{
            System.out.println("Choose a Menu Option: "); 
            System.out.println("1. Move or Park Vehicles"); 
            System.out.println("2. View all vehicles"); 
            System.out.println("3. Sort Vehicles"); 
            System.out.println("4. Search Lot for Vehicle"); 
            System.out.println("5. Exit"); 
            int choice  =  Integer.parseInt(scn.nextLine()); //assume the user always types an integer for menu option
            switch(choice){
                case 1: 
                    moveVehicles();
                    break;
                case 2: 
                    viewVehicles();
                    break;
                case 3:
                    //invoking sortLot (to be defined) for each row in parking spaces
                    for(Vehicle[] temp: parkingSpaces){
                        sortLot(temp);
                    }
                    break;
                case 4: 
                    System.out.println("Enter the vin of the vehicle to search for"); 
                    String vin = scn.nextLine(); 
                    System.out.println("Enter the make of the vehicle to search for"); 
                    String make = scn.nextLine(); 
                    System.out.println("Enter the model of the vehicle  to search for"); 
                    String model = scn.nextLine(); 
                    System.out.println("Enter the year of the vehicle to search for"); 
                    int year = Integer.parseInt(scn.nextLine()); 

                    searchLot(vin, make, model, year);
                    break;
                case 5:     
                    System.out.println("Goodbye");
                    loopNeeded = false;
                    break;
                default: System.out.println("Invalid menu option try again");
            }
        }while (loopNeeded);
    }

    //TODO: complete the method move vehicles to iterate through the parkingSpaces array and 
    //alternate calling either drive() or park() on each Vehicle in the two-dimensional array.
    //use the global static variable driveOrPark to alternate: if the variable is true, you should invoke drive(). If the variable is false, you should invoke park()
    //this is not random -- your program output should match the sample/expected exactly.
    //for full credit, use at least one for each loop to complete this
    public static void moveVehicles(Vehicle[][] list){
        boolean driveOrPark = true;//iterating through the list to find out whether drive or park is true or false, and execute thru that style
        for (car : list){
            if (!driveOrPark){
                car.drive();
            }else{
                car.park();
            }
        }

    }

    //TODO: Complete the method view vehicles display each car in the two-dimensional array parkingSpaces 
    //Use sample output below to guide you (formatting/spacing doesn’t have to match but content/capitalization does)
    public static void viewVehicles(Vehicle[][]list){//to view array, important that this parameter is defined to use in for loop below
        for (int i = 0; i < list[0].length; i++){
            System.out.println("Row" + i ": ");//for 7 rows: it will list out all seven
                for (int j = 0; j < list[i][j].length; j++) {//list out the titles of each type: vin, address, make, model, year...
                    System.out.printf("%-10s\t%-10s\t%-20s\t%-10s\t%-10s\n", "Memory Address", "VIN", "Make", "Model", "Year Door(Transmission)");
                    System.out.println(list[i][j]);//list out all the inforamtion as suggested above
                }
        }
    }
        
    

    //TODO: complete this method to use either insertion or selection sort to sort the array passed into the method into descending order by vin 
    //Note that this method is invoked in the main and passes each row into the method separately. You should sort list not parkingSpaces
    public static void sortLot(Vehicle[][]list){//must define array list to iterate through the array for aort
        for (int i = 1; i < list.length; i++) {//insertion sort used in descendng order
            Vehicle key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].getVin().compareTo(key.getVin()) < 0) {//comapring vin
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }

    //TODO: complete this method  use linear search to determine where a vehicle is in the lot (if at all) given String vin, String make, String model, and int year. 
    //Be sure to display the results of the search within this method. 
    //for full credit, be sure to invoke equals from Vehicle
    public static void searchLot(String vin, String make, String model, int year){//search using these info from parameter
        Vehicle key = new Vehicle(vin, make, model, year);
        Vehicle [][] list = new Vehicle[7][];//from size 7 of row, but column is unknown
        boolean found = false;//using boolean style to make sure if these values will come out true or false
            for (Vehicle cart : list) {//through for each loop, make uare if values are true through equals()
                if (cart.equals(key)) {//if the item asked by user is found, then print, if not call on the error message
                    System.out.println("Vehicle found:");//if found, execute
                    System.out.printf("\t%-15s %-25s $%.2f%n", cart.getVin(), cart.getMake(), cart.getModel(), cart.getYear());
                    found = true;
                    break; // Exit the loop once the item is found
                }
            }
            if (!found) {//else false, no vehicle found
                System.out.println("Vehicle not found.");
            }
        
    }

    //provided method to set the size of parkingSpaces to have 7 rows
    //each row has a different size
    public static void createLot(){
        parkingSpaces = new Vehicle[7][]; 
        parkingSpaces[0] = new Vehicle[2]; 
        parkingSpaces[1] = new Vehicle[3]; 
        parkingSpaces[2] = new Vehicle[4]; 
        parkingSpaces[3] = new Vehicle[5]; 
        parkingSpaces[4] = new Vehicle[4]; 
        parkingSpaces[5] = new Vehicle[3]; 
        parkingSpaces[6] = new Vehicle[2]; 
    }

    //for the given dimensions used in createLot, new Vehicles (Cars) are created and stored in the parkingSpaces array
    public static void fillLot(){
        parkingSpaces[0][0] = new Car ("Honda", "Pilot", 2021, 4, true); 
        parkingSpaces[0][1] = new Car ("Honda", "Accord", 2023, 4, false); 

        parkingSpaces[1][0] = new Car ("Ford", "Bronco", 2022, 2,true); 
        parkingSpaces[1][1] = new Car ("Ford", "Taurus", 2023, 4, true); 
        parkingSpaces[1][2] = new Car ("Ford", "F-150", 2022, 2, true); 

        parkingSpaces[2][0] = new Car ("Honda", "CR-V", 2018, 4, true); 
        parkingSpaces[2][1] = new Car ("Honda", "Civic", 2011, 4, false); 
        parkingSpaces[2][2] = new Car ("Chevrolet", "Malibu", 2020, 4, true);
        parkingSpaces[2][3] = new Car ("Volkswagen", "Jetta", 2017, 4, false); 

        parkingSpaces[3][0] = new Car ("Tesla", "Model Y", 2025, 4, true); 
        parkingSpaces[3][1] = new Car ("Hyundai", "Elantra", 2022, 2, false); 
        parkingSpaces[3][2] = new Car ("Toyota", "Highlander", 2024, 4, true);
        parkingSpaces[3][3] = new Car ("Audi", "TT", 2025, 2, false);
        parkingSpaces[3][4] = new Car ("Mazda", "CX-9", 2021, 4, true);

        parkingSpaces[4][0] = new Car ("Volvo", "S40", 2023, 4, false); 
        parkingSpaces[4][1] = new Car ("Buick", "Enclave", 2018, 4, true); 
        parkingSpaces[4][2] = new Car ("Subaru", "Forester", 2023, 4, false);
        parkingSpaces[4][3] = new Car ("Jeep", "Wagoneer", 2023, 4, true);

        parkingSpaces[5][0] = new Car ("Subaru", "Impreza", 2021, 4, true); 
        parkingSpaces[5][1] = new Car ("Porsche", "Macan", 2024, 4, true); 
        parkingSpaces[5][2] = new Car ("Acura", "MD-X", 2022, 4, true); 

        parkingSpaces[6][0] = new Car ("Lincoln", "Navigator", 2023, 4, true); 
        parkingSpaces[6][1] = new Car ("Infiniti", "QX-50", 2021, 4, true); 
    }
}