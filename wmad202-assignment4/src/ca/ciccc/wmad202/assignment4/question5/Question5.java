package ca.ciccc.wmad202.assignment4.question5;

import java.util.*;

public class Question5 {
    //Write a Java method which has a list of points as its input parameter.
    //Each point is represented by a dictionary with 3 keys and each key has a value.
    //The keys of the point dictionary is “x”, “y” and “z”.
    //Each point represent a position in the 3D coordination system (space).
    //The method should find and return the point in the input list which has the minimum distance to the center of the coordination system.
    //The center of the coordination system is a point whose values for all the keys are 0 (i.e: center = {“x”=0, “y”=0, “z”=0}
    //
    //The distance between two points (x1,y1,z1) and (x2, y2, z2) in coordination system is calculated using the following formula:
    //distance = Sqrt ((x1-x2)**2 + (y1-y2)**2 + (z1-z2)**2)
    //for example:
    //point1=(2,5,6) and point2 = (1,1,1) then the distance is
    //distance = sqrt ((2-1)**2 + (5-1)**2 + (6-1)**2) = sqrt(1+16+25) = sqrt (42)

    public static Map<String,Long> distancePoint(List<Map<String,Integer>> points) {
        int x1= 0; int x2 = 0;
        int y1= 0; int y2 = 0;
        int z1= 0; int z2 = 0;

        for (int i = 0; i< points.size(); i++) {
            if (i == 0) {
                x1 = points.get(i).get("x");
                y1 = points.get(i).get("y");
                z1 = points.get(i).get("z");
            }else if (i == 1){
                x2 = points.get(i).get("x");
                y2 = points.get(i).get("y");
                z2 = points.get(i).get("z");
            }
        }

        long distanceOfBtwPoints = Math.round(Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2) + Math.pow((z1-z2),2)));
        long distanceOfCenterPoint1 = Math.round(Math.sqrt(Math.pow((x1-0),2) + Math.pow((y1-0),2) + Math.pow((z1-0),2)));
        long distanceOfCenterPoint2 = Math.round(Math.sqrt(Math.pow((x2-0),2) + Math.pow((y2-0),2) + Math.pow((z2-0),2)));

        System.out.println("distanceOfBtwPoints" + distanceOfBtwPoints);
        System.out.println("distanceOfCenterPoint1" + distanceOfCenterPoint1);
        System.out.println("distanceOfCenterPoint2" + distanceOfCenterPoint2);

        Map<String, Long> result = new HashMap<>();
        result.put("distance Of Btw Points",distanceOfBtwPoints);
        result.put("distance to Center Point1",distanceOfCenterPoint1);
        result.put("distance to Center Point2",distanceOfCenterPoint2);

        return result;
    }

    public static void call() {
        Random rnd = new Random();
        List<Map<String,Integer>> points = new ArrayList<>();
        Map<String,Integer> point1= new HashMap<>();
        Map<String,Integer> point2= new HashMap<>();
//        Map<String,Integer> point3= new HashMap<>();
//        Map<String,Integer> point4= new HashMap<>();
//        Map<String,Integer> point5= new HashMap<>();

        point1.put("x",rnd.nextInt(100));
        point1.put("y",rnd.nextInt(100));
        point1.put("z",rnd.nextInt(100));
        point2.put("x",rnd.nextInt(100));
        point2.put("y",rnd.nextInt(100));
        point2.put("z",rnd.nextInt(100));
//        point3.put("x",rnd.nextInt(100));
//        point3.put("y",rnd.nextInt(100));
//        point3.put("z",rnd.nextInt(100));
//        point4.put("x",rnd.nextInt(100));
//        point4.put("y",rnd.nextInt(100));
//        point4.put("z",rnd.nextInt(100));
//        point5.put("x",rnd.nextInt(100));
//        point5.put("y",rnd.nextInt(100));
//        point5.put("z",rnd.nextInt(100));

        points.add(point1);
        points.add(point2);

        Map<String,Long> result = distancePoint(points);

        System.out.println(result);
    }
}
