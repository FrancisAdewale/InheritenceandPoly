package shapes;

public class Circle extends Shape{
    Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
    return 3.14 * radius * radius;
    }
}
