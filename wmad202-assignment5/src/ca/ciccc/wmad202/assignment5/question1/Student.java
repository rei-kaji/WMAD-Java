package ca.ciccc.wmad202.assignment5.question1;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private int studentID;
    private String name;
    private ArrayList<Integer> listOfGrade;

    public Student(int studentID, String name, ArrayList<Integer> listOfGrade) {
        this.studentID = studentID;
        this.name = name;
        this.listOfGrade = listOfGrade;
    }

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.listOfGrade = new ArrayList<>();
    }

    public void addGrade(int grade) {
        this.listOfGrade.add(grade);
    }

    public float calculateGPA() {
        int totalGrade = 0;

        for (Integer integer : this.listOfGrade) {
            totalGrade += integer;
        }

        if (this.listOfGrade.size() > 0) {
            return (float) (((1.0) * totalGrade) / this.listOfGrade.size());
        } else {
            return 0;
        }
    }

    public HashMap<String, String> studentInformation() {
        HashMap<String, String> info = new HashMap<>();
        info.put("The ID of the student", String.valueOf(this.studentID));
        info.put("List of all grades", String.valueOf(this.listOfGrade));
        info.put("The name of the student", this.name);
        info.put("The GPA of the student", String.valueOf(this.calculateGPA()));

        return info;
    }

    public int compareGPA(Student otherStudnet) {
        if (this.calculateGPA() > otherStudnet.calculateGPA()) {
            return 1;
        } else {
            return -1;
        }
    }

}
