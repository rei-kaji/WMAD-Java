package ca.ciccc.wmad202.assignment7.question4;

import java.util.List;

public interface IService<T> {
    public List<T> addItemToList(T obj);
    public void removeItemFromTheList(T obj);
    public List<T> performOperation(List<T> obj);
}