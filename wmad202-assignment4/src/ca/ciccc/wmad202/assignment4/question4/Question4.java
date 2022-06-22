package ca.ciccc.wmad202.assignment4.question4;

import java.util.*;

public class Question4 {
    //Write a method which receives a list and returns a number.
    //In the list, all numbers have been repeated twice except one number that is repeated once.
    //The method should return the number that is repeated once and return it.
    public static Set<Integer> returnRepeatedOnce(int[] numList){
        System.out.println("Question4");
        HashSet<Integer> checknum = new HashSet<>();

        for (int j : numList) {
            if (checknum.contains(j)) {
                checknum.remove(j);
            } else {
                checknum.add(j);
            }
        }
        return checknum;
    }

    public static void call(){
        int[] numList = {1,1,2,2,3,4,4,5,5,6,6,7,7,8,8,9,9,10};
        System.out.println("List has these number: " + Arrays.toString(numList));
        System.out.println("Repeated number are " + returnRepeatedOnce(numList));
    }
}
