package ca.ciccc.wmad202.assignment3.question4;

import java.util.*;

public class Question4 {
//Problem4
//Implement a function which receives a list of positive integers as input parameter.
// The numbers in the list are only between 1 and 99.
// The list might have repeated numbers.
// The method will return the number that is repeated the most.
// If there are multiple numbers that are repeated the most, returns only one of them.
//- Example: for this list [1,4,5,6,1,2,4,5,6,5] the function returns 5 because it is the only numbers repeated 3 times (the most)

    public static void getMostRepeatedNumber(){
        System.out.println("Question4");
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

        int number = 0;
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = i + 1; j < numberList.size(); j++) {
                if (numberList.get(i) == numberList.get(j)) {
                    // got the duplicate element
                    number = numberList.get(i);
                    break;
                }
            }
        }

        System.out.println("REPEATED NUMBER: " + number);
    }
}
