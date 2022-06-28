package ca.ciccc.wmad202.assignment5.question3;

public class ConvertSinglePolynomialFactorToArray {
//    Integer[] singlePolynomialFactor;

    final int DEFAULT_COEFFICIENT = 0;
    final int DEFAULT_EXPONENT = 0;

    Integer coefficient;
    Integer exponent;

    Integer[] singlePolynomialFactorComponents = {DEFAULT_COEFFICIENT, DEFAULT_EXPONENT};

    public ConvertSinglePolynomialFactorToArray(String singlePolynomialFactor) {
        int indexOfExponet = singlePolynomialFactor.indexOf('^');
        int indexOfMultification = singlePolynomialFactor.indexOf('*');

        String coeficientString = singlePolynomialFactor.substring(0, indexOfMultification);
        String exponetString = singlePolynomialFactor.substring(indexOfExponet + 1, singlePolynomialFactor.length());

        this.coefficient = Integer.valueOf(coeficientString);
        this.exponent = Integer.valueOf(exponetString);
    }

    public Integer[] convertToArray() {
        this.singlePolynomialFactorComponents[0] = this.coefficient;
        this.singlePolynomialFactorComponents[1] = this.exponent;

        return singlePolynomialFactorComponents;
    }
}
