/* Anisha Dasgupta
   Date: 05/03/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Create super class with name, price and get Type initalized for Fruit and Vegetable to extend from for polymorphism
*/
//Food and getType() is abstract due to the inheritance method that both fruit and vegetable are extending from 
public abstract class Food{
    private String name;//intialize variables 
    private double price;
    protected static int numFood = 0;//increment number of foods

    public Food(String name, double price){
        this.name = name;//call out the private variables
        this.price = price;
        numFood++;//increment each time
    }
     public String getName(){
        return name;//getter method for name
    }
    public double getPrice(){
        return price;//getter method for price
    }
    public void setName(String name){
        this.name = name;//setter method for name
    }
    public void setPrice(double price){
        this.price = price;//setter method for price
    }
    public static int getNumFood(){
        return numFood;//get numFood
    }
    public abstract String getType();//allows Fruit and Vegetable to extend and use this within toString()

    @Override
    public String toString (){//override to return the name of the food
        return name;
    }
    @Override
    public boolean equals(Object obj){//boolean statement where foo dis comapred with name and getType
        if (obj instanceof Food){
            Food f = (Food) obj;
            return this.name.equals(f.name) && 
                    this.getType().equals(f.getType());
        }
        return false;//return false if not found when user asks for food from the menu
        
    }
}