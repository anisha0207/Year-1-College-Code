/* Anisha Dasgupta
   Date: 2/10/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   1. Fixing and identifying the errors within the code. In this program,
   the code is trying to fid the number of dollars and quarters using the 
   given money inputted.
   2. The output should be Dollars = 197, Quarters = 0
   3. Compiler means the syntax errors within the code, normally you can tell this
    by looking at missing punctuation, misnaming a variable, forgetting brackets or semicolon.
    Runtime means error that occurs when code is executed during runtime. You can tell this by the crash 
    in the system or only runs half of the code.
   4. The process to addressing the errors by using the terminal below that will indicate the specific errors pointed out.
   some of the troubleshooting strategies I used are going by each line to determine the error, along with using my knowledge on 
   semicolon, initializing variable, proper naming variables, etc.
*/

public class Test{
    public static void main(String [] args){
        //Variables and constants
        final int DOLLAR = 100, QUARTER = 25; //"f" should not be capitalized in "final"
        double twoMoney; //never start variable name in numbers, use camel case
        int dollars, quarters; // no comma needed after quarters, use semicolon
        double money = 197.07; // initialize the variable money, it will be double
        //Processing
        int amount = (int) (money*100);
        dollars = amount / DOLLAR;
        amount = amount % DOLLAR;
        quarters = amount / QUARTER; // wrong use of division symbol
        //output
        System.out.println("Dollars= " + dollars + ", Quarters= "+ quarters); //wrong use of quotation and concatenation
    }
}