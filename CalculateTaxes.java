/* Anisha Dasgupta
   Date: 3/14/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   calculating income and taxes through AGI, wage, status, unemployment, etc through methods calling
*/


import java.util.Scanner;

public class CalculateTaxes {

    public static int getInt(Scanner s) {//initalize the scanner method
        int temp = -1;
        do {
            if (s.hasNextInt()) {
                temp = s.nextInt();
                if (temp >= 0) {
                    break;//if postive, break out of the loop
                } else {
                    System.out.println("ints should be positive >=0");//value must be postive 
                }
            } else {
                s.next();
                System.out.println("Invalid input");//input in the value again until positive
            }
        } while (true);
        return temp;
    }

    public static int calcAGI(int wages, int interest, int unemployment) {
        int sum = wages + interest + unemployment;
        return sum;//calculates AGI
    }

    public static int getDeduction(int status) {
        int deduction;
        if (status == 0) {
            deduction = 6000;
        } else if (status == 1) {
            deduction = 12000;
        } else if (status == 2) {
            deduction = 24000;
        } else {
            deduction = 6000;
        }
        return deduction;//calculated deduction through types of status
    }

    public static int calcTaxable(int agi, int deduction) {
        int taxableInc = agi - deduction;
        if (taxableInc < 0) {
            taxableInc = 0;
        }
        return taxableInc;//find taxable income through AGI and deduction 
    }

    public static int calcTax(int status, int taxable) {
        double tax = 0.0;
        if (status == 2) {
            if (taxable > 80000) {
                tax = 9200 + (0.22 * (taxable - 80000));
            } else if (taxable > 20000) {
                tax = 2000 + (0.12 * (taxable - 20000));
            }else{
                tax = 0.10 * taxable;
            }
        } else {
            if (taxable > 85000) {
                tax = 14500 + (0.24 * (taxable - 85000));
            } else if (taxable > 40000) {
                tax = 4600 + (0.22 * (taxable - 40000));
            } else if (taxable > 10000){
                tax = 1000 + (0.12 * (taxable - 10000));
            }else {
                tax = 0.10 * taxable;
            }
        }
        return (int) Math.round(tax);//calculate tax through the table given above, round the value to nearest whole number
    }

    public static int calcTaxDue(int tax, int withheld) {
        return tax - withheld;//calculate tax due from tax and witheld values
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//main method
        int wages = 0;//initalize value to default
        int interest = 0;
        int unemployment = 0;
        int status = -1;
        int withheld = 0;
        int agi;

        wages = getInt(scan);//calling back scan method to read values from user
        interest = getInt(scan);
        unemployment = getInt(scan);
        status = getInt(scan);
        withheld = getInt(scan);

        agi = calcAGI(wages, interest, unemployment);
        System.out.printf("AGI: $%,d\n", agi);//call on AGI method

        int deduction = getDeduction(status);
        System.out.printf("Deduction: $%,d\n", deduction);//call on deduction method

        int taxable = calcTaxable(agi, deduction);
        System.out.printf("Taxable income: $%,d\n", taxable);// call on taxable income method

        int tax = calcTax(status, taxable);
        System.out.printf("Federal tax: $%,d\n", tax);// call on tax method

        int owe = calcTaxDue(tax, withheld);
        System.out.printf("Tax due: $%,d\n", owe);//call on tax due method
    }
}