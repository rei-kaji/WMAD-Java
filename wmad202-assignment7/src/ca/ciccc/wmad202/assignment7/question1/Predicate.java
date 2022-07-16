package ca.ciccc.wmad202.assignment7.question1;

public class Predicate<T> implements IPredicate {
    @Override
    public boolean test(Double i) { return i > 55.0; }
}
