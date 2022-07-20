package ca.ciccc.wmad202.assignment8.question3;

public class ApplicationDriver {
    static class MyGeometry{
        public void calculateAreaAndPerimeter(Shape shape){
            if(!ShapeType.class.isInstance(shape)){
                shape.perimeter();
                shape.area();
            }else {
                shape.perimeter();
            }
        }
    }
    enum ShapeType{
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }

    public static void main(String args[]) {
        MyGeometry mg = new MyGeometry();

        int[] s1Sides = {10,20}; //10 is width and 20 is length
        ShapeType s1Type = ShapeType.Rectangle;
        //use mg.calculateAreaAndPerimeter to calculate perimeter and area for the Rectangle above

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

        mg.calculateAreaAndPerimeter(s1);

        System.out.println("S1's permits:" + s1.perimeter());
        System.out.println("S1's areas:" + s1.area());

        int[] s2Sides = {10}; //10 is the width
        ShapeType s2Type = ShapeType.Square;
        Shape s2 = new Shape(s2Type, s2Sides) {

            @Override
            float perimeter() {
                return s2Sides[0] * 4;
            }

            @Override
            float area() {
                return s2Sides[0] * s2Sides[0];
            }
        };

        mg.calculateAreaAndPerimeter(s2);

        System.out.println("S2's permiteris:" + s2.perimeter());
        System.out.println("S2's areais:" + s2.area());

        int[] s3Sides = {12}; //12 is the radiusint[] s3Sides = {12}; //12 is the radius
        ShapeType s3Type = ShapeType.Circle;
        Shape s3 = new Shape(s3Type, s3Sides) {
            @Override
            float perimeter() {
                return (float) (s3Sides[0] * Math.PI);
            }

            @Override
            float area() {
                return (float) ((s3Sides[0] / 2) * (s3Sides[0] / 2) * Math.PI);
            }
        };
        mg.calculateAreaAndPerimeter(s3);
        System.out.println("S3's permiteris:" + s3.perimeter());
        System.out.println("S3's areais:" + s3.area());

        int[]s4Sides={8,12,12};
        ShapeType s4Type = ShapeType.Custom;
        Shape s4 = new Shape(s4Type, s4Sides) {

            @Override
            float perimeter() {
                return s4Sides[0] + s4Sides[1] + s4Sides[2];
            }

            @Override
            float area() {
                return s4Sides[0] * s4Sides[1] / 2;
            }
        };

        mg.calculateAreaAndPerimeter(s4);
        System.out.println("S4'spermiteris:" + s4.perimeter());
        System.out.println("S4'sareais:" + s4.area());
    }
}
