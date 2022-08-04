package ca.ciccc.wmad202.project.problem1.theCastleCompany;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveContinuous {
    public static int[] removeContinuous(int[] sequence) {
        ArrayList<Integer> removedList = new ArrayList<>();

        // 離れた場所で連続している数字があった場合に正しい結果にならないため修正する
        for (int i : sequence) {
            if (!removedList.contains(i)) {
                removedList.add(i);
            }
        }

        int[] removedContinuous = new int[removedList.size()];

        for (int i = 0; i < removedList.size();i++) {
            removedContinuous[i] = removedList.get(i);
        }

        return removedContinuous;
    }
}
