/* Anisha Dasgupta
   Date: 05/03/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Testing the code and implementing food, fruit, and vegetable codes into the cart displayed below
*/
//toString() is overridden in both the Vegetable and Fruit classes. 
//if an object in the array is an instance of Fruit, the `toString()` method overridden in the Fruit class will be invoked.
import java.util.Scanner;
public class FoodTest{
    public static void main (String[]args){
        Scanner scan = new Scanner (System.in);
        Food[] groceryCart = new Food[50];//call the size of the array
        groceryCart[0] = new Vegetable("Romaine", 1.09, "Green");
        groceryCart[1] = new Fruit("Mango", 3.79, true);
        groceryCart[2] = new Vegetable("Brussel Sprouts", 4.56, "Green");
        groceryCart[3] = new Fruit("Blueberry", 0.89, false);
        groceryCart[4] = new Vegetable("Purple Carrots", 1.56, "Purple");
        groceryCart[5] = new Vegetable("Spinach", 2.32, "Green");
        groceryCart[6] = new Vegetable("Carrots", 1.45, "Orange");
        groceryCart[7] = new Vegetable("Potatoes", 3.99, "Red");
        groceryCart[8] = new Vegetable("Broccoli", 5.21, "Green");
        groceryCart[9] = new Vegetable("Turnips", 0.99, "White");
        groceryCart[10] = new Vegetable("Onions", 1.99, "Yellow");
        groceryCart[11] = new Fruit("Apples", 5.79, true);
        groceryCart[12] = new Fruit("Banana", 0.78, false);
        groceryCart[13] = new Fruit("Kiwi", 2.65, true);
        groceryCart[14] = new Fruit("Strawberry", 4.79, true);
        groceryCart[15] = new Fruit("Watermelon", 6.32, false);//there is actuall 16 total, which is where null comes in afterward

        /*displayCart(groceryCart);//display the menu
        sortByPrice(groceryCart);//sort the menu
        System.out.println("Cart (sorted by price): ");
        displayCart(groceryCart);//display the sorted menu 

        Scanner scan = new Scanner(System.in);//ask the user for the number of items to search for
        System.out.println("How many items would you like to search for?");
        int item = scan.nextInt();

        while (item <= 0) {//if less or equal to 0, error mesage, start over
            System.out.println("Invalid, must enter an int greater than 0");
            System.out.println("How many items would you like to search for?");
            item = scan.nextInt();
        }

        scan.nextLine(); // Consume newline left by nextInt()

        for (int i = 0; i < item; i++) {//Asks what to look for 
            System.out.println("What item would you like to search for? (Enter a name)");
            String foodName = scan.nextLine();
            searchCart(groceryCart, foodName);//starts searching in the cart
        }
        //searchCart(groceryCart, foodName);
        checkOut(groceryCart);//Later on checks out by finding the total and average*/

        int choice;
        do{
            System.out.println("Welcome to your cart, please choose your menu option:");
            System.out.println("1: display cart");
            System.out.println("2: sort cart");
            System.out.println("3: search cart");
            System.out.println("4: check out");
            choice = scan.nextInt();
            switch(choice){
                case 1:
                    displayCart(groceryCart);
                    break;
                case 2: 
                    sortByPrice(groceryCart);//sort the menu
                    System.out.println("Cart (sorted by price): ");
                    displayCart(groceryCart);
                    break;
                case 3:
                    System.out.println("How many items would you like to search for?");
                    int item = scan.nextInt();

                    while (item <= 0) {//if less or equal to 0, error mesage, start over
                        System.out.println("Invalid, must enter an int greater than 0");
                        System.out.println("How many items would you like to search for?");
                        item = scan.nextInt();
                    }

                    scan.nextLine(); // Consume newline left by nextInt()

                    for (int i = 0; i < item; i++) {//Asks what to look for 
                        System.out.println("What item would you like to search for? (Enter a name)");
                        String foodName = scan.nextLine();
                        searchCart(groceryCart, foodName);//starts searching in the cart
                    }
                    break;
                case 4: 
                    checkOut(groceryCart);
                    break;
                default: System.out.println("Error: please choose number 1-4");
            }
        }while(choice != 5);
    }
        public static void displayCart(Food[]list){//display cart using null since the size is 50 instead of 16
            System.out.println("Items Currently in Your Cart: ");
            for (Food cart : list){
                if (cart != null){
                    System.out.print(cart.toString());//using the toString format for conveneience
                }
            // System.out.println();
            //for (int i = 0; i < 16; i++) {
                //System.out.println(list[i]);
            }
        }

        public static void searchCart(Food[]list, String foodName){
            Food key = new Fruit(foodName, 0.0, true);
            boolean found = false;
            for (Food cart : list) {
                if (cart != null && cart.equals(key)) {//if the item asked by user is found, then print, if not call on the error message
                    System.out.println("Item found in your cart:");
                    System.out.printf("\t%-15s %-25s $%.2f%n", cart.getName(), cart.getType(), cart.getPrice());
                    found = true;
                    break; // Exit the loop once the item is found
                }
            }
            if (!found) {
                System.out.println("Item not found in your cart.");
            }
        }

        public static void sortByPrice(Food[] cart){
            for (int i = 0; i < cart.length-1; i++){//descending order using selection sort
                if(cart[i] != null){//must incorporate since size is big
                    int maxIndex = i;
                    Food max = cart[i];////
                    for (int j = i +1; j< cart.length; j++){
                        if(cart[j] != null){
                            if (max.getPrice() < cart[j].getPrice()){/////
                                maxIndex = j;
                                max = cart[j];
                            }
                        }
                    }
                    if(maxIndex != i){
                        cart[maxIndex] = cart[i];
                        cart[i] = max;
                    }
                }
            
            }
        }
         

        public static void checkOut(Food[]cart){
            double total = 0;
            int itemCount = 0;
            for (Food item : cart){
                if(item != null){
                    total += item.getPrice(); //find total prie 
                    itemCount++;
                }
            }
            double average = total/itemCount;//find average
            System.out.printf("The average cost per item in your cart is: $%.2f%n", average);
            System.out.printf("The total cost for everything in your cart is: $%.2f%n", total);
        }

    }

