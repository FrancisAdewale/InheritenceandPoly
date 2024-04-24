package vehicles;

public class Main {
    public static void main(String[] args) {
        Car volvo = new Car("volvo", "model x");
        Car lambo = new Car("lambourghini", "model 5" );

        Motorcycle redMotorbike = new Motorcycle("ducati", "fastest model", true);

        volvo.start();
        volvo.drive();

        redMotorbike.start();
        redMotorbike.drive();
    }
}
