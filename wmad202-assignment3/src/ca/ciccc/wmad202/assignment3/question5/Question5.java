package ca.ciccc.wmad202.assignment3.question5;

import java.util.*;

public class Question5 {
//Problem5
//Write a method, which receives a list of positive integers between 1 and 99,
// which may or may not contain repeated numbers.
//The methods should print out how many each item in the list is repeated.

    public static void countRepeated(){
        System.out.println("Question5");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("Please enter the number: ");
        int number1 = scanner.nextInt();
        numberList.add(number1);

        while(number1 != 0){
            System.out.println("Please enter the number again (0 : stop): ");
            number1 = scanner.nextInt();
            if(number1 != 0){
                numberList.add(number1);
            }
        }

        ArrayList<Integer> hashed = new ArrayList<>(new HashSet<>(numberList));

        for (int i=0;i<=hashed.size();i++) {
            int count=1;
            for (int j=i+1;j<=hashed.size()+1;j++) {
                if (Objects.equals(numberList.get(i), numberList.get(j))){
                    count++;
                }
            }
            System.out.println("The number "+ numberList.get(i) +" is repeated " + count + " times" + "\n");
        }
    }
}
