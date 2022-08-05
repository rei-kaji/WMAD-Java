package ca.ciccc.wmad202.project.TheCastleCompany;

import java.util.ArrayList;

public class RemoveContinuous {
    public static int[] removeContinuous(int[] sequence) {
        ArrayList<Integer> removedList = new ArrayList<>();

        removedList.add(sequence[0]);
        for (int j = 1; j < sequence.length; j++) {
            // Don't add the continuous
            if (sequence[j] == sequence[j - 1]) {
                continue;
            } else {
                removedList.add(sequence[j]);
            }
        }

        // Change from ArrayList<Integer] to int[]
        int[] removedContinuous = new int[removedList.size()];
        for (int i = 0; i < removedList.size();i++) {
            removedContinuous[i] = removedList.get(i);
        }

        return removedContinuous;
    }
}
