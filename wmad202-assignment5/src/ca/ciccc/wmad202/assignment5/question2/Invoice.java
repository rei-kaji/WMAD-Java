package ca.ciccc.wmad202.assignment5.question2;

import java.util.ArrayList;

public class Invoice {
    private ArrayList<Product> ProductList;
    private float TotalPrice;

    public Invoice(ArrayList<Product> ProductList, float TotalPrice) {
        this.ProductList = ProductList;
        this.TotalPrice = TotalPrice;
    }

    public Invoice() {
        this.ProductList = new ArrayList<>();
        this.TotalPrice = 0;
    }

    public void addProduct(Product product) {
        ProductList.add(product);
    }

    public void getListAndTotalPrice() {
        for(int i = 0; i < ProductList.size(); i++) {
            Product p = ProductList.get(i);
            TotalPrice += p.price;
            System.out.println(p.name);
            System.out.println(p.price);
        }
        System.out.println("Total price is " + TotalPrice);
    }
}
