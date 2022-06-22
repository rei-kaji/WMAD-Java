package ca.ciccc.wmad202.assignment4.main;

import ca.ciccc.wmad202.assignment4.question1.Question1;
import ca.ciccc.wmad202.assignment4.question2.Question2;
import ca.ciccc.wmad202.assignment4.question3.Question3;
import ca.ciccc.wmad202.assignment4.question4.Question4;
import ca.ciccc.wmad202.assignment4.question5.Question5;
import ca.ciccc.wmad202.assignment4.question6.Question6;

import java.util.Scanner;

public class Assignment4Driver {
    public static void run(){
        System.out.println("Assignment4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter question number 1-6 to show result of question");
        int question = scanner.nextInt();

        switch (question){
            case 1:
                Question1 q1 = new Question1();
                q1.sumUpEntered();
                break;
            case 2:
                Question2 q2 = new Question2();
                q2.gatheringWords();
                break;
            case 3:
                Question3 q3 = new Question3();
                q3.call();
                break;
            case 4:
                Question4 q4 = new Question4();
                q4.call();
                break;
            case 5:
                Question5 q5 = new Question5();
                q5.call();
                break;
            case 6:
                Question6 q6 = new Question6();
                q6.call();
                break;
        }
    }
}
