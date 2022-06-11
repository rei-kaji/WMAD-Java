package ca.ciccc.wmad202.assignment2.question9;

import java.util.Locale;
import java.util.Scanner;

public class Question9 {
    //Write a Java program which keeps asking the user to enter a name.
    //The program checks the entered name.
    // If the entered name contains any digit, then the program terminates.
    // If the entered name has no digits and only contains alphabets,
    // then converts the name to uppercase and prints it and asks for the next name from the user and repeats.
    public static void askingUserName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = scanner.next();

        for(; userName != null && !userName.matches(".*[0-9].*");){
            System.out.println(userName.toUpperCase());
            System.out.println("Please enter your name again: ");
            userName = scanner.next();
        }

        System.out.println("You entered number... Good bye.");
    }
}
