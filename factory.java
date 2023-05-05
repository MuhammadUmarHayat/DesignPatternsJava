// Define a common interface for creating objects
interface Shape {
    void draw();
}

// Create a concrete class that implements the interface and provides a default implementation for the creation method
class ShapeFactory {
    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        } else {
            return null;
        }
    }
}

// Create one or more concrete classes that extend the factory class
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square...");
    }
}

// The client code calls the factory method on the factory object, passing in a parameter that specifies the type of object to be created
public class FactoryPatternExample 
{
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("Circle");
        Shape rectangle = shapeFactory.createShape("Rectangle");
        Shape square = shapeFactory.createShape("Square");

        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
