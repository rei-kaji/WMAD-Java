package ca.ciccc.wmad202.assignment7.question4;

import java.util.Arrays;

public class Test4 {


    public void main() {
        Service service = new Service();
        service.addItemToList(Arrays.asList(1,2,3,4,5));
        service.addItemToList(Arrays.asList(1,2));
        service.removeItemFromTheList(Arrays.asList(1,2,3,4,5));
        System.out.println(service.performOperation(Arrays.asList(1,2)));
    }
}