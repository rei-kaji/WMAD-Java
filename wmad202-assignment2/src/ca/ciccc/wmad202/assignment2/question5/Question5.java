package ca.ciccc.wmad202.assignment2.question5;

import java.util.Scanner;

public class Question5 {
    // Write a Java program which receives a string from input and does the following:
    //  • Reverse the string and print it.
    //  • Check whether the input string and its reverse is the same (like BaBa).
    //      It considers case sensitivity which means (Baba and BaBa are not the same).
    public static void reverseCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word: ");
        String input = scanner.next();
        String reverseInput = "";

        for(int i = input.length(); i > 0; i--){
            reverseInput = reverseInput + input.charAt(i - 1);
        }

        if(input.equals(reverseInput) ){
            System.out.println(input + " == " + reverseInput);
            System.out.println("Input and its reverse is the same.");
        }else {
            System.out.println(input + " != " + reverseInput);
            System.out.println("Input and its reverse is not the same.");
        }
    }
}
