package com.example.task05;

import java.util.*;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> polyLine = new ArrayList<Point>();

    public PolygonalLine(){

    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        
        this.points.clear();
        
        for (Point elem : points) {
            this.addPoint(new Point(elem.getX(), elem.getY()));
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

        double Length = 0;
        Iterator<Point> it = polyLine.iterator();
        Point current = null;
        Point next = null;

        while (it.hasNext()) {

            next = it.next();
            if (current != null)
                Length += current.getLength(next);

            current = next; // Save what was the "next" as the next "current".
        }

        return Length;
    }

}
