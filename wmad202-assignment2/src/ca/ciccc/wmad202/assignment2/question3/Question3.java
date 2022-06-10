package ca.ciccc.wmad202.assignment2.question3;

import java.util.Scanner;

public class Question3 {
    //Read a number in base 10 (any positive, non-decimal number, like 452),
    // and convert it to binary and prints the results.
    // (Please research yourself on how to convert a number in base 10 to a binary number).
    public static void returnBinary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        System.out.println(Integer.toBinaryString(number));
    }
}
