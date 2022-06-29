package ca.ciccc.wmad202.assignment5.question3;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertPolynomialFactorToArray {
    private String polynomialFactor;

    public ConvertPolynomialFactorToArray(String polynomialFactor) {
        this.polynomialFactor = polynomialFactor;
    }

    public ArrayList<Integer[]> convertToArray() {
        ArrayList<Integer[]> multiFactorPolynomial = new ArrayList<>();

        System.out.println("this.polynomialFactor: "+ this.polynomialFactor);
        String singleFactor = "";
        for (int i = 0; i < polynomialFactor.length(); i++) {
//            System.out.println("polynomialFactor.charAt(i): " + polynomialFactor.charAt(i));
            if (polynomialFactor.charAt(i) == '-' || polynomialFactor.charAt(i) == '+') {
//                System.out.println("polynomialFactor.charAt(i) == '-' || polynomialFactor.charAt(i) == '+' = " + singleFactor);
                if (singleFactor.length() > 4) {
                    ConvertSinglePolynomialFactorToArray convertSinglePolynomialFactorToArray = new ConvertSinglePolynomialFactorToArray(singleFactor);
                    Integer[] singleFactorArray = convertSinglePolynomialFactorToArray.convertToArray();
                    multiFactorPolynomial.add(singleFactorArray);
                    singleFactor = "";
                }
            }else {
                singleFactor = singleFactor + polynomialFactor.charAt(i);
                if (i != polynomialFactor.length() - 2 && i != 0
                       &&!polynomialFactor.substring(i-1).contains("^")) {
                    ConvertSinglePolynomialFactorToArray convertSinglePolynomialFactorToArray = new ConvertSinglePolynomialFactorToArray(singleFactor);
                    Integer[] singleFactorArray = convertSinglePolynomialFactorToArray.convertToArray();
                    multiFactorPolynomial.add(singleFactorArray);
                    singleFactor = "";
                }
            }
        }

//        for (int i = 0; i < multiFactorPolynomial.size(); i++) {
//            System.out.println("multiFactorPolynomial: "+ i+  Arrays.toString(multiFactorPolynomial.get(i)));
//        }

        return multiFactorPolynomial;
    }


}
