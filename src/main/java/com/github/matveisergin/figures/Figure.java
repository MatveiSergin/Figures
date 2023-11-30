package main.java.com.github.matveisergin.figures;

import java.util.List;

public class Figure {
    public List<Point> points;

    public Figure(List<Point> point) {
        this.points = point;
    }

    public boolean validate() {
        System.out.println("The figure is figure");
        return true;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}

