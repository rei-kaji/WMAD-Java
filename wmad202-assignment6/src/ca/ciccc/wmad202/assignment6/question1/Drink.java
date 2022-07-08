package ca.ciccc.wmad202.assignment6.question1;

import ca.ciccc.wmad202.assignment6.question0.Product;

public class Drink extends Product {
    Boolean isDrinkDiet;
    Integer drinkSize;

    public Drink () {}

    public Drink(Integer drinkID, String drinkName, Float drinkPrice, String drinkMadeInCountry, Boolean isDrinkDiet, Integer drinkSize) {
        super(drinkID, drinkName, drinkPrice, drinkMadeInCountry);
        this.isDrinkDiet = isDrinkDiet;
        this.drinkSize = drinkSize;
    }

    public Boolean getDrinkDiet() {
        return isDrinkDiet;
    }

    public void setDrinkDiet(Boolean drinkDiet) {
        isDrinkDiet = drinkDiet;
    }

    public Integer getSize() {
        return drinkSize;
    }

    public void setSize(Integer size) {
        this.drinkSize = size;
    }


}
