package ch7v2;

import java.awt.*;

public class Ex7_23 {
    static double sumArea(Shape[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].calcArea();
        }

        return sum;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rect(3, 4), new ch7v2.Circle(1)};
        System.out.println("면적의 합"+sumArea(arr));
    }
}


abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }


}

class Rect extends Shape {
    double width;
    double height;

    Rect(double width, double height) {
        this(new Point(0, 0), width, height);
    }

    public Rect(Point p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    boolean isSquare() {
        return width * width != 0 && width == height;
    }

    double calcArea() {
        return width * height;
    }
}


class Circle extends Shape {

    double r;

    Circle(double r) {
        this(new Point(0, 0), r);
    }

    Circle(Point p, double r) {
        super(p);
        this.r = r;
    }

    double calcArea() {
        return Math.PI * r * r;
    }
}




class Point {
    int x;
    int y;

    Point() {
        this(0,0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + x + "]";
    }
}
