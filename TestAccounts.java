/* Anisha Dasgupta
   Date: 4/20/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Main method used to print out the checking and saving accounts while creating a menu for reader to view or display the accounts differently through finding or sorting
*/
import java.util.Scanner;
public class TestAccounts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CheckingAccount[] checkAccounts = new CheckingAccount[5];//place in arrays of names and checking account value 
        checkAccounts[0] = new CheckingAccount("William Burst", 10000);
        checkAccounts[1] = new CheckingAccount("Nathan Steward", 24900);
        checkAccounts[2] = new CheckingAccount("George Duck", 29990);
        checkAccounts[3] = new CheckingAccount("Sam Lawrence", 3750.75);
        checkAccounts[4] = new CheckingAccount("Doug Pearl", 10.75);

        SavingsAccount[] saveAccounts = new SavingsAccount[5];//place in arrays of names and saving account value 
        saveAccounts[0] = new SavingsAccount("Isabel Truman", 89250, 10.5);
        saveAccounts[1] = new SavingsAccount("Andrew Sullivan", 12734, 12.1);
        saveAccounts[2] = new SavingsAccount("Emma Stevens", 31250, 8.89);
        saveAccounts[3] = new SavingsAccount("Lara Stevens", 75000, 9.25);
        saveAccounts[4] = new SavingsAccount("Amelia Pearl", 123456, 2.3);

        int choice;
        do{
            //prompt menu option
            System.out.println("1. Display Accounts");
            System.out.println("2. Find Account");
            System.out.println("3. Sort Accounts");
            System.out.println("4. Apply Interest (to all savings accounts)");
            System.out.println("5. Exit");
            choice = s.nextInt(); //validate that is 1-5
            //s.nextLine();
            switch(choice){
                case 1: //call both version of print
                    System.out.printf("%-10s\t%-10s\t%-20s\t%-10s\t%-10s\n", "Type", "Number", "Owner", "Balance", "Interest Rate");
                    printAccounts(checkAccounts);
                    printAccounts(saveAccounts);
                    break;
                case 2: //find account
                //prompt for account number and make sure it is length == 10
                //assume it has only digits
                //call find using input from user
                    System.out.println("Enter an account number to find");
                    s.nextLine();
                    String accFind = getAccountNumber(s);
                    findAccounts(checkAccounts, saveAccounts, accFind);
                    break;
                case 3: //call both versions of sort
                    sortAccounts(checkAccounts);
                    sortAccounts(saveAccounts);
                    break;
                case 4: //call apply interest
                    applyInterest(saveAccounts);
                    break;
                case 5: //exit
                    System.out.println("Goodbye");
                    break;
                default: System.out.println("Invalid choice, try again");
            }
        }while(choice !=5);
    }
    //must be staic since the main method is static
    public static void printAccounts(CheckingAccount[] list){
        for (int i = 0; i<list.length; i++){
            System.out.println(list[i]); //SOPln(list[i].toString());
        }
    }
    public static void printAccounts(SavingsAccount[] list){
        for (SavingsAccount saveTemp: list){ //for-each loop, data type for variable will be savings account
            System.out.println(saveTemp);//print savings account in a new line
        }
    }

    public static void findAccounts(CheckingAccount[] list1, SavingsAccount[] list2, String accNum){
        int index = -1;
        for (int i= 0; i< list1.length; i++){
            if (list1[i].getNumber().equals(accNum)){
                index = i;
                System.out.println("Account found!");
                System.out.println(list1[i]);
            }
            if (list2[i].getNumber().equals(accNum)){
                index = i;
                System.out.println("Account found!");
                System.out.println(list2[i]);
            }
        }

        if (index == -1){
            System.out.println("Account not found!");
        }
    }

    public static void sortAccounts(CheckingAccount[] list){
        //insertion sort in ascending order by balance
        for (int i = 1; i < list.length; i++){//use insertion sort to sort the array in ascending order
            CheckingAccount value = list[i];
            int j = i -1;
            while(j >= 0 && list[j].getBalance() > value.getBalance()){
                list[j + 1] = list[j];
                j--;
            }
            list[j+1] = value;
        }

        
    }
    public static void sortAccounts(SavingsAccount[] list){
        //selection sort descending order by interest rate
        for (int i = 0; i < list.length-1; i++){//use selection sort for descending order
            int max = i;
            for (int j = i +1; j< list.length; j++){
                if (list[j].getYearlyInterest() > list[max].getYearlyInterest()){
                    max = j;
                }
            }
            SavingsAccount temp = list[max];
            list[max] = list[i];
            list[i] = temp;
        }
    }
    
    public static void applyInterest(SavingsAccount[] list){//apply the interest to the value and interate each value in array from list
        for (int i =0; i<list.length; i++){
            list[i].applyInterest();
        }
        
    }
    //helper function
    public static String getAccountNumber(Scanner s){//create a function or the scanner class to validate its length to be 10
        boolean needInput = true;
        String ret = "";
        while(needInput){
            ret = s.nextLine();
            //System.out.println(ret);
            if (ret.length() == 10){
                return ret;
            }
            else{
                System.out.println("Error: account number must be 10 digits long.");
            }
        }
        return ret;
    }

}