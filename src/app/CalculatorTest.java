package app;

import model.ShapeCalculator;

/**
 * Created by Helmut on 2017-03-18.
 */
public class CalculatorTest {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double triangle = shapeCalculator.circutTriangle(4.6, 5.8, 9.6);
        double square = shapeCalculator.squareBox(7);
        double circle = shapeCalculator.squareCircle(9.6);
        double rectangle = shapeCalculator.circutRectangle(6.9, 8.5);

        System.out.println("obwód trójkąta: " + triangle);
        System.out.println("pole kwadratu: " + square);
        System.out.println("obwód prostokąta: " + rectangle);
        System.out.println("pole koła: " + circle);

    }
}
