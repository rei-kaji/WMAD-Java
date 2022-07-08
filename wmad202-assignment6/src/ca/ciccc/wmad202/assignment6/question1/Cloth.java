package ca.ciccc.wmad202.assignment6.question1;

import ca.ciccc.wmad202.assignment6.question0.Product;

import java.util.ArrayList;

public class Cloth extends Product {
    ArrayList<Material> ClothMaterials;
    public Cloth() { }

    public Cloth(Integer ClothID, String ClothName, Float ClothPrice, String ClothMadeInCountry, ArrayList<Material> ClothMaterials) {
        super(ClothID, ClothName, ClothPrice, ClothMadeInCountry);
        this.ClothMaterials = ClothMaterials;
    }

    public ArrayList<Material> getMaterials() {
        return ClothMaterials;
    }

    public void setMaterials(ArrayList<Material> materials) {
        this.ClothMaterials = materials;
    }
}
