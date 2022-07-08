package ca.ciccc.wmad202.lecture.main;

import ca.ciccc.wmad202.lecture.basics.JavaBasics;
import ca.ciccc.wmad202.lecture.inherit.TestCase;
import ca.ciccc.wmad202.lecture.oop.DemoStudentExample;

import java.util.Scanner;

import static ca.ciccc.wmad202.lecture.inherit.TestCase.runAllInheritTestScenario;

public class LectureCodeDriver {
    public static void run(){
        System.out.println("WMAD202 Lecture Code Driver");

//        int result = JavaBasics.add1();
//        System.out.println(result);
//
//        result = JavaBasics.add2();
//        System.out.println(result);
//
//        result = JavaBasics.add3(4, 5);
//        System.out.println(result);
//        result = JavaBasics.add3(14, 15);
//        System.out.println(result);
//        result = JavaBasics.add3(10, 20);
//        System.out.println(result);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ent1er number1: ");
//        int number1 = scanner.nextInt();
//
//        System.out.println("Enter number2: ");
//        int number2 = scanner.nextInt();
//
//        result = JavaBasics.add3(number1, number2);
//        System.out.println(result);

//        DemoStudentExample demo = new DemoStudentExample();
//        System.out.println("Finish Lecture Code!");

        runAllInheritTestScenario();
    }
}