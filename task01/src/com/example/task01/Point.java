package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(){
    }

    void flip () {
        int a = this.x;
        this.x = -this.y;
        this.y = -a;
    }

    double distance(Point p) {
        double xProjection = p.x - this.x;
        double yProjection = p.y - this.y;
        return Math.sqrt(xProjection * xProjection + yProjection * yProjection);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
