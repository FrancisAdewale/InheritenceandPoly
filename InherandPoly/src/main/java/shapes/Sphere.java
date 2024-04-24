package shapes;

public class Sphere extends Shape3D{
    Circle base;

    public Sphere(Circle base) {

    }
        @Override
        public double calculateVolume() {
            return (double)4/(double)3 * 3.14 * ((Math.sqrt(base.calculateArea()/3.14)));
        }

}
