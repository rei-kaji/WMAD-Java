package ca.ciccc.wmad202.assignment3.question9;

import java.util.ArrayList;
import java.util.Scanner;

import ca.ciccc.wmad202.assignment3.question1.Question1;

public class Question9 {
// Question9
// Suppose a list of posi-ve numbers is given like the following list
// (remember this is only an example and the list could be any list of posi-ve numbers)
//  We would like to know the “prime visibility” of each index of the list.
//  The “prime visibility” of a given index shows how many numbers in the list with indexes lower than the given index are prime.
//  For instance, in the examplList, the “prime visibility” of the index 4 is 2 because there are 2 numbers (19 and 11) before index 4 that are prime.
//  To solve this problem, design and implement a method called primeVisibility with two input
//  parameters:
//      The list of numbers .1 The index .2
//      The method finds and returns the “prime visibility” of the given index.
//  Note: Reuse the method defined in problem 1.

    public static int getPrimeVisibly(ArrayList<Integer> numberList, int indexNumber){
        int count = 0;
        boolean check = false;
        System.out.println("numberList" + numberList);
        for(int i = 0; i < indexNumber; i++ ){
            System.out.println("numberList.get(i) = " + numberList.get(i) + " i = " + i);
            System.out.println(Question1.checkPrimeNumber(numberList.get(i)));
            if(Question1.checkPrimeNumber(numberList.get(i))){
                count++;
                System.out.println("Prime: " + numberList.get(i));
            }
        }
        return count;
    }

    public static void callPrimeVisibly(){
        System.out.println("Question9");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("Please enter the number for making ArrayList: ");
        int number1 = scanner.nextInt();
        numberList.add(number1);

        while(number1 != 0){
            System.out.println("Please enter the number again (0 : stop): ");
            number1 = scanner.nextInt();
            if(number1 != 0){
                numberList.add(number1);
            }
        }

        System.out.println("This arraylist has " + numberList.size() + " index.");

        System.out.println("Please enter the Index number: ");
        int indexNumber = scanner.nextInt();
        while(indexNumber > numberList.size()){
            System.out.println("Please enter the Index number: ");
            indexNumber = scanner.nextInt();
        }

        System.out.println("There are " + getPrimeVisibly(numberList, indexNumber) + " prime visibility!");
    }
}
