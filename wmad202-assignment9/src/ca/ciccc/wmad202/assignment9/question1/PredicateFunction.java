package ca.ciccc.wmad202.assignment9.question1;

import java.util.function.Predicate;

// Problem Description: Using Predicate, confirm your age can go to the party.
public class PredicateFunction {
    public static void main(String[] args) {
        Predicate<Integer> ageMin = (age) -> age > 18;
        Predicate<Integer> ageMax = (age) -> age < 35;

        System.out.println(ageMin.and(ageMax).test(28));
    }
}
