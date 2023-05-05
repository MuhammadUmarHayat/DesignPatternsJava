public interface Shape 
{
    void draw();
}

public class Circle implements Shape 
{
    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle");
    }
}

public class Square implements Shape 
{
    private Color color;

    public Square(Color color) 
    {
        this.color = color;
    }

    @Override
    public void draw() 
    {
        System.out.println("Drawing a " + color + " square");
    }
}
public interface Color 
{
    String getColor();
}
public class Red implements Color {
    @Override
    public String getColor() {
        return "red";
    }
}

public class Blue implements Color {
    @Override
    public String getColor() {
        return "blue";
    }
}

public class ShapeColorBridge {
    private final Shape shape;
    private final Color color;

    public ShapeColorBridge(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    public void draw() {
        shape.draw();
        System.out.println("Color: " + color.getColor());
    }
}

// main
Shape circle = new Circle(new Red());
ShapeColorBridge redCircle = new ShapeColorBridge(circle, new Red());
redCircle.draw();

Shape square = new Square(new Blue());
ShapeColorBridge blueSquare = new ShapeColorBridge(square, new Blue());
blueSquare.draw();
