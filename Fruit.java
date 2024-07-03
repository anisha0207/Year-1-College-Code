/* Anisha Dasgupta
   Date: 05/03/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Find fruit and indicate its type, name, price and seed to use
*/
//Overloading is demonstrated by the multiple constructors in the Food, Vegetable, and Fruit classes, where each constructor has a different parameter.
//Overriding toString() method in the Food class and the `getType()` method in 
//equals() method is overridden in the Food class to provide comparison logic.
//The overridden methods in the Fruit class, such as toString() and getType() was invoked
//Fruit class will be called to retrieve the type of each Fruit object.
public class Fruit extends Food{
    private boolean seeds;//intialize variables
    private static int numFruit = 0;//number of fruits

    public Fruit(boolean seeds){
        super("none", 0.0);//intilizer, default, super class from Food
        this.seeds = seeds;
        numFruit++;//increment 
    }
    public Fruit(String name, double price, boolean seeds){
        super(name, price);//super class from Food
        this.seeds = seeds;
        numFruit++;//increment
    }
    public boolean getSeeds(){//getter for seed
        return seeds;
    }
    public void setSeeds(boolean seeds){//setter for seed
        this.seeds = seeds;
    }
    public int getNumFruit(){//getter for number of fruits
        return numFruit;
    }
    @Override
    public String getType(){//call the getType from Food to return "Fruit"
        return "Fruit";
    }
    @Override
    public String toString(){//to print out the dsiplay method for FoodTest
        return String.format("%-15s %-25s $%.2f\n", this.getName(), this.getType() + " (" + this.getSeeds() + ")", this.getPrice());
    }
}