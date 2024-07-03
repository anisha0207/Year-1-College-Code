/* Anisha Dasgupta
   Date: 2/22/2024
   CSE7 Spring 2024
   IDE: VSCode; JDK: 11
   Read from the user for four types of pattern that it will output
*/

import java.util.Scanner;
public class Patterns{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean loopCount = true;
        while (loopCount){
            System.out.println("Enter a pattern choice followed by a string");
            char choice;
            String message = "";
            do {
                choice = s.next().charAt(0);
                if (choice >= 'A' && choice <= 'D'){
                    //pattern valid, read in string
                    do {
                        message = s.next();
                        if (message.length() >= 4){
                            break;
                        }else {
                            //string not long enough
                            System.out.println("String message not long enough");
                        }
                    }while(true);//do-while to validate string length
                    break;
                }else if (choice == 'X'){
                    //exit 
                    System.out.println("Goodbye");
                    loopCount = false;
                    break;
                }else {
                    //user typed invalid
                    System.out.println("invalid pattern choice");
                }
            }while(true);
            
            switch(choice){
                case 'A'://pattern A
                    for (int numRows = 0; numRows < message.length(); numRows++){
                        for (int numCol = 0; numCol <= numRows; numCol++){
                            System.out.print(message.charAt(message.length()-1-numCol)+" ");
                        }
                        System.out.println();
                    }
                    
                    break;
                case 'B': //pattern B
                    for (int numRows = 0; numRows < message.length(); numRows++){
                        for (int numCol = 0; numCol < message.length()-numRows; numCol++){
                            System.out.print(message.charAt(numCol)+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 'C': //pattern C
                   int space = message.length() * 2;
                   for (int numRows = 0; numRows < message.length(); numRows++) {
                        for (int i = 0; i < space; i++) {
                        System.out.print(" "); // print spaces before the character
                        }

                        
                        for (int numCol = numRows; numCol >= 0; numCol--) {
                            System.out.print(message.charAt(numCol)+ " ");
                        }

                        System.out.println();
                        space -= 2;
                    } 
                    break;
                case 'D': //pattern D
                    for (int numRows = 0; numRows < message.length(); numRows++){
                        for (int numCol = message.length()-1-numRows; numCol >= 0; numCol--){
                            System.out.print(message.charAt(numCol)+" ");
                        }
                        System.out.println();
                    }
                    break;            
                }
        }
        

        
    }
}
    