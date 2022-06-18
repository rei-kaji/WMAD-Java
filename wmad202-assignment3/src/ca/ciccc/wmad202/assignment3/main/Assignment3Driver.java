package ca.ciccc.wmad202.assignment3.main;

import ca.ciccc.wmad202.assignment3.question1.Question1;
import ca.ciccc.wmad202.assignment3.question10.Question10;
import ca.ciccc.wmad202.assignment3.question2.Question2;
import ca.ciccc.wmad202.assignment3.question3.Question3;
import ca.ciccc.wmad202.assignment3.question4.Question4;
import ca.ciccc.wmad202.assignment3.question5.Question5;
import ca.ciccc.wmad202.assignment3.question6.Question6;
import ca.ciccc.wmad202.assignment3.question7.Question7;
import ca.ciccc.wmad202.assignment3.question8.Question8;
import ca.ciccc.wmad202.assignment3.question9.Question9;

import java.util.Scanner;

public class Assignment3Driver {
    public static void run(){
        System.out.println("Assignment3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter question number 1-10 to show result of question");
        int question = scanner.nextInt();

        switch (question){
            case 1:
                Question1 q1 = new Question1();
                q1.callCheckPrimeNumber();
                break;
            case 2:
                Question2 q2 = new Question2();
                q2.seekPrimeNumber();
                break;
            case 3:
                Question3 q3 = new Question3();
                q3.printPattern();
                break;
            case 4:
                Question4 q4 = new Question4();
                q4.getMostRepeatedNumber();
                break;
            case 5:
                Question5 q5 = new Question5();
                q5.countRepeated();
                break;
            case 6:
                Question6 q6 = new Question6();
                q6.deleteRepeatNumber();
                break;
            case 7:
                Question7 q7 = new Question7();
                q7.searchNumber();
                break;
            case 8:
                Question8 q8 = new Question8();
                q8.getDivisibleNumber();
                break;
            case 9:
                Question9 q9 = new Question9();
                q9.callPrimeVisibly();
                break;
            case 10:
                Question10 q10 = new Question10();
                q10.call();
                break;
        }
    }
}
