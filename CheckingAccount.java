/* Anisha Dasgupta
   Date: 4/20/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Extended from BankAccount and prints out the value of the checking account for each owner and its balance
*/
public class CheckingAccount extends BankAccount{
    public CheckingAccount(String owner, double balance){
        super(owner, balance);
    }

    @Override
    public String toString(){
        return String.format("%-10s\t%s", "Checking", super.toString());//super will invoke the parent class
    }
}