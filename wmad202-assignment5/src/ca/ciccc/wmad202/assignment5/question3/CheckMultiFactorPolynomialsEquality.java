package ca.ciccc.wmad202.assignment5.question3;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckMultiFactorPolynomialsEquality {
    private String multiFactorPolynomialFactor1;
    private String multiFactorPolynomialFactor2;

    public CheckMultiFactorPolynomialsEquality(String multiFactorPolynomialFactor1, String multiFactorPolynomialFactor2) {
        this.multiFactorPolynomialFactor1 = multiFactorPolynomialFactor1;
        this.multiFactorPolynomialFactor2 = multiFactorPolynomialFactor2;
    }

    public boolean checkEquality() {
        ConvertPolynomialFactorToArray convertPolynomialFactorToArray1 = new ConvertPolynomialFactorToArray(this.multiFactorPolynomialFactor1);
        ArrayList<Integer[]> polynomialFactorArray1 = convertPolynomialFactorToArray1.convertToArray();
        ConvertPolynomialFactorToArray convertPolynomialFactorToArray2 = new ConvertPolynomialFactorToArray(this.multiFactorPolynomialFactor2);
        ArrayList<Integer[]> polynomialFactorArray2 = convertPolynomialFactorToArray2.convertToArray();

        if (polynomialFactorArray1.size() != polynomialFactorArray2.size()) {
            return false;
        } else {
            for (int i = 0; i < polynomialFactorArray1.size(); i++) {
                Integer[] singleFactor1 = polynomialFactorArray1.get(i);
                Integer[] singleFactor2 = polynomialFactorArray2.get(i);
                System.out.println(Arrays.toString(singleFactor2));
                if (singleFactor1[0] != singleFactor2[0] || singleFactor1[1] != singleFactor2[1]) {
                    return false;
                }
            }
        }
        return true;
    }


}
