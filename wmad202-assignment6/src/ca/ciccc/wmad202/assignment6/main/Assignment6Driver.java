package ca.ciccc.wmad202.assignment6.main;

import ca.ciccc.wmad202.assignment6.question0.Product;
import ca.ciccc.wmad202.assignment6.question1.*;
import ca.ciccc.wmad202.assignment6.question2.ShoppingCart;

import java.util.ArrayList;
import java.util.Scanner;

//　Good site of explanation of abstract & interface!
// https://qiita.com/yoshinori_hisakawa/items/cc094bef1caa011cb739
// https://www.k-karakuri.com/entry/2018/04/12/%E6%8A%BD%E8%B1%A1%E3%82%AF%E3%83%A9%E3%82%B9%28Abstract%29%E3%81%A8%E3%82%A4%E3%83%B3%E3%82%BF%E3%83%BC%E3%83%95%E3%82%A7%E3%83%BC%E3%82%B9%28Interface%29%E3%81%AE%E9%81%95%E3%81%84%E3%81%A8%E5%AE%9F


public class Assignment6Driver {
    public static void run(){
        System.out.println("Assignment6");
        Product product = new Product(110,"Diet Pepsi",2F,"USA");

        Drink drink1 = new Drink();
        drink1.setId(412);
        drink1.setName("Pepsi");
        drink1.setPrice(2F);
        drink1.setMadeInCountry("USA");
        drink1.setDrinkDiet(false);
        drink1.setSize(150);

        Drink drink2 = new Drink();
        drink2.setId(183);
        drink2.setName("Ginger Zero");
        drink2.setPrice(3F);
        drink2.setMadeInCountry("Canada");
        drink2.setDrinkDiet(true);
        drink2.setSize(200);

        ArrayList<String> ingredients1 = new ArrayList<>();
        ingredients1.add("chicken");
        ingredients1.add("oil");
        ingredients1.add("cheese");

        Food food1 = new Food();
        food1.setId(100);
        food1.setName("Chicken");
        food1.setPrice(8F);
        food1.setMadeInCountry("Canada");
        food1.setIngredients(ingredients1);
        food1.setSize(4);
        food1.setCalorie(350);

        ArrayList<String> ingredients2 = new ArrayList<>();
        ingredients2.add("pasta");
        ingredients2.add("meet");
        ingredients2.add("spinach");
        Food food2 = new Food(101,"Pasta",18F,"Canada", 250,4,ingredients2);

        Material material1 = new Material(10,"Cotton");
        Material material2 = new Material(11,"Nylon");
        ArrayList<Material> materials = new ArrayList<>();
        materials.add(material1);
        materials.add(material2);
        Cloth cloth = new Cloth(701,"T-shirt",15F,"China",materials);

        ShoppingCart shoppingCart =  new ShoppingCart();
        //amount 2
        Integer savedProduct1 = shoppingCart.addItem(drink1);
        System.out.println("product id : " + savedProduct1 + " is saved!");
        Integer savedProduct2 = shoppingCart.addItem(drink1);
        System.out.println("product id : " + savedProduct2 + " is saved!");
        //1
        Integer savedProduct3 = shoppingCart.addItem(drink2);
        System.out.println("product id : " + savedProduct3 + " is saved!");
        //2
        Integer savedProduct4 = shoppingCart.addItem(food1);
        System.out.println("product id : " + savedProduct4 + " is saved!");
        Integer savedProduct5 = shoppingCart.addItem(food1);
        System.out.println("product id : " + savedProduct5 + " is saved!");
        //2
        Integer savedProduct6 = shoppingCart.addItem(food2);
        System.out.println("product id : " + savedProduct6 + " is saved!");
        Integer savedProduct7 = shoppingCart.addItem(food2);
        System.out.println("product id : " + savedProduct7 + " is saved!");
        //1
        Integer savedProduct8 = shoppingCart.addItem(cloth);
        System.out.println("product id : " + savedProduct8 + " is saved!");

        System.out.println("List of product on your shopping chart : ");
        shoppingCart.printProductOnCart();


        Float totalAmount = shoppingCart.totalAmountCart();
        System.out.println("Shopping Cart Total price : " + totalAmount + "$");


    }
}
