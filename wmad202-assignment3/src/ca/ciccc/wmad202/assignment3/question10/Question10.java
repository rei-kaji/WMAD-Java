package ca.ciccc.wmad202.assignment3.question10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Question10 {

    public static boolean checkSingleFactorEquality(String firstSinglePolynomialFactors, String secondSinglePolynomialFactors){
        boolean check = firstSinglePolynomialFactors.matches(".*" + secondSinglePolynomialFactors + ".*");
        return check;
    }

    public static boolean checkPolynomialEquationsEquality(String firstSinglePolynomialFactors, String secondSinglePolynomialFactors){
        boolean check = firstSinglePolynomialFactors.matches(secondSinglePolynomialFactors);
        return check;
    }

    public static int getBiggestExponent(String polynomialEquation){
        ArrayList<Integer> positionList = new ArrayList<>();

        int positionNumber = polynomialEquation.indexOf("^");

        while(positionNumber!=-1){
            int exponent = polynomialEquation.charAt(positionNumber+1);
            System.out.println("positionNumber " + (positionNumber+1));
            System.out.println("Exponent: " + exponent);
            positionList.add(exponent);
            positionNumber = polynomialEquation.indexOf("^",positionNumber+1);
        }
        System.out.println(positionList);
        return Collections.max(positionList);
    }

    public static String combinePolynomialEquations(String firstSinglePolynomialFactors, String secondSinglePolynomialFactors){
        ArrayList<String> zeroExponent = new ArrayList<>();
        ArrayList<String> oneExponent = new ArrayList<>();
        ArrayList<String> twoExponent = new ArrayList<>();
        ArrayList<String> threeExponent = new ArrayList<>();
        ArrayList<String> fourExponent = new ArrayList<>();
        ArrayList<String> fiveExponent = new ArrayList<>();
        ArrayList<String> sixExponent = new ArrayList<>();
        ArrayList<String> sevenExponent = new ArrayList<>();
        ArrayList<String> eightExponent = new ArrayList<>();
        ArrayList<String> nineExponent = new ArrayList<>();
        ArrayList<String> tenExponent = new ArrayList<>();

        // Assign each value by how many exponent they have.
        while(firstSinglePolynomialFactors.contains("x")){
            int positionNumber = firstSinglePolynomialFactors.indexOf("^");

            while(positionNumber!=-1){
                int exponent = firstSinglePolynomialFactors.charAt(positionNumber + 1);
                System.out.println("positionNumber " + (positionNumber+1));
                System.out.println("Exponent: " + exponent);
                String factNumber = String.valueOf(firstSinglePolynomialFactors.charAt(positionNumber - 2));
                String operator = String.valueOf(firstSinglePolynomialFactors.charAt(positionNumber - 3));
                String deleteString;
                if(operator.matches(".*('+'|'-').*")){
                    factNumber = operator + factNumber;
                    deleteString = firstSinglePolynomialFactors.substring(positionNumber - 3, positionNumber + 1);
                    firstSinglePolynomialFactors = firstSinglePolynomialFactors.replace(deleteString,"");
                }else{
                    deleteString = firstSinglePolynomialFactors.substring(positionNumber - 2, positionNumber + 1);
                    firstSinglePolynomialFactors = firstSinglePolynomialFactors.replace(deleteString,"");
                }

                switch (exponent){
                    case 2:
                        twoExponent.add(factNumber);
                    case 3:
                        threeExponent.add(factNumber);
                    case 4:
                        fourExponent.add(factNumber);
                    case 5:
                        fiveExponent.add(factNumber);
                    case 6:
                        sixExponent.add(factNumber);
                    case 7:
                        sevenExponent.add(factNumber);
                    case 8:
                        eightExponent.add(factNumber);
                    case 9:
                        nineExponent.add(factNumber);
                    case 10:
                        tenExponent.add(factNumber);
                }
                positionNumber = firstSinglePolynomialFactors.indexOf("^");
            }
        }

        return "A";


    }

    public static void call(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question10");
        System.out.println("Please enter question number 1-3 to show result of question");
        int question = scanner.nextInt();

        switch (question){
            case 1:
                System.out.println("Question10: Q1");
                System.out.println("Please enter the firstSinglePolynomialFactors: ");
                String firstSinglePolynomialFactors = scanner.next();
                System.out.println("Please enter the secondSinglePolynomialFactors: ");
                String secondSinglePolynomialFactors = scanner.next();
                System.out.println(checkSingleFactorEquality(firstSinglePolynomialFactors,secondSinglePolynomialFactors));
            case 2:
                System.out.println("Question10: Q2");
                System.out.println("Please enter the thirdSinglePolynomialFactors: ");
                String thirdSinglePolynomialFactors = scanner.next();
                System.out.println("Please enter the fourthSinglePolynomialFactors: ");
                String fourthSinglePolynomialFactors = scanner.next();
                System.out.println(checkPolynomialEquationsEquality(thirdSinglePolynomialFactors,fourthSinglePolynomialFactors));
            case 3:
                System.out.println("Question10: Q3");
                System.out.println(getBiggestExponent("10*x^5 + 8*x^4 + x^2 + 6"));
            case 4:
                System.out.println("Question10: Q4");

        }



    }

}
