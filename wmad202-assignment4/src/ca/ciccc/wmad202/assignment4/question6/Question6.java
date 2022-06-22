package ca.ciccc.wmad202.assignment4.question6;

import java.util.*;

public class Question6 {
    //Write a Java method which receives 3 lists as its input parameters and combines the lists
    // and remove repeated numbers from the combined list and return the combined list.
    //For instance, if the input is [1,2,3,4,2,3,9] and [3,4,6,7] and [-1,0,23,4] the result is [1,2,3,4,6,7,-1,0,23,9]
    //
    //Note, the order the lists are combined together does not matter.
    public static HashSet<Integer> nonRepeatedList(List<int[]> lists) {
        HashSet<Integer> nonRepeated = new HashSet<>();

        for (int[] temp : lists) {
            for (int j : temp) {
                if (nonRepeated.contains(j)) {
                    continue;
                } else {
                    nonRepeated.add(j);
                }
            }
        }

        return nonRepeated;
    }

    public static void call() {
        List<int[]> lists = new ArrayList<>();
        int[] list1 = {1,2,3,4,2,3,9};
        int[] list2 = {3, 4, 6, 7};
        int[] list3 = {1, 2, 3, 4, 6, 7, -1, 0, 23};
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);

        for (int[] list : lists) {
            System.out.println("List is " + Arrays.toString(list));
        }

        System.out.println("The result is " + nonRepeatedList(lists));
    }
}
