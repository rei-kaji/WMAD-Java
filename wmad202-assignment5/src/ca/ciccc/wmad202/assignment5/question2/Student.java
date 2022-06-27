package ca.ciccc.wmad202.assignment5.question2;

public class Student {
    private String text;
    private String textAnwser;

    Student(String text, String textAnwser) {
        this.text = text;
        this.textAnwser = textAnwser;
    }

    public void ask() {
        MultipleChoice mc = new MultipleChoice();
        mc.ShowQuestion(text);
    }

    public void printAnswer() {
        MultipleChoice mc = new MultipleChoice();
        mc.ShowTheAnwser(textAnwser);
    }
}
