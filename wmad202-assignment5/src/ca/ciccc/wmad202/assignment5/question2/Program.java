package ca.ciccc.wmad202.assignment5.question2;

import java.util.ArrayList;

public class Program {
    private ArrayList<String> programs;

    public Program() {
        this.programs = new ArrayList<>();
    }

    public void addProgram(String program) {
        this.programs.add(program);
    }

    public void printer() {
        System.out.println(programs);
    }
}
