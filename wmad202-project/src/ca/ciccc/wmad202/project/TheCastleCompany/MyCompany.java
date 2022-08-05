package ca.ciccc.wmad202.project.TheCastleCompany;

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
    public static void main(String[] args) {
        HashMap<String[], Integer> result = new HashMap<>();
        // Get value from text file
        try {
            Scanner in = new Scanner(new File("./wmad202-project/src/ca/ciccc/wmad202/project/TextFolder/castles.txt"));
            while (in.hasNext()) {
                String input = in.next();
                // Remove extraneous text and white space
                input = input.replace("[", "").replace("]", "");
                String[] number = input.split(",");
                int[] cast = new int[number.length];

                // Change from String[] to int[]
                for (int t = 0; t < number.length; t++) {
                    cast[t] = Integer.parseInt(number[t]);
                }

                // initialize sequence
                Sequence sequence = new Sequence(cast);
                int castleNumber = sequence.getNumberOfCastle();

                result.put(number, castleNumber);
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        // Display result
        for (Map.Entry<String[], Integer> showResult : result.entrySet()) {
            System.out.println(Arrays.toString(showResult.getKey()) + " has " + showResult.getValue() + " castles.");
        }
    }


}
