package ru.spbstu.main;

import ru.spbstu.main.shapes.Circle;
import ru.spbstu.main.shapes.Rectangle;
import ru.spbstu.main.shapes.Shape;
import ru.spbstu.main.shapes.Triangle;

import java.security.InvalidParameterException;

public class Main {
    public static void main(String[] args) {
        try {
            Circle circle1 = new Circle(10, 20, 30);
            System.out.println("circle1: "+ circle1.getX() + ";" + circle1.getY()+ "   " + circle1.getArea());

            Circle circle2 = new Circle(15, 24, 20);
            System.out.println("circle2: "+ circle2.getX() + ";" + circle2.getY()+ "   " + circle2.getArea());

            Circle circle3 = new Circle(10, 20, 40);
            System.out.println("circle3: "+ circle3.getX() + ";" + circle3.getY()+ "   " + circle3.getArea());

            Circle circle4 = new Circle(10, 20, 50);
            System.out.println("circle4: "+ circle4.getX() + ";" + circle4.getY()+ "   " + circle4.getArea());

            Rectangle rectangle1 = new Rectangle(10, 20, 40, 30);
            System.out.println("rectangle1: "+ rectangle1.getX() + ";" + rectangle1.getY()+ "   " + rectangle1.getArea());

            Rectangle rectangle2 = new Rectangle(15, 20, 90, 30, 10);
            System.out.println("rectangle2: "+ rectangle2.getX() + ";" + rectangle2.getY()+ "   " + rectangle2.getArea());

            Rectangle rectangle3 = new Rectangle(10, 25, 50, 30, 60);
            System.out.println("rectangle3: "+ rectangle3.getX() + ";" + rectangle3.getY()+ "   " + rectangle3.getArea());

            Triangle triangle1 = new Triangle(10, 10, 20, 20, 30, 10);
            System.out.println("triangle1: "+ triangle1.getX() + ";" + triangle1.getY()+ "   " + triangle1.getArea());

            Triangle triangle2 = new Triangle(10, 10, 24, 24, 14, 32);
            System.out.println("triangle2: "+ triangle1.getX() + ";" + triangle2.getY()+ "   " + triangle2.getArea());

            Triangle triangle3 = new Triangle(18, 13, 20, 20, 10, 30, 100);
            System.out.println("triangle3: "+ triangle3.getX() + ";" + triangle3.getY()+ "   " + triangle3.getArea());

            Shape[] shapes = new Shape[]{
                    circle1, circle2, circle3, circle4, rectangle1, rectangle2, rectangle3, triangle1, triangle2, triangle3
            };
            Shape biggestShape = findBiggestShape(shapes);
            System.out.println("Biggest shape area: " + biggestShape.getArea());
        } catch (InvalidParameterException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private static Shape findBiggestShape(Shape[] shape_array) {
        if (shape_array == null) {
            throw new InvalidParameterException("Invalid array of shapes!");
        }
        if (shape_array.length == 0) {
            throw new InvalidParameterException("Array of shapes is empty!");
        }
        Shape biggestShape = shape_array[0];
        if (shape_array.length == 1) {
            return biggestShape;
        }
        for (Shape shape : shape_array) {
            if (shape.getArea() > biggestShape.getArea()) {
                biggestShape = shape;
            }
        }
        return biggestShape;
    }
}
