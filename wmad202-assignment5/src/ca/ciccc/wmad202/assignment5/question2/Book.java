package ca.ciccc.wmad202.assignment5.question2;

import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    private ArrayList<String> pageList;

    public Book() {
        this.pageList = new ArrayList<>();
    }

    public Book(ArrayList<String> pageList) {
        this.pageList = pageList;
    }

    public void addWord(String word) {
        this.pageList.add(word);
    }

    public void serchWord(String word) {
        int count = 0;
        for (int i = 0; i < pageList.size(); i++) {
            String a[] = pageList.get(i).split(" ");
//            System.out.println(Arrays.toString(a));
            for(int j = 0; j < a.length; j++) {
                if(word.equals(a[j])) {
                    count++;
                }
            }
        }
        System.out.println(word+ " is " + count + " number of occurrences.");
    }
}
