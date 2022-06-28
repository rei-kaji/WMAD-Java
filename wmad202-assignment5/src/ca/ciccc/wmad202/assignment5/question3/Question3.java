package ca.ciccc.wmad202.assignment5.question3;

import java.util.Scanner;

public class Question3 {
    private String SingleFactorEquality1 = "5*x^4";
    private String SingleFactorEquality2 = "-3*x^2";
    private String SingleFactorEquality3 = "10*x^5";
    private String SingleFactorEquality4 = "9";

    public void run() {
        System.out.println("Question3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter question number 1-4 to show result of question");
        int question = scanner.nextInt();

        switch (question) {
            case 1:
                question3_1();
            case 2:
                question3_2();
            case 3:
                question3_3();
            case 4:
                question3_4();
        }
    }

    public void question3_1() {
        CheckSingleFactorEquality checkSingleFactorEquality = new CheckSingleFactorEquality(SingleFactorEquality1,SingleFactorEquality2);
        boolean result = checkSingleFactorEquality.checkSingleFactorEquality();
        System.out.println("CheckSingleFactorEquality result between " + SingleFactorEquality1 + " and " + SingleFactorEquality2 + " => " + result);
    }

    public void question3_2() {

    }

    public void question3_3() {

    }

    public void question3_4() {

    }
}
