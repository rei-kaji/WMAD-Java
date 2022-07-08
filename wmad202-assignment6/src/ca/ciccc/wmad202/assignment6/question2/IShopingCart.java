package ca.ciccc.wmad202.assignment6.question2;

import ca.ciccc.wmad202.assignment6.question0.Product;

public interface IShopingCart {
    Integer addItem(Product product);

    Float totalAmountCart();

    void printProductOnCart();
}
