public class ShapeTest{
    public static void main(String[]args){
        Shape[] shapes = new Shape [3];//create array of shapes
        shapes[0] = new Circle ("red",6.5);//start usign parameters to create a shape, color and size
        shapes[1] = new Rectangle ("orange",4,5);
        shapes[2] = new Rectangle ("yellow", 6,5) ;

        for (Shape temp: shapes){//through each iteration, print out the area and perimeter of each shapes displayed above
            System.out.println(temp);
            System.out.println("Area: " + temp.computeArea());
            System.out.println("Perimeter: "+ temp.computePerimeter());
        }
        
    }
}