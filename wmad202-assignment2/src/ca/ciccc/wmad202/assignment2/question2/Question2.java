package ca.ciccc.wmad202.assignment2.question2;

import java.util.Scanner;

public class Question2 {
    //Using Java, write a program which reads a number from the input (like 123).
    //You make the assumption that the user does not enter a decimal number (like 123.4).
    //The number entered by the user should not be divisible by 10 and if the user enters a number that is divisible by 10 (like 560), it is considered invalid and the application should keep asking until the user enters a valid input.
    //Once the user enters a valid input, the program calculates the reverse of the number (for 153, the reverse is 351) and prints the result.

    public static void reverseNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        String len = Integer.valueOf(number).toString();
        String reverseNum = "";

        if(number % 10 == 0){
            for(int i = len.length(); i > 0; i--){
                reverseNum = reverseNum + len.charAt(i-1);
            }
        }else{
            System.out.println("This is invalid number! Goodbye!");
        }

        System.out.println(reverseNum);
    }
}
