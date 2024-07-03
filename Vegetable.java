/* Anisha Dasgupta
   Date: 05/03/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Find vegetable and indicate its type, name, price and color to use
*/
//Constructor changing is the process of calling one constructor from another constructor with the current object
//used through food class where this() method is used to intialize the variables to avoid duplicating.
//implicit call comes in for super class during default for Vegetable()
public class Vegetable extends Food{
    private String color;
    protected static int numVeg = 0;

    public Vegetable (String color) {
        super("none", 0.0);
        this.color = color;
        numVeg++;
    }
    public Vegetable (String name, double price, String color){
        super(name, price);
        this.color = color;
        numVeg++;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public static int getNumVeg(){
        return numVeg;
    }
    @Override
    public String getType(){//call the getType from Food to return "Vegetable"
        return "Vegetable";
    }
    @Override
    public String toString(){//to print out the dsiplay method for FoodTest
        return String.format("%-15s %-25s $%.2f\n", this.getName(), this.getType() + " (" + this.getColor() + ")", this.getPrice());
    }
}