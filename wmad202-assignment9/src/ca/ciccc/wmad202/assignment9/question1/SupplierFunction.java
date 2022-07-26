package ca.ciccc.wmad202.assignment9.question1;

import java.util.function.Supplier;

// Problem Description: Using Supplier, print the word that was hided in supplier.
public class SupplierFunction {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World:)";

        System.out.println(supplier.get());
    }
}
