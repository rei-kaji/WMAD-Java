package ca.ciccc.wmad202.assignment8.question2;

abstract class Shape {
    public Shape(ApplicationDriver.ShapeType square, int[] s2Sides) {
    }

    public Shape() {

    }

    abstract float perimeter();
    abstract float area();
}
