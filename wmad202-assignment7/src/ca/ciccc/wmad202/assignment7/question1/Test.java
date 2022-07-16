package ca.ciccc.wmad202.assignment7.question1;

import java.util.Arrays;
import java.util.Collection;

public class Test {
    public void invoke() {
        Student student = new Student();
        student.setId(1L);
        student.setName("Rei");
        student.setGpa(90.0);
        Collection<Student> ci = Arrays.asList(student);
        int count = Algorithm.countNumberOfElementsWithSpecificProperty(ci, new Predicate<>());
        System.out.println("Student gpa is bigger than 55 = " +(count == 1));

    }
}