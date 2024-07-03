/* Anisha Dasgupta
   Date: 2/1/2024
   CSE7 Spring 2024: Lab 1
   IDE: VSCode; JDK: 11
   Calculate the cost off hosting a pizza party using the input from user
*/
import java.util.Scanner;
public class PizzaParty {
    public static void main (String[]args){
       double budget;
       int numFriends;
       double avgSlicePerson;
       double costPerPizza;
       int wholePizzas;
       double totalPizzaCost;
       double totalTaxOwed;
       double total;
       final int SLICE_PER_PIZZA = 8;
       final double SALES_TAX = 0.06;
       final double DELIVERY_FEE = 4.99; 

       Scanner scan = new Scanner(System.in);
       System.out.print("How much do you have to spend? ");
       budget = scan.nextDouble();
       System.out.print("How many friends will join you? ");
       numFriends = scan.nextInt();
       System.out.print("How much will each person eat (avg slices)? ");
       avgSlicePerson = scan.nextDouble();
       System.out.println("What is the cost per pizza? ");
       costPerPizza = scan.nextDouble();

       double slices = (numFriends + 1) * avgSlicePerson;
       double pizzas = slices/SLICE_PER_PIZZA; 
       wholePizzas = (int) (Math.ceil(pizzas)); 
       totalPizzaCost = wholePizzas * costPerPizza;
       totalTaxOwed = totalPizzaCost * SALES_TAX;
       total = totalPizzaCost + totalTaxOwed + DELIVERY_FEE;

       System.out.println("Pizza Party Totals:");
       System.out.println("You will need " + wholePizzas + " Pizza(s) for a cost of $" + totalPizzaCost);
       System.out.printf("Tax: $%.2f\n", totalTaxOwed);
       System.out.println("Delivery: $" + DELIVERY_FEE);
       System.out.printf("Total Cost: $%.2f\n", total);
       boolean result = budget >= total;
       System.out.println("\nCan you afford? " + result);
       

    }
}