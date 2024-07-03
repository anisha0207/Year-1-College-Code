public class Triangle extends Shape{//initialize varaibles in private for size
    private double base;
    private double height;
    private double side1;
    private double side2;
    private static int numTris = 0;//number of triangles

    public Triangle(){
        numTris++;//increment the numbre of triangles
    }
    public Triangle (String color ){
        super(color, "triangle");//super class from shapes
        numTris++;//increment
    }
    public Triangle (String color, double base, double height, double side1, double side2){
        super(color, "triangle");//call from super class again
        this.base = base;//initalize varaibles from private
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        numTris++;//increment
    }
    public double getBase(){//get base
        return base;
    }
    public double getHeight(){//get height
        return base;
    }
    public void setBase( double base){//set base
        this.base = base;
    }
    public void setHeight(double height){//set height
        this.height = height;
    }
    public static int getNumTris(){//get integer value
        return numTris;
    }
    @Override
    public double computePerimeter(){//calculate perimeter 
        return side1 + side2 + base;
    }
    @Override
    public double computeArea(){//calculate area
        return (1/2) * base * height;
    }
    @Override
    public String toString(){//display info
        return super.toString() + "\t base: " + base + "height: " + height + "Area: " + computeArea();
    }


}