package ca.ciccc.wmad202.assignment8.question4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] A, int K){
//        System.out.println("K = " + K);
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < K; i++) {
            if (i == 0) {
                for (int j = 0; j < A.length; j++) {
                    B.add(A[j]);
                }
                B.add(0,B.get(B.size() - 1));
                B.remove(B.size() - 1);
            }else{
                B.add(0,B.get(B.size() - 1));
                B.remove(B.size() - 1);
            }
//            System.out.println("B.get(0) = " + B.get(0));
//            System.out.println("i = " + i);

        }
        int[] C = new int[B.size()];

        for (int i = 0; i < B.size(); i++) {
            C[i] = B.get(i);
        }

//        System.out.println("C = " + Arrays.toString(C));

        return C;
    }
}
