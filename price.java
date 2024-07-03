import java.util.Scanner;
public class TotalPrice {
    public static void main(String[] args) throws Exception {
Scanner scan= new Scanner(System.in);
System.out.print("Enter the total amount of items:");
int item=scan.nextInt();
double totalPrice=0;
while (item>0)
{
    System.out.print("Price:");
    int price1=scan.nextInt();
    totalPrice+=price1;
    item--;
}
System.out.print(totalPrice);



    }
}


import java.util.Scanner;
public class CountDown{
public static void main(String[] args) throws Exception {
Scanner scan= new Scanner(System.in);
System.out.print("Enter a Number:");
int num1= scan.nextInt();
while (num1>=0)
    {
        System.out.println(num1);
        num1-=1; 
    }
System.out.print("Enter a lowerlimit:");
int num2=scan.nextInt();
System.out.print("Enter a upperlimit:");
int num3=scan.nextInt();
while(num2<=num3)
{
    System.out.println(num2);
     num2 +=2;
}
}
}