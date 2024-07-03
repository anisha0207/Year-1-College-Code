public abstract class Shape{
    private String color;//intialize variables that characterize shapes
    private String name;
    private static int numShapes = 0;//number of shapes

    public Shape(){
        numShapes++;//increment
    }
    public Shape (String color, String name){//call back private adn initialize
        this.color = color;
        this.name = name;
        numShapes++;//incrememnt
    }
    public void setColor (String color){//set color
        this.color = color;
    }
    public String getColor (){
        return this.color;
    }
    public void setName (String name){//set name
        this.name = name;
    }
    public String getName (){//get name
        return this.name;
    }
    public static int getNumShapes(){//get integer value
        return numShapes;
    }

    @Override
    public String toString(){//display info
        return "\t Color: " + color + "Name: " + name;
    }
    public abstract double computeArea();//these two abstracts wil be used by other java class: circle, triangle, rectangle
    public abstract double computePerimeter();
}