package shapes;

public class Cylinder extends Shape3D{
    double height;


    public Cylinder(Circle base, double height) {
        this.height = height;

    }

    @Override
    public double calculateVolume() {
        return base.calculateArea() * height;
    }

}
