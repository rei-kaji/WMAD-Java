package ca.ciccc.wmad202.assignment7.question3;

public class Problem {
    public <T> void exchangeElements(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}