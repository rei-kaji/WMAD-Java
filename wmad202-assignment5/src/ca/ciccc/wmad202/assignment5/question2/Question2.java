package ca.ciccc.wmad202.assignment5.question2;

import java.util.Scanner;

public class Question2 {
    public void run() {
        System.out.println("Question2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter question number 1-8 to show result of question");
        int question = scanner.nextInt();

        switch (question) {
            case 1:
                question2_1();
            case 2:
                question2_2();
            case 3:
                question2_3();
            case 4:
                question2_4();
            case 5:
                question2_5();
            case 6:
                question2_6();
            case 7:
                question2_7();
            case 8:
                question2_8();

        }
    }

    public void question2_1() {
        System.out.println("Question2-1");
        Invoice invoice = new Invoice();
        Product productA = new Product("Google", 1000F);
        Product productB = new Product("Tesla", 2000F);
        Product productC = new Product("Apple", 1500F);
        invoice.addProduct(productA);
        invoice.addProduct(productB);
        invoice.addProduct(productC);

        invoice.getListAndTotalPrice();
    }

    public void question2_2() {
        System.out.println("Question2-2");
        Book book = new Book();
        book.addWord("Hello");
        book.addWord("test");
        book.addWord("Hello World");
        book.addWord("Good");
        book.serchWord("Hello");
    }

    public void question2_3() {
        System.out.println("Question2-3");
        BankStatement bankStatement = new BankStatement();
        Transaction transaction1 = new Transaction("deposit", 1000F);
        Transaction transaction2 = new Transaction("withdraw", 5000F);
        Transaction transaction3 = new Transaction("deposit", 10000F);
        bankStatement.addTransaction(transaction1);
        bankStatement.addTransaction(transaction2);
        bankStatement.addTransaction(transaction3);

        bankStatement.getTotalBalance();
    }

    public void question2_4() {
        System.out.println("Question2-4");
        Program program = new Program();
        program.addProgram("System.out.println('Hello World')");
        program.addProgram("System.out.println('Hello Java')");
        program.addProgram("System.out.println('Hello JavaScript')");
        program.addProgram("System.out.println('Hello C#')");

        program.printer();
    }

    public void question2_5() {
        System.out.println("Question2-5");

        Caluculator caluculator = new Caluculator(10,2,"/");
        caluculator.getResultCaluculator();

        Caluculator caluculator2 = new Caluculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number1");
        int number1 = scanner.nextInt();
        System.out.println("Please enter number2");
        int number2 = scanner.nextInt();
        System.out.println("Please enter operator");
        String operator = scanner.next();
        caluculator2.setCaluculator(number1, number2, operator);
        caluculator2.getResultCaluculator();
    }

    public void question2_6() {
        Phone phone = new Phone();
        phone.createAlarmTime();
    }

    public void question2_7() {
        Student student = new Student("100-50","50");
        student.ask();
        student.printAnswer();
    }

    public void question2_8() {
        Student student = new Student("What language is the most spoken in the world?", "English");
        student.ask();
        student.printAnswer();
    }
}
