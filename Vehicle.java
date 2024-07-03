/* Anisha Dasgupta
   Date: 5/15/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Using vehicles to indicate whether parked or drive while alos gathering info on vin, make, model, year, door, and transmission placed in a 2D array
*/
public abstract class Vehicle{//create private class to initialize varaibles
   private String vin; 
   protected String make;
   protected String model; 
   private int year;
   private static Random ran = new Random(2048);

   protected Vehicle(String make, String model, int year){//call out the private variables
      this.make = make;
      this.model = model;
      this.year = year;
      this.vin = generateVin();//calling onto the generator to generate 10 digits for vin
   } 
   private String generateVin(){//to generate
      String [] vin = new String[10];//has a size of 10
        for (int i = 0; i < 10; i++){//interating through all 10
            i = ran.nextInt(27);//it will randomize characters from 0-26, alphabet
            vin[i] = (char)('A' + i);//it will concatenate to 'A' to complete the characters need in the 10 digit
        }
        return vin;//return the array of 10 digitw
   }
   public getMake(){
      return make;//getter method for make
   }
   public getModel(){
      return model;//getter for model
   }
   public getYear(){
      return year;//getter for year
   }
   public getVin(){
      return vin;//getter for vin
   }
   public setVin(String vin){
      this.vin = vin;//setter for vin
   }
   @Override
   public abstract void drive();//overriding both drive and park that will be used in child class called Car
   @Override
   public abstract void park();
   @Override
   public String toString(){//override string to use for calling out info for Car
      return "VIN: " + vin+ "; Make: " + make + ", Model: " + model + "; Year: " + year;
   }
   @Override
   public boolean equals(Object o){//ensuring if the infrmation that the user asks for is equal adn found in the 2D array list as indicated below
      if (o instanceof Vehicle){
            Vehicle v = (Vehicle) obj;//make, model, year, vin must match calling to instance of from Vehicle class
            return this.getVin().equals(v.getVin()) && 
                    this.make.equals(v.make) &&
                    this.model.equals(v.model) &&
                    this.year.equals(v.year);
        }
        return false;//if true above, must show what the vehicle is, if false, then not found
   }

}