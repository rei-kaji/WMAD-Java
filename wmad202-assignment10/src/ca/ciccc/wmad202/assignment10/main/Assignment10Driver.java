package ca.ciccc.wmad202.assignment10.main;

import ca.ciccc.wmad202.assignment10.question1.Question1;
import ca.ciccc.wmad202.assignment10.question3.Predicate1Exception;
import ca.ciccc.wmad202.assignment10.question3.Predicate2Exception;
import ca.ciccc.wmad202.assignment10.question3.Question3;

public class Assignment10Driver {
    public static void run(){
        try {
            Question3.test();
        } catch (Predicate1Exception e) {
            System.out.println(e.getMessage());
        } catch (Predicate2Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
