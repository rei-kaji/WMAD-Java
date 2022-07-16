package ca.ciccc.wmad202.assignment7.question4;

import java.util.List;

public class Service<T> implements IService<T>{

    private Problem problem;

    public Service() {
        problem = new Problem<>();
    }

    @Override
    public List<T> addItemToList(T obj) {
        if (obj != null){
            problem.setLists((List) obj);
        }
        return problem.getLists();
    }

    @Override
    public void removeItemFromTheList(T obj) {
        if (obj != null){
            problem.getLists().remove(obj);
        }
    }

    @Override
    public List<T> performOperation(List<T> obj) {

        if (problem.getLists().equals(obj)){
            return obj;
        }
        return null;
    }
}