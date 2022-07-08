package ca.ciccc.wmad202.assignment6.question0;

public class Product extends Object {
    Integer ProductID;
    String productName;
    Float productPrice;
    String productMadeInCountry;

    public Product() { }
    public Product(Integer ProductID, String productName, Float productPrice, String productMadeInCountry) {
        this.ProductID = ProductID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productMadeInCountry = productMadeInCountry;
    }

    public Integer getId() {
        return ProductID;
    }

    public void setId(Integer id) {
        this.ProductID = id;
    }

    public String getName() {
        return productName;
    }

    public void setName(String name) {
        this.productName = name;
    }

    public Float getPrice() {
        return productPrice;
    }

    public void setPrice(Float price) {
        this.productPrice = price;
    }

    public String getMadeInCountry() {
        return productMadeInCountry;
    }

    public void setMadeInCountry(String madeInCountry) {
        this.productMadeInCountry = madeInCountry;
    }

}
