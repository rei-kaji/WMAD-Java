package ca.ciccc.wmad202.assignment5.question3;

import java.util.Scanner;

public class Question3 {
    private String SingleFactorEquality1 = "5*x^4";
    private String SingleFactorEquality2 = "-3*x^2";
    private String SingleFactorEquality3 = "10*x^5";
    private String SingleFactorEquality4 = "9";

    private String PolynomialEquation1 = "5*x^4-3*x^2+6";
    private String PolynomialEquation2 = "10*x^5+8*x^4+x^2+5";
    private String PolynomialEquation3 = "4*x^3+5";
    private String PolynomialEquation4 = "10";
    private String PolynomialEquation5 = "5*x^4-3*x^2+7";

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
        boolean result3_1 = checkSingleFactorEquality.checkSingleFactorEquality();
        System.out.println("CheckSingleFactorEquality result between " + SingleFactorEquality1 + " and " + SingleFactorEquality2 + " => " + result3_1);
    }

    public void question3_2() {
        CheckMultiFactorPolynomialsEquality checkMultiFactorPolynomialsEquality = new CheckMultiFactorPolynomialsEquality(PolynomialEquation1, PolynomialEquation5);
        boolean result3_2 = checkMultiFactorPolynomialsEquality.checkEquality();
        System.out.println("checkMultiFactorPolynomialsEquality result between " + PolynomialEquation1 + " and " + PolynomialEquation5 + " => " + result3_2);
    }

    public void question3_3() {
        GetBiggestExponent biggestExponent = new GetBiggestExponent(PolynomialEquation1);
        biggestExponent.getBiggestExponet();
    }

    public void question3_4() {
        Calculator calculator = new Calculator(PolynomialEquation1, PolynomialEquation5);
        calculator.addResult();
    }
}
