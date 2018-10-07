//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.task01;

public class Point {
    int x;
    int y;

    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int temp = this.x;
        this.x = -this.y;
        this.y = -temp;
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow((double) (point.x - this.x), 2.0D) + Math.pow((double) (point.y - this.y), 2.0D));
    }

    public String toString() {
        return "(" + String.valueOf(this.x) + ", " + this.y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", this.x, this.y);
        System.out.println(pointToString);
    }
}
