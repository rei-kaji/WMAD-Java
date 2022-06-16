package ca.ciccc.wmad202.assignment3.question3;

import java.util.Scanner;

public class Question3 {
//Problem3
//Design and implement a method which receives a positive integer
// as its first input parameter and a format
// (which is either SHAPE1 or SHAPE2 or SHAPE3)
// as the second input parameter and prints the following patterns.
    public static void printPattern(){
        System.out.println("Question3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please enter the word(SHAPE1/SHAPE2/SHAPE3): ");
        String shape = scanner.next();

        String a = "*";

        switch (shape){
            case "SHAPE1":
                for (int i = 0; i<number1; i++ ) {
                    for (int j = 0; j < i; j++){
                        System.out.print(' ');
                    }
                    for(int f = 0; f < (number1-i)*2-5; f++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case "SHAPE2":
                while(number1 >= 0) {
                    for(int i = 1; i <= number1; i++) {
                        System.out.print("*");
                    }
                    number1 = number1 - 1;
                    System.out.print("\n");
                }
                break;
            case "SHAPE3":
                int n = 1;
                while(n <= number1) {
                    for(int i = 1; i <= n; i++) {
                        System.out.print("*");
                    }
                    n = n + 1;
                    System.out.print("\n");
                }
                break;
        }

    }
}
