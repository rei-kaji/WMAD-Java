package ca.ciccc.wmad202.assignment9.question1;

import java.util.ArrayList;
import java.util.function.Consumer;

// Problem Description: Using Consumer, receive an ArrayList<String> and when that content has "A", print that content.
public class ConsumerFunction {
    public static void main(String[] args) {
        Consumer<ArrayList<String>> consumer = (array1) -> {
            for (String s : array1) {
                if (s.contains("A")) {
                    System.out.println(s);
                }
            }
        };

        ArrayList<String> alpah = new ArrayList<>();
        alpah.add("ABC");
        alpah.add("DEF");
        alpah.add("GHI");

        consumer.accept(alpah);
    }


}
