package ca.ciccc.wmad202.assignment2.question7;

import java.util.Scanner;

public class Question7 {
    //    Write a Java program which asks the user for a number
    //      which is the length of the side of a square.
    //    The program should find the area of a circle
    //      which is crossing from all corners of the square.
    public static void returnSideArea(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of a side of square: ");
        int number = scanner.nextInt();

        System.out.println("The length of the side of a square is " + number*4);
        System.out.println("THe area of a circle is " + number*number*Math.PI);
    }
}
