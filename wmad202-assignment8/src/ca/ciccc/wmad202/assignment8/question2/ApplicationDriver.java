package ca.ciccc.wmad202.assignment8.question2;

public class ApplicationDriver {
    enum ShapeType{
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }

    public static void main(String args[]) {
        int[] s1Sides = {10, 20};
        Shape s1 = new Shape() {
            @Override
            float perimeter() {
                return s1Sides[0] * 2 + s1Sides[1] * 2;
            }

            @Override
            float area() {
                return s1Sides[0] * s1Sides[1];
            }
        };
        System.out.println("S1's permits:" + s1.perimeter());
        System.out.println("S1's areas:" + s1.area());

        int[] s2Sides = {10};
        Shape s2 = new Shape(ShapeType.Square, s2Sides) {

            @Override
            float perimeter() {
                return s2Sides[0] * 4;
            }

            @Override
            float area() {
                return s2Sides[0] * s2Sides[0];
            }
        };
        System.out.println("S2's permiteris:" + s2.perimeter());
        System.out.println("S2's areais:" + s2.area());

        int[] s3Sides = {12};
        Shape s3 = new Shape(ShapeType.Circle, s3Sides) {
            @Override
            float perimeter() {
                return (float) (s3Sides[0] * Math.PI);
            }

            @Override
            float area() {
                return (float) ((s3Sides[0] / 2) * (s3Sides[0] / 2) * Math.PI);
            }
        };
        System.out.println("S3's permiteris:" + s3.perimeter());
        System.out.println("S3's areais:" + s3.area());

        int[] s4Sides = {8, 12, 12};
        Shape s4 = new Shape(ShapeType.Triangle, s4Sides) {

            @Override
            float perimeter() {
                return s4Sides[0] + s4Sides[1] + s4Sides[2];
            }

            @Override
            float area() {
                return s4Sides[0] * s4Sides[1] / 2;
            }
        };
        System.out.println("S4'spermiteris:" + s4.perimeter());
        System.out.println("S4'sareais:" + s4.area());
    }
}
