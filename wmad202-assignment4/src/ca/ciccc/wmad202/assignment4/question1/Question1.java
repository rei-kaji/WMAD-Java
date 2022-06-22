package ca.ciccc.wmad202.assignment4.question1;

import java.util.HashSet;
import java.util.Scanner;

public class Question1 {
    //    Write a method which has no input parameter. The method asks the user to enter numbers.
    //The user can enter repeated numbers but if the user entered a number which was already entered,
    // the method will provide an error message to the user and ask the user to enter another one.
    //The user can enter numbers as long as s/he has not entered 0.
    //Once a 0 is entered, the method returns the sum of all distinct numbers the user had entered.
    public static void sumUpEntered(){
        System.out.println("Question1");
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numSum = new HashSet<>();
        System.out.println("Please enter the number: ");
        int checkNumber = scanner.nextInt();
        numSum.add(checkNumber);

        while(checkNumber!=0){
            System.out.println("Please enter the number again: ");
            checkNumber = scanner.nextInt();
            if(numSum.contains(checkNumber)){
                continue;
            }else {
                numSum.add(checkNumber);
            }
        }

        System.out.println("The total of you entered number is " + numSum.hashCode());

    }
}
