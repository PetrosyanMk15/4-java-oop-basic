package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(5, 6);
        Line line = new Line(p1,p2);
        Point p3 = new Point(7, 8);
        Point p4 = new Point(30, 40);

        System.out.println("Отрезок: " + line.toString());

        if (line.isCollinearLine(p3)) {
            System.out.println("Точка p3 лежит на отрезке line");
        }

        if (!line.isCollinearLine(p4)) {
            System.out.println("Точка p4 не лежит на отрезке line");
        }
    }
}
