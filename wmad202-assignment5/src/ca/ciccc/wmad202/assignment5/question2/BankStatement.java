package ca.ciccc.wmad202.assignment5.question2;

import java.util.ArrayList;

public class BankStatement {
    private ArrayList<Transaction> bankStatement;

    public BankStatement() {
        this.bankStatement = new ArrayList<>();
    }

    public void addTransaction(Transaction t) {
        this.bankStatement.add(t);
    }

    public void getTotalBalance() {
        float total = 0;
        for (int i = 0; i < bankStatement.size(); i++) {
            Transaction transaction = bankStatement.get(i);
            if (transaction.id == "deposit") {
                total -= transaction.balance;
            } else {
                total += transaction.balance;
            }
            System.out.println(transaction.id + " : " + transaction.balance);
        }

        System.out.println("Total is " + total);
    }

}
