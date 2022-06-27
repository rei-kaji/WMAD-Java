package ca.ciccc.wmad202.assignment5.question2;

public class Product {
    String name;
    Float price;

    public Product(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    public void getProduct() {
        System.out.println(this.name);
        System.out.println(this.price);
    }
}
