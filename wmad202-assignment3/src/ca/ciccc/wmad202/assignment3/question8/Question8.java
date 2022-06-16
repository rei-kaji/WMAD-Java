package ca.ciccc.wmad202.assignment3.question8;

import java.util.ArrayList;
import java.util.Scanner;

public class Question8 {
//Problem8
//Design and implement a method which has one input parameter,
// called topLimit, which is a number between 40 and 100.
// Also, the method has a second input parameter which is also a positive integer, called number.
//The method should create and returns list which contains all numbers in range 2 (two) to topLimit
// that are divisible to number.

    public static void getDivisibleNumber(){
        System.out.println("Question7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the topLimit number: ");
        int topLimit = scanner.nextInt();

        System.out.println("Please enter the divisible number: ");
        int divisibleNumber = scanner.nextInt();

        ArrayList<Integer> divisibleNumberList = new ArrayList<>();

        for(int i = 2; i <= topLimit; i ++){
            if(i % divisibleNumber == 0){
                divisibleNumberList.add(i);
            }
        }

        System.out.println("This is divisible Numbers. " + divisibleNumberList);


    }
}
