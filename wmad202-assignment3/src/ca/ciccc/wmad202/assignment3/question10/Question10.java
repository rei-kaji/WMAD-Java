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

        String polynomialFactors = firstSinglePolynomialFactors + "+" + secondSinglePolynomialFactors;

        // delete space
        polynomialFactors = polynomialFactors.replaceAll(" ","");

        System.out.println("polynomialFactors: " + polynomialFactors);

        // Assign each value by how many exponent they have.
        while(polynomialFactors.contains("x")){
            int positionNumber = polynomialFactors.indexOf("^");

            System.out.println("positionNumber: " + positionNumber);

            while(positionNumber!=-1){
                int exponent = Integer.parseInt(polynomialFactors.substring(positionNumber +1,positionNumber +2));
                System.out.println("Exponent: " + exponent);
                String factNumber = String.valueOf(polynomialFactors.charAt(positionNumber - 3));
                String operator = String.valueOf(polynomialFactors.charAt(0));
                System.out.println("factNumber: " + factNumber);
                System.out.println("operator: " + operator);
                String deleteString;
                if(!operator.equals(factNumber)){
                    factNumber = operator + factNumber;
                    deleteString = polynomialFactors.substring(positionNumber - 4, positionNumber + 2);
                }else{
                    deleteString = polynomialFactors.substring(positionNumber - 3, positionNumber + 2);
                }
                System.out.println("deleteString: " + deleteString);
                polynomialFactors = polynomialFactors.replace(deleteString,"");
                System.out.println("polynomialFactors: " + polynomialFactors);

                switch (exponent){
                    case 2:
                        System.out.println("Add twoExponent: " + factNumber);
                        twoExponent.add(factNumber);
                        break;
                    case 3:
                        System.out.println("Add threeExponent: " + factNumber);
                        threeExponent.add(factNumber);
                        break;
                    case 4:
                        System.out.println("Add fourExponent: " + factNumber);
                        fourExponent.add(factNumber);
                        break;
                    case 5:
                        System.out.println("Add fiveExponent: " + factNumber);
                        fiveExponent.add(factNumber);
                        break;
                    case 6:
                        System.out.println("Add sixExponent: " + factNumber);
                        sixExponent.add(factNumber);
                        break;
                    case 7:
                        System.out.println("Add sevenExponent: " + factNumber);
                        sevenExponent.add(factNumber);
                        break;
                    case 8:
                        System.out.println("Add eightExponent: " + factNumber);
                        eightExponent.add(factNumber);
                        break;
                    case 9:
                        System.out.println("Add nineExponent: " + factNumber);
                        nineExponent.add(factNumber);
                        break;
                    case 10:
                        System.out.println("Add tenExponent: " + factNumber);
                        tenExponent.add(factNumber);
                        break;
                }
                positionNumber = polynomialFactors.indexOf("^");
                System.out.println("Line 119 positionNumber: " + positionNumber);
            }
        }

        return polynomialFactors;


    }

    public static void call(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Question10");
        System.out.println("Please enter question number 1-4 to show result of question");
        int question = scanner.nextInt();

        String firstSinglePolynomialFactors = "5*x^4 – 3*x^2 + 6";
        String secondSinglePolynomialFactors = "1*x^5 + 8*x^4 + 2*x^2 + 5";

        System.out.println("firstSinglePolynomialFactors = " + firstSinglePolynomialFactors);
        System.out.println("secondSinglePolynomialFactors = " + secondSinglePolynomialFactors);

        switch (question){
            case 1:
                System.out.println("Question10: Q1");
                System.out.println(checkSingleFactorEquality(firstSinglePolynomialFactors,secondSinglePolynomialFactors));
                break;
            case 2:
                System.out.println("Question10: Q2");
                System.out.println(checkPolynomialEquationsEquality(firstSinglePolynomialFactors,secondSinglePolynomialFactors));
                break;
            case 3:
                System.out.println("Question10: Q3");
                System.out.println(getBiggestExponent("10*x^5 + 8*x^4 + x^2 + 6"));
                break;
            case 4:
                System.out.println("Question10: Q4");
                System.out.println(combinePolynomialEquations(firstSinglePolynomialFactors,secondSinglePolynomialFactors));
                break;

        }



    }

}
