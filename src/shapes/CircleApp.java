package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("What is the radius of this circle (0 to 1000)?");
        double radius = input.getDouble(0,1000);
        Circle ourFunCircle = new Circle(radius);
        System.out.printf("Area of circle = %f%n", ourFunCircle.getArea());
        System.out.printf("Circumference of circle = %f%n", ourFunCircle.getCircumference());
    }
}