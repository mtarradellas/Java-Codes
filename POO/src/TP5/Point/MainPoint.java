package TP5.Point;

public class MainPoint {
    public static void main(String[] args){
        Point p1 = new Point(2, 1);
        Point p2 = new Point(2, 1);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1 instanceof Object);
        System.out.println(p1);
    }
}
