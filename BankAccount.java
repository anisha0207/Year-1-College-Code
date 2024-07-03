/* Anisha Dasgupta
   Date: 4/20/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Parent class created for SavingsAccount and CheckingAccount to invoke from
*/

import java.util.Random;

public class BankAccount{
    private String number;//initalize the variables stored as private
    private String owner;
    protected double balance;//visible within derived (child) classes
    private static Random random = new Random(1024);//we will generate for account numbers match the random numbers 

    public BankAccount(String owner, double balance){
        this.owner = owner;//create constructors
        this.balance = balance;
        number = "";//empty
        for (int i =0; i<10; i++){
            number += random.nextInt(10) + "";// bank account numbers are Strings constituted of 10 digits (0-9). 
        }
    }
    public String getNumber (){//getter methods to return each variable
        return number;
    }
    public String getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){//to deposit add amount to the balance 
        balance += amount;
    }
    public boolean withdraw (double amount){
        if (balance < amount){//if the balance is not big enough for you to withdraw, it will stop 
            return false;
        }else{//then you can withdraw if balance big enough
            balance -= amount;
            return true;
        }
    }

    @Override //Each class should override toString to format the output in a readable manner.
    public String toString(){//returns string representation of the object, recommended to override
        return String.format("%-10s\t%-20s\t%-10.2f", number, owner, balance);//works like printf
    }
}