package ca.ciccc.wmad202.assignment3.question1;

import java.util.Scanner;

public class Question1 {
//Problem1
//Design and implement a function which receives a positive integer
// as its input parameter and checks whether the number is a prime number or not.
// If it is a prime number, the method returns true and if not the method will return false.
//Prime number: https://simple.wikipedia.org/wiki/Prime_number
    public static boolean checkPrimeNumber(int number1){
        boolean check = number1 >= 2;

        for(int i = 2; i < number1; i++){
            if (number1 % i == 0) {
                check = false;
                break;
            }
        }

        return check;
    }

    public static void callCheckPrimeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int checkNumber = scanner.nextInt();

        if(checkPrimeNumber(checkNumber)){
            System.out.println("This number is Prime Number.");
        }else{
            System.out.println("This number is not Prime Number.");
        }
    }

}
