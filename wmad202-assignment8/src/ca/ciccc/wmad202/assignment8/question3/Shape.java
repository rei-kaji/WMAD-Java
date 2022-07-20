package ca.ciccc.wmad202.assignment8.question3;

abstract class Shape {
    public Shape(ApplicationDriver.ShapeType shapeType, int[] sides) {
    }

    public Shape() {

    }

    abstract float perimeter();
    abstract float area();
}
