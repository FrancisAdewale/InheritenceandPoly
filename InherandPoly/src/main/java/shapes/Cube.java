package shapes;

public class Cube extends Shape3D{

    // this wrong?
    public Cube(double size) {
        this(new Rectangle(size, size));
    }

    private Cube(Rectangle base) {
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        return base.calculateArea() * Math.sqrt(base.calculateArea());
    }
}
