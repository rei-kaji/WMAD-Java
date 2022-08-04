package ca.ciccc.wmad202.project.problem1.theCastleCompany;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Additional Assumption
// 1:The number of top and end in the sequence can't be peak and valley.
// 2:According to assumption, under two count of sequence's castle become 0.
// 3:Both peak and valley continuous number are counted one.
public class MyCompany {
    // ファイルから配列を取得して、Sequenceに投げる処理をかく
    public static void main(String[] args) {
        HashMap<String[], Integer> result = new HashMap<>();
        int i = 0;
        try {
            Scanner in = new Scanner(new File("./wmad202-project-problem1/src/ca/ciccc/wmad202/project/problem1/TextFolder/castles.txt"));
            while (in.hasNext()) {
                String input = in.next();
                String body = input.replace("[", "").replace("]", "");
                String[] number = body.split(",");
                int[] cast = new int[number.length];

                for (int t = 0; t < number.length; t++) {
                    cast[t] = Integer.parseInt(number[t]);
                }

                Sequence sequence = new Sequence(cast);
                int castleNumber = sequence.getNumberOfCastle();

                result.put(number, castleNumber);
            }
            in.close();

            for (Map.Entry<String[], Integer> showResult : result.entrySet()) {
                System.out.println(Arrays.toString(showResult.getKey()) + " has " + showResult.getValue() + " castles.");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }


}
