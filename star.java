import java.util.Scanner;
public class StarBox {
    public static void main(String[] args) throws Exception {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter Number:");
    int reps=scan.nextInt();
    for (int x=0;x<reps;x++)
        { for (int y=0;y<reps;y++)
         {
            System.out.print("*");
         }
          System.out.println(" ");}

  }
}

import java.util.Scanner;
public class Starloop {
    public static void main(String[] args) throws Exception {
Scanner scan=new Scanner(System.in);
System.out.print("Enter a number:");
int reps= scan.nextInt();
for (int x=1;x<=reps;x++)
{  System.out.println(" ");
    for (int y=1;y<=x;y++)
    {
        System.out.print("");
        }
}
System.out.println("");
for (int a=reps; a>0;a--)
{  System.out.println("");
    for (int z=a;z>0;z--)
    {
        System.out.print("");
    }
}


    }