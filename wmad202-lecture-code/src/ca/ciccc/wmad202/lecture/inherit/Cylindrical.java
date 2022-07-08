package ca.ciccc.wmad202.lecture.inherit;

public class Cylindrical extends Shape {
    public int radius;

    public Cylindrical(String color, int height, int radius) {
        super(color, height);
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return radius * radius * Math.PI * height;
    }
}
