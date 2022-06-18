package ca.ciccc.wmad202.assignment3.question6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Question6 {
//Problem6
//Write a method which receives a list of integers
// which may contain repeated numbers. The method removes the repeated numbers and keeps the distinct numbers.
// The function should return the list of distinct numbers.
    public static void deleteRepeatNumber(){
        System.out.println("Question6");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("Please enter the number for making ArrayList: ");
        int number1 = scanner.nextInt();
        numberList.add(number1);

        while(number1 != 0){
            System.out.println("Please enter the number again (0 : stop): ");
            number1 = scanner.nextInt();
            if(number1 != 0){
                numberList.add(number1);
            }
        }

        ArrayList<Integer> hashed = new ArrayList<>(new HashSet<>(numberList));

        System.out.println(hashed);
    }
}
