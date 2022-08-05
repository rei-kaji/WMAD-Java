package ca.ciccc.wmad202.project.TheTransformationCompany;

import java.util.HashMap;

public class Transformer {
    private String Name;
    private String Type;
    private int Strength;
    private int Intelligence;
    private int Speed;
    private int Endurance;
    private int Rank;
    private int Courage;
    private int Firepower;
    private int Skill;

    public Transformer(String name, String type, int strength, int intelligence, int speed, int endurance, int rank, int courage, int firepower, int skill) {
        this.Name = name;
        this.Type = type;
        this.Strength = strength;
        this.Intelligence = intelligence;
        this.Speed = speed;
        this.Endurance = endurance;
        this.Rank = rank;
        this.Courage = courage;
        this.Firepower = firepower;
        this.Skill = skill;
    }

    public String getName() {
        return this.Name;
    }

    public int getCourage() {
        return Courage;
    }
    public int getOverallRating() {
        int total = 0;
        total += this.Strength + this.Intelligence
                + this.Speed + this.Endurance + this.Firepower;
        return total;
    }
}
