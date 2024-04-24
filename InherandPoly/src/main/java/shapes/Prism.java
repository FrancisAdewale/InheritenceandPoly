package shapes;

public class Prism extends Shape3D{
    double height;

    public Prism(Shape base, double height) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        return base.calculateArea() * height;
    }
}
