package shapes;

public class Cone extends Shape3D{
    double height;

    public Cone(Circle base, double height) {
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return ((base.calculateArea() * height)/3);
    }
}
