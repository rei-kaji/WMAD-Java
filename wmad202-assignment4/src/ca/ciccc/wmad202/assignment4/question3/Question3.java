package ca.ciccc.wmad202.assignment4.question3;

import java.util.*;

public class Question3 {
    //Design and implement a method which has one input parameter which is a number which is greater than 50, called num.
    //Then the method will create a dictionary whose keys are 2 and 3 and 4 and 5 and 6 and 7 and 8 and 9.
    //Then the method calculates the values for each of the above keys.
    //The value for a key is all the numbers between 2 and input “num” that are divisible by the key.
    //The method eventually will print the result.
    //Hint: Use a dictionary whose values are lists
    public static void dicDivisibleValue(int num){
        System.out.println("Question3");
        Map<Integer,Set<Integer>> map = new HashMap<>();
        Set<Integer> divisibleBy2 = new HashSet<>();
        Set<Integer> divisibleBy3 = new HashSet<>();
        Set<Integer> divisibleBy4 = new HashSet<>();
        Set<Integer> divisibleBy5 = new HashSet<>();
        Set<Integer> divisibleBy6 = new HashSet<>();
        Set<Integer> divisibleBy7 = new HashSet<>();
        Set<Integer> divisibleBy8 = new HashSet<>();
        Set<Integer> divisibleBy9 = new HashSet<>();

        for(int i  = 1; i <= num; i++) {
            if (i % 2 == 0) {
                divisibleBy2.add(i);
            }
            if(i % 3 == 0){
                divisibleBy3.add(i);
            }
            if(i % 4 == 0){
                divisibleBy4.add(i);
            }
            if(i % 5 == 0){
                divisibleBy5.add(i);
            }
            if(i % 6 == 0){
                divisibleBy6.add(i);
            }
            if(i % 7 == 0){
                divisibleBy7.add(i);
            }
            if(i % 8 == 0){
                divisibleBy8.add(i);
            }
            if(i % 9 == 0){
                divisibleBy9.add(i);
            }
        }
        map.put(2,divisibleBy2);
        map.put(3,divisibleBy3);
        map.put(4,divisibleBy4);
        map.put(5,divisibleBy5);
        map.put(6,divisibleBy6);
        map.put(7,divisibleBy7);
        map.put(8,divisibleBy8);
        map.put(9,divisibleBy9);
        System.out.println("2 :" + map.get(2));
        System.out.println("3 :" + map.get(3));
        System.out.println("4 :" + map.get(4));
        System.out.println("5 :" + map.get(5));
        System.out.println("6 :" + map.get(6));
        System.out.println("7 :" + map.get(7));
        System.out.println("8 :" + map.get(8));
        System.out.println("9 :" + map.get(9));

    }

    public static void call(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int divisibleNumber = scanner.nextInt();
        if(divisibleNumber<50){
            System.out.println("Please enter the number over 50: ");
            divisibleNumber = scanner.nextInt();
        }
        dicDivisibleValue(divisibleNumber);
    }
}
