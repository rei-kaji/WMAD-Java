package ca.ciccc.wmad202.assignment2.question6;

import java.util.Scanner;

public class Question6 {
    //The Java program receives a statement
    // which contains only alphabet variables
    // and binary operations including +, -, *, / and % and checks
    // whether the statement is a valid arithmetic statement or not.
    //
    //*The statement might contain parenthesis as well.
    //For instance:
    //• a+b*a+c/c%y
    //• (a+b)*(a/d-(a/b))
    //
    //You can make this assumption
    // that the variable names contain only one alphabet
    // (like a, b, c) and cannot have more than one alphabet (like ab, temp, sum, ...)
    //Note: Such a statement is valid if two conditions are met at the same time:
    //1- The number of open and close parenthesizes in the statement is the same.
    //2- At any point (character or index) of the statement,
    // the number of open Parenthesizes is bigger than or equal to the number of closed parenthesizes.
    public static void checkArithmetic(){
        boolean stopLoop = true;
        while (stopLoop){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the statement : ");
            String input = scanner.nextLine();
            for (int i = 0; i < input.length(); i++){
                if(!(input.length() == i + 1)){
                    if(Character.isAlphabetic(input.charAt(i))){
                        if(Character.isAlphabetic(input.charAt(i+1))){

                            if(input.charAt(i) == '('){
                                if(input.charAt(i+1) == '('){
                                    stopLoop = true;
                                }
                            }else if(input.charAt(i) == ')'){
                                if(input.charAt(i+1) == ')'){
                                    stopLoop = true;
                                }
                            }else {
                                stopLoop = false;
                                System.out.println("There is multiple char");
                            }
                        }
                    }
                }
            }
            System.out.println("input : "+ input);
        }
    }
}
