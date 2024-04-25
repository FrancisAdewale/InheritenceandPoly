package org.example;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sky sky = new Sky();
        sky.addTraffic(new Duck());
        sky.addTraffic(new Pigeon());
        sky.addTraffic(new Aeroplane());

        Water water = new Water();
        water.addTraffic(new Duck());
        water.addTraffic(new Fish());

        Road road = new Road();
        road.addTraffic(new Car());
        road.addTraffic(new Van());
        road.addTraffic(new Lorry());

        List<Environment<?>> environments = List.of(sky, water, road);

        for (Environment<?> environment: environments) {
//            environment.checkTraffic();
            environment.checkVehicles();
        }

    }

}
