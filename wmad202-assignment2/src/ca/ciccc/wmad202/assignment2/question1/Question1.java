package ca.ciccc.wmad202.assignment2.question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    //    Read two numbers from input (like A and B) and
    //  • First prints all numbers between A and B (A and B not included), which are divisible to both 3 and 5.
    //  • Then prints all numbers between A and B (A included by B not included), which are divisible by either 6 or 7.
    //  • Finally prints all numbers between A and B (A and B both included), which are not divisible by 3.
    public static void printAtoB(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Please enter the number2: ");
        int number2 = scanner.nextInt();

        int i = 0;
        List<Integer> arrayNum1 = new ArrayList<Integer>();

        for (i = number1; i < number2; i++){
            if(i%3 == 0 && i%5 == 0){
                arrayNum1.add(i);
            }
        }
        System.out.println("These number are divisible to both 3 and 5.\n");
        System.out.println(arrayNum1 + "\n");

        i = 0;
        List<Integer> arrauNum2 = new ArrayList<Integer>();

        for (i = number1; i < number2; i++){
            if(i%6 == 0 || i%7 == 0){
                arrauNum2.add(i);
            }
        }
        System.out.println("These number are divisible by 6 or 7.\n");
        System.out.println(arrauNum2 + "\n");

        i = 0;
        List<Integer> arrauNum3 = new ArrayList<Integer>();

        for (i = number1; i < number2; i++){
            if(i%3 != 0){
                arrauNum3.add(i);
            }
        }
        System.out.println("These number are can't divisible by 3.\n");
        System.out.println(arrauNum3 + "\n");


    }

}

