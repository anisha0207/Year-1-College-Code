/* Anisha Dasgupta
   Date: 4/11/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   calculting the two equations using creating and using objects fromt the classes on calculator
*/

public class CalculatorTest {
   
   	public static void main(String[] args) {
        Calculator calc = new Calculator();
        //java CalculatorTest 1 10.0 5.0
        //Assume data type is correct

        //args[0] integer
        int numEq = Integer.parseInt(args[0]);
        //if numEq is not 1 or 2, print error
        if (numEq != 1 && numEq != 2) {
            System.out.println("invalid equation");
            System.exit(0);
        }

        //args[1] double
        double num1 = Double.parseDouble(args[1]);
        //print if error, not within range
        if (num1 < -1000 || num1 > 1000) {
            System.out.println("num1 out of range");
        }

        //args[2] double
        double num2 = Double.parseDouble(args[2]);
        //print if error, not within range
        if (num2 < -1000 || num2 > 1000) {
            System.out.println("num2 out of range");
            System.exit(0);
        }

        //if numEq is 1 or 2 and numbers are valid, solve equation
        //else end program



        /Users/sanjoydasgupta/Downloads/codingrooms-project-2/Account Class


	}
    public static void equationOne(Calculator calc, double x, double y){
        //initial vale of instance field, value
        calc.clear();
        System.out.printf("%.1f", calc.getValue());

        //value after adding 7
        calc.add(7);
        System.out.printf("\n%.1f", calc.getValue());

        //after multiplying by num1
        calc.multiply(x);
        System.out.printf("\n%.1f", calc.getValue());

        //value after add num2
        calc.add(y);
        System.out.printf("\n%.1f", calc.getValue());

        //value after subtract 13
        calc.subtract(13);
        System.out.printf("\n%.1f", calc.getValue());

        //value after divide by 4
        calc.divide(4);
        System.out.printf("\n%.1f", calc.getValue());
        
        //value after calling clear() method
        calc.clear();
        System.out.printf("\n%.1f", calc.getValue());

        System.out.println("");

    }
    public static void equationTwo(Calculator calc, double x, double y){
        //initial vale of instance field, value
        calc.clear();
        System.out.printf("%.1f", calc.getValue());

        //value add to y
        calc.add(y);
        System.out.printf("\n%.1f", calc.getValue());

        //value power of 6
        for (int i = 0; i < 5; i++){
            calc.multiply(y);
            System.out.printf("\n%.1f", calc.getValue());
        }

        //add to x
        calc.add(x);
        System.out.printf("\n%.1f", calc.getValue());

        //value after divide 10
        calc.divide(10);
        System.out.printf("\n%.1f", calc.getValue());
        
        //value after calling clear() method
        calc.clear();
        System.out.printf("\n%.1f", calc.getValue());

        System.out.println("");

    }
}