package ca.ciccc.wmad202.assignment2.question10;

import java.util.Random;
import java.util.Scanner;

public class Question10 {
    //Consider two following mathematical functions:
    //  • F1(x) = 2^x
    //  • F2(x) = x^5
    //  • ^ means exponent. Example: 2^3 = 2*2*2 = 8
    //The program should find a positive number (and greater than 3) (let’s call it T)
    // which has the following characteristic:
    //  • For all numbers (x) which are less than T, we have F1(x)< F2(x)
    //  • For x greater than or equal T (x>=T) we have F1(x)> F2(x)
    public void seekXValue(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();
        Random random = new Random();
        int T = random.nextInt(Integer.MAX_VALUE - 3) + 3;
        boolean check = false ;
        if(number < T) {
            check = fx1(number) < fx2(number);
            System.out.println("(x) bigger than T and F1(x)< F2(x) is : " + check);
        }else {
            check = fx1(number) > fx2(number);
            System.out.println("(x) smaller than T and F1(x) > F2(x) is : " + check);
        }
    }
    private double fx1(int number){
        return Math.pow(2,number);
    }
    private double fx2(int number){
        return Math.pow(number,5);
    }
}
