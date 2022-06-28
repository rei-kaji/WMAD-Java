package ca.ciccc.wmad202.assignment5.question3;

public class CheckSingleFactorEquality {
    private String SingleFactorEquality1;
    private String SingleFactorEquality2;

    public CheckSingleFactorEquality(String SingleFactorEquality1, String SingleFactorEquality2) {
        this.SingleFactorEquality1 = SingleFactorEquality1;
        this.SingleFactorEquality2 = SingleFactorEquality2;
    }

    public boolean checkSingleFactorEquality() {
        ConvertSinglePolynomialFactorToArray convertSinglePolynomialFactorToArray1 = new ConvertSinglePolynomialFactorToArray(this.SingleFactorEquality1);
        Integer[] singleFactor1Array = convertSinglePolynomialFactorToArray1.convertToArray();
        ConvertSinglePolynomialFactorToArray convertSinglePolynomialFactorToArray2 = new ConvertSinglePolynomialFactorToArray(this.SingleFactorEquality2);
        Integer[] singleFactor2Array = convertSinglePolynomialFactorToArray2.convertToArray();

        if ((singleFactor1Array[0].equals(singleFactor2Array[0])) && singleFactor1Array[1].equals(singleFactor2Array[1])) {
            return true;
        }
        return false;
    }

}
