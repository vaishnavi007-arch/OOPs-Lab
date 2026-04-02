//Create an abstract class Shape with the following:
//- An abstract method area().
//- An abstract method perimeter().
//Then, implement two subclasses:
//- Circle (with radius as input).
//- Rectangle (with length and breadth as input).
//Write a program that:
//- Accepts user input for radius, length, and breadth.
//- Prints the area and perimeter for both shapes.

// Abstract class
abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }

    @Override
    double perimeter() {
        return 2 * (length + breadth);
    }
}

// Main class
public class AbstractionDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Circle Perimeter: " + c.perimeter());

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Rectangle Perimeter: " + r.perimeter());
    }
}