package org.example;

public class Road extends Environment<Driveable>{

    @Override
    public void checkTraffic() {
        for(Driveable driveable : traffic ) {
            System.out.println(driveable.getClass().getSimpleName() + "is being driven");
        }
    }

    @Override
    public void checkVehicles() {
        for (Driveable vehicle : traffic){
            if(vehicle instanceof  Vehicle) {
                System.out.println(vehicle.getClass().getSimpleName() + "is being driven");
            }
        }

    }
}
