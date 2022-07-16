package ca.ciccc.wmad202.assignment7.question1;

import java.util.Collection;

public class Algorithm<T,S> {
    public static <T> int countNumberOfElementsWithSpecificProperty(Collection<T> c, Predicate<T> p) {
        int count = 0;
        for (T elem : c)
            if (elem instanceof Student){
                if (p.test(((Student) elem).getGpa()))
                    ++count;
            }

        return count;
    }
}