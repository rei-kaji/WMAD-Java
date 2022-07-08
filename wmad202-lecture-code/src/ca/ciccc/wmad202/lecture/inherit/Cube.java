package ca.ciccc.wmad202.lecture.inherit;

public class Cube extends Shape {

    public Cube(String color, int height) {
        super(color, height);
    }

    @Override
    public double getVolume() {
        return height * height * height;
    }
}
