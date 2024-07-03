/* Anisha Dasgupta
   Date: 5/15/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Using vehicles to indicate whether parked or drive while alos gathering info on vin, make, model, year, door, and transmission placed in a 2D array
*/
public Car extends Vehicle{//private variables initialized
    private int doors;
    private boolean transmission; //true means automatic transmission, false indicates manual transmission

    public Car (int door, boolean transmission){//calling out private variables, also two constructors, to call out twice
        this.door = door;
        this.transmission = transmission;
    }
    public Car (String ma, String mo, int y, int d, boolean t){
        super (ma, mo, y);//ma = make, mo = model, y = year from the super class
        this.d = door;
        this.t = transmission;
    }
    public int getDoors(){//making sure variables match above
        return d;
    }
    public void setDoors(int d){//continue
        this.door = d;
    }
    public boolean getTransmission(){//getter transmission
        return transmission;
    }
    public void setTransmission(boolean t){//setter transmission
        this.transmission = t;
    }
    @Override
    public void drive(){//override from super
        System.out.println("shifting to drive");
    }
    @Override
    public void park(){//override from super
        System.out.println("in neutral or park");
    }
    @Override
    public String toString(){//override from super
        return super.toString()+ "; Door: " + d + "; Transmission: " + t;

    }
}