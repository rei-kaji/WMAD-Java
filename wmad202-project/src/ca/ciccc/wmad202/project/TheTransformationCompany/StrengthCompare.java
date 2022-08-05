package ca.ciccc.wmad202.project.TheTransformationCompany;

// Compare Strength
public class StrengthCompare implements Compare{
    @Override
    public int compare(int a1, int a2) {
        int result = 0;
        if (a1 - a2 >= 3) {
            return 1;
        } else if (a2 - a1 >= 3) {
            return 2;
        }
        return result;
    }
}
