package ca.ciccc.wmad202.assignment5.question3;

import java.util.ArrayList;

public class GetBiggestExponent {
    private String PolynomialFactor;

    public GetBiggestExponent(String PolynomialFactor) {
        this.PolynomialFactor = PolynomialFactor;
    }

    public void getBiggestExponet() {
        ConvertPolynomialFactorToArray convertPolynomialFactorToArray = new ConvertPolynomialFactorToArray(this.PolynomialFactor);
        ArrayList<Integer[]> polynomialFactorArray = convertPolynomialFactorToArray.convertToArray();
        int count = polynomialFactorArray.size();
        int biggestExponets = 0;
        for (int i = 0; i < polynomialFactorArray.size(); i++) {
            if (polynomialFactorArray.get(i)[1] > biggestExponets) {
                biggestExponets = polynomialFactorArray.get(i)[1];
            }
        }
        System.out.println("The biggest exponent is " + biggestExponets);
    }
}
