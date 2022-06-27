package ca.ciccc.wmad202.assignment5.question2;

import java.util.ArrayList;

public class MultipleChoice {
    private ArrayList<String> ChoiceList = new ArrayList<>();

    public void giveChoices(String a1,String a2,String a3,String a4) {
        ChoiceList.add("A");
        System.out.println("A-" + a1);
        ChoiceList.add("B");
        System.out.println("B-" + a2);
        ChoiceList.add("C");
        System.out.println("C-" + a3);
        ChoiceList.add("D");
        System.out.println("D-" + a3);
    }

    public void ShowQuestion(String s) {
        System.out.println(s);
    }

    public void ShowTheAnwser(String s) {
        System.out.println("Correct anwser: " + s);
    }

    public void checkChoice(String answer, String answer1) {
        String correct = answer1;
        if(answer == correct) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
