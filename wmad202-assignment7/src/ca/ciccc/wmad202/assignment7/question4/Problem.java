package ca.ciccc.wmad202.assignment7.question4;

import java.util.List;

public class Problem <T>{
    public List<T> lists;

    public Problem() {
    }

    public Problem(List<T> lists) {
        this.lists = lists;
    }

    public List<T> getLists() {
        return lists;
    }

    public void setLists(List<T> lists) {
        this.lists = lists;
    }
}
