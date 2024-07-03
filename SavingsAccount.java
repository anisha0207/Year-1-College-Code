/* Anisha Dasgupta
   Date: 4/20/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Extends from BankAccount and returns monthly interest and its owner
*/
public class SavingsAccount extends BankAccount{//extending from super class 
    private double yearlyInterestRate; //6.3

    public SavingsAccount(String owner, double balance, double yInterestRate){
        super(owner, balance);//call back variables from BankAccount
        this.yearlyInterestRate = yInterestRate;//use the variable that is newly calle on in this class
    }
    public void setYearlyInterest(double yIR){//setter method 
        this.yearlyInterestRate = yIR;
    }
    public double getYearlyInterest(){//getter method
        return yearlyInterestRate;
    }
    public double getMonthlyInterest(){//return monthly interest by dividing yearly interest but in a month
        return balance * (yearlyInterestRate / 12 / 100);
    }
    public double applyInterest(){//already created the method above and call onto that again
        double month = getMonthlyInterest();
        balance += month;//add the monthly interest to the balance
        return month;
    }

    @Override
    public String toString(){//formatting and spacing needed for savings account as displayed in the example
        return String.format("%-10s\t%s\t%-10.2f", "Savings", super.toString(), yearlyInterestRate);//super will invoke the parent class
    }

}