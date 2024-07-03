public class Circle extends Shape{
    private double radius;//radius of circle
    private static int numCircles = 0;

    public Circle(){
        numCircles++;//increment number of cricle shapes
    }
    public Circle (double radius){
        super();//calling from superclass Shape
        this.radius = radius;
        numCircles++;
    }
    public Circle (String color, double radius){
        super(color, "Circle");//from superclass variables
        this.radius = radius;
        numCircles++;
    }
    public double getRadius(){
        return radius;//getter method
    }
    public void setRadius(double radius){
        this.radius = radius;//setter
    }
    public static int getNumCircles(){
        return numCircles;//getter for number of circles
    }
    @Override
    public double computePerimeter(){
        return 2 * Math.PI * radius; //find th perimeter of cricle
    }
    @Override
    public double computeArea(){
        return Math.PI * radius * radius;//area of circle
    }
    @Override
    public String toString(){
        return super.toString() + "\t radius: " + radius + "Area: " + computeArea();//print out
    }


}