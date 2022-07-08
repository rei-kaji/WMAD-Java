package ca.ciccc.wmad202.assignment6.question2;

import ca.ciccc.wmad202.assignment6.question0.Product;

import java.util.ArrayList;

public class ShoppingCart implements IShopingCart {
    ArrayList<Product> products = new ArrayList<>();

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    @Override
    public Integer addItem(Product product) {
        this.products.add(product);
        return product.getId();
    }

    @Override
    public Float totalAmountCart() {
        float total = 0;
        for (Product product : this.products) {
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public void printProductOnCart() {
        for (Product product : this.products) {
            System.out.println(product.getName());
        }
    }
}
