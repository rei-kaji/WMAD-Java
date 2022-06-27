package ca.ciccc.wmad202.assignment5.question1;

import java.util.ArrayList;
import java.util.Random;

public class testClass {
//    private static ArrayList<Integer> grades() {
//        Random rnd = new Random();
//        ArrayList<Integer> grades = new ArrayList<>();
//
//        for (int i = 0; i < 5; i++) {
//            grades.add(rnd.nextInt(100));
//        }
//        return grades;
//    }
    public static void test() {
        System.out.println("Question1");


        ArrayList<Integer> gradesStudent1 = new ArrayList<>();
        gradesStudent1.add(80);
        gradesStudent1.add(78);
        gradesStudent1.add(65);
        gradesStudent1.add(34);

        Student student = new Student(77889911, "John", gradesStudent1);
        Student student2 = new Student(66553322, "James");
        //87,63,45,91
        student2.addGrade(87);
        student2.addGrade(63);
        student2.addGrade(45);
        student2.addGrade(91);
        System.out.println("Student1 GPA: "+student.calculateGPA());
        System.out.println("Student2 GPA: "+student2.calculateGPA());
        System.out.println(student.compareGPA(student2));
    }
}
