package ca.ciccc.wmad202.assignment8.question4;

import java.util.Arrays;

public class ApplicationDriver {
    public static void main(String args[]){
        int[] arrayA = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 6;
        System.out.println(Arrays.toString(Solution.solution(arrayA, k)));
    }
}
