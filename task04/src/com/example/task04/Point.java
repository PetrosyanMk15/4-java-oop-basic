package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point flip() {
        return new Point(-this.y, -this.x);
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow((double) (point.x - this.x), 2) + Math.pow((double) (point.y - this.y), 2));
    }

    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }

    void print() {
        String pointToString = this.toString();
        System.out.println(pointToString);
    }
}