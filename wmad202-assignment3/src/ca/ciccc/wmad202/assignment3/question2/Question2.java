package ca.ciccc.wmad202.assignment3.question2;

import ca.ciccc.wmad202.assignment3.question1.Question1;

import java.util.Scanner;

public class Question2 {
//Problem2
//  Design and implement a function with one parameter
//  which is a positive integer and finds the next prime number
//  which is bigger than the given input parameter and returns it.
//  Reuse (call) the method you have defined for Problem 1 (above).

    public static void seekPrimeNumber(){
        System.out.println("Question2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number1 = scanner.nextInt();
        int primeNumber;

        for(int i = number1; ; i++){
            if(Question1.checkPrimeNumber(i)){
                primeNumber = i;
                break;
            }
        }

        System.out.println("This number is Prime Number : " + primeNumber);
    }
}
