package org.example;

public class Sky extends Environment<Flyable> {

    @Override
    public void checkTraffic() {
       for(Flyable flyable : traffic ) {
           System.out.println(flyable.getClass().getSimpleName() + " is flying!");
       }

    }

    @Override
    public void checkVehicles() {
        for (Flyable vehicle : traffic){
            if(vehicle instanceof  Vehicle) {
                System.out.println(vehicle.getClass().getSimpleName() + " is flying");
            }
        }

    }
}
