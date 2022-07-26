package ca.ciccc.wmad202.assignment9.question2;

/**
 * Represents an operation that compares two input arguments and returns the result.
 * In general first-input argument is bigger(longer) than the second-input.
 * This is a functional interface whose functional method is compare(Object).
 * @param <T> – the type of the input to the operation
 * @param <S> – the type of the input to the operation
 */
@FunctionalInterface
public interface CompareLambda<T,S> {
    /**
     * Compare the two input arguments
     * @return compared result
     */
    boolean compare(T t, S s);
}
