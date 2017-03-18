package model;

/**
 * Created by Helmut on 2017-03-18.
 */
public class ShapeCalculator {
   private double a;
    private double b;
    private double c;
    private double r;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double squareBox(double a) {
        double square = a * a;
        return square;
    }

    public double squareCircle(double r) {
        double circle = 2 * 3.14 * r;
        return circle;
    }

    public double circutTriangle(double a, double b, double c) {
        double triangle = a + b + c;
        return triangle;
    }

    public double circutRectangle(double a, double b) {
        double rectangle = 2*a+2*b;
        return rectangle;
    }
}


