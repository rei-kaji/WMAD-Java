package ca.ciccc.wmad202.assignment5.question3;

import java.util.*;

public class Calculator {
    private String PolynomialFactor1;
    private String PolynomialFactor2;

    public Calculator(String PolynomialFactor1,String PolynomialFactor2) {
        this.PolynomialFactor1 = PolynomialFactor1;
        this.PolynomialFactor2 = PolynomialFactor2;
    }

    public void addResult() {
        StringBuilder result = new StringBuilder();
        ArrayList<String> sumResult = new ArrayList<>();
        ConvertPolynomialFactorToArray convertPolynomialFactorToArray1 = new ConvertPolynomialFactorToArray(this.PolynomialFactor1);
        ArrayList<Integer[]> polynomialFactorArray1 = convertPolynomialFactorToArray1.convertToArray();
        ConvertPolynomialFactorToArray convertPolynomialFactorToArray2 = new ConvertPolynomialFactorToArray(this.PolynomialFactor2);
        ArrayList<Integer[]> polynomialFactorArray2 = convertPolynomialFactorToArray2.convertToArray();

        Map<Integer,Integer> polynomialFactor1 = new HashMap<>();
        Map<Integer,Integer> polynomialFactor2 = new HashMap<>();

        for (int i = 0; i < polynomialFactorArray1.size(); i++) {
            polynomialFactor1.put(polynomialFactorArray1.get(i)[1], polynomialFactorArray1.get(i)[0]);
        }

        for (int i = 0; i < polynomialFactorArray2.size(); i++) {
            polynomialFactor2.put(polynomialFactorArray2.get(i)[1], polynomialFactorArray2.get(i)[0]);
        }


        System.out.println("polynomialFactor1"+polynomialFactor1);
        System.out.println("polynomialFactor2"+polynomialFactor2);

        for (int i = 0; i <= 10; i++) {
            if (polynomialFactor1.containsKey(i) && polynomialFactor2.containsKey(i)) {
                int sum = polynomialFactor1.get(i) + polynomialFactor2.get(i);
                if (i != 0) {
                    sumResult.add(sum + "*" + "x" + "^" + i);
                } else {
                    sumResult.add(String.valueOf(sum));
                }
            } else if (polynomialFactor1.containsKey(i) && !polynomialFactor2.containsKey(i)) {
                int sum = polynomialFactor1.get(i);
                if (i != 0) {
                    sumResult.add(sum + "*" + "x" + "^" + i);
                } else {
                    sumResult.add(String.valueOf(sum));
                }
            }else if (!polynomialFactor1.containsKey(i) && polynomialFactor2.containsKey(i)) {
                int sum = polynomialFactor2.get(i);
                if (i != 0) {
                    sumResult.add(sum + "*" + "x" + "^" + i);
                } else {
                    sumResult.add(String.valueOf(sum));
                }
            }
        }
        for (int i = 0; i < sumResult.size(); i++) {
            if (i != sumResult.size()-1) {
                result.append(sumResult.get(i)).append("+");
            } else {
                result.append(sumResult.get(i));
            }
        }

        System.out.println(result);
    }
}
