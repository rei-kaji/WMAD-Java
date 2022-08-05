package ca.ciccc.wmad202.project.TheTransformationCompany;

// Compare Courage
public class CourageCompare implements Compare {

    @Override
    public int compare(int a1, int a2) {
        int result = 0;
        if (a1 - a2 >= 4) {
            return 1;
        } else if (a2 - a1 >= 4) {
            return 2;
        }
        return result;
    }
}
