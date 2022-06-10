package ca.ciccc.wmad202.assignment2.question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question4 {
    //    The program keeps asking the user to enter numbers
    //    (positive or negative) until the user enters an invalid input.
    //    (An invalid input is an input which includes at least one alphabet, like 123d4).
    //    The program should print the Max and Min of the numbers the user had entered as well as the distance between the Max and Min.
    //    (Remember to calculate the absolute distance).

    public static void returnMaxMinDistance(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        String number = scanner.next();
        ArrayList<Integer> arrayNum = new ArrayList<Integer>();

        for(; number != null && number.matches("^[0-9]+$|-[0-9]+$");){
            arrayNum.add(Integer.parseInt(number));
            System.out.println("Please enter the number again: ");
            number = scanner.next();
        }

        if(arrayNum.size() > 2){
            int maxNum = Collections.max(arrayNum);
            int minNum = Collections.min(arrayNum);
            int absoluteDistance = Math.abs(maxNum - minNum);

            System.out.println("Max is " + maxNum);
            System.out.println("Min is " + minNum);
            System.out.println("Abusolute Distance is " + absoluteDistance);
        }

        System.out.println("You didn't input over twice.");



    }
}
