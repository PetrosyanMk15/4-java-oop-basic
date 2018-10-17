package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point[] points = {new Point(1, 2), new Point(2, 2), new Point(5, 5.999)};
        PolygonalLine l = new PolygonalLine();
        l.setPoints(points);
        double length = l.getLength();
        System.out.println(length);
    }
}
