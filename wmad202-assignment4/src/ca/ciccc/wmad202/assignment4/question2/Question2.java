package ca.ciccc.wmad202.assignment4.question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Question2 {
    // Write a method which lets the user enter English words.
    // The user can keep entering English words as long as the user has not entered the word “exit”.
    // Once the user enters “exit” the method will return and print the list of all distinct words starts with English alphabets.
    // Like: A: Ali, apple, ... B: Bob, book ... until Z
    public static void gatheringWords(){
        System.out.println("Question2");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> gathering = new HashMap<>();
        final String EXIT = "exit";
        String[] alphabets = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        System.out.println("Please enter the word: ");
        String word = scanner.next();
        ArrayList<String> wordlist = new ArrayList<>();
        String initial = String.valueOf(word.charAt(0)).toUpperCase();
        while(!word.equals(EXIT)){
            String words = gathering.get(initial) + "," + word;
            System.out.println(words);
            gathering.remove(initial);
            gathering.put(initial, words);

            System.out.println("Please enter the word again: ");
            word = scanner.next();
            initial = String.valueOf(word.charAt(0)).toUpperCase();
        }

        System.out.println(gathering);
    }
}
