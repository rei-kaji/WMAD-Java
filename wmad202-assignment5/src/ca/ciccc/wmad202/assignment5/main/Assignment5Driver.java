package ca.ciccc.wmad202.assignment5.main;
import ca.ciccc.wmad202.assignment5.question1.testClass;
import ca.ciccc.wmad202.assignment5.question2.Question2;
import ca.ciccc.wmad202.assignment5.question3.Question3;

import java.util.Scanner;

public class Assignment5Driver {
    public static void run(){
        System.out.println("Assignment5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter question number 1-3 to show result of question");
        int question = scanner.nextInt();

        switch (question) {
            case 1:
                testClass testclass = new testClass();
                testclass.test();
            case 2:
                Question2 question2 = new Question2();
                question2.run();
            case 3:
                Question3 question3 = new Question3();
                question3.run();
        }




    }
}
