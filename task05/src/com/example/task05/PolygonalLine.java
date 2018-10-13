package com.example.task05;

import java.util.*;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> polyLine = new ArrayList<Point>();

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {

        for (int i = 0; i < points.length; i++) {
            this.addPoint(new Point(points[i].getX(), points[i].getY()));
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        this.polyLine.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        this.addPoint(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        // TODO: реализовать
        double Length = 0;
        // throw new AssertionError();
        for (int i = 0; i < this.polyLine.size() - 1; i++) {
            Length += this.polyLine.get(i).getLength(this.polyLine.get(i + 1));
        }
        return Length;
    }

}
