package ca.ciccc.wmad202.assignment6.question1;

import ca.ciccc.wmad202.assignment6.question0.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Food extends Product {
    Integer foodCalorie;
    Integer foodSize;
    ArrayList<String> foodIngredients;

    public Food() { }


    public Food(Integer foodID, String foodName, Float foodPrice, String foodMadeInCountry, Integer foodCalorie, Integer foodSize, ArrayList<String> foodIngredients) {
        super(foodID, foodName, foodPrice, foodMadeInCountry);
        this.foodCalorie = foodCalorie;
        this.foodSize = foodSize;
        this.foodIngredients = foodIngredients;
    }

    public ArrayList<String> getIngredients() {
        return foodIngredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.foodIngredients = ingredients;
    }

    public Integer getSize() {
        return foodSize;
    }

    public void setSize(Integer size) {
        this.foodSize = size;
    }

    public Integer getCalorie() {
        return foodCalorie;
    }

    public void setCalorie(Integer calorie) {
        this.foodCalorie = calorie;
    }

}
