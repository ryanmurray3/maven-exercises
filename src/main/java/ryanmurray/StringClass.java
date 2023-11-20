package ryanmurray;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringClass {
    //prompt the user for input and does the following (using the StringUtils class)
    //Tells whether or not what the user entered is a number
    //Flips the case of the string
    //Reverses the string


    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String userInput = scanner.nextLine();
        if (StringUtils.isNumeric(userInput)){
            System.out.println("Wrong! Try again");
            System.exit(0);
        } else {
            System.out.println("You entered: " + (userInput));
            System.out.println(StringUtils.reverse(userInput) + "  :esrever nI");
            System.out.println("In Upper Case: " + StringUtils.swapCase(userInput) + "!");
        }
        
    }
   
    
    
    
    
    
    

}
