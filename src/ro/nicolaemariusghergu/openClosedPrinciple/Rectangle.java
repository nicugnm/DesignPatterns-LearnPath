package ro.nicolaemariusghergu.openClosedPrinciple;

public class Rectangle implements Shape {

    public double length;

    public double width;

    @Override
    public double calculateArea() {
        return length * width;
    }
}

interface Shape {

    public double calculateArea();
}

class AreaCalculator {
    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
}

class Circle implements Shape {

    public double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
