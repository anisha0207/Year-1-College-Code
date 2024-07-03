public class Rectangle extends Shape{
    private double length;//intitialize variables
    private double width;
    private static int numRects = 0;

    public Rectangle(){
        numRects++;//increment the number of rectangles
    }
    public Rectangle (String color){
        super(color, "Rectangle");//call from the super class Shapes
        numRects++;//increment each time 
    }
    public Rectangle (String color, double length, double width){
        super(color, "Rectangle");//again call the super class
        this.length = length;//intialize from the private menu
        this.width = width;
        numRects++;
    }
    public double getLength(){//getter for length
        return length;
    }
    public double getWidth(){//getter for width
        return width;
    }
    public void setLength( double length){//setter for length
        this.length = length;
    }
    public void setWidth(double width){//setter for length
        this.width = width;
    }
    public static int getNumRects(){//getter for integer
        return numRects;
    }
    @Override
    public double computePerimeter(){//calculate perimeter
        return (2*length) + (2*width);
    }
    @Override
    public double computeArea(){//calculate area
        return length * width;
    }
    @Override
    public String toString(){//display the values
        return super.toString() + "\t width: " + width + "length: " + length + "Area: " + computeArea();
    }


}