package org.example;

public class Water extends Environment<Swimmable>{
    @Override
    public void checkTraffic() {
        for(Swimmable swim : traffic ) {
            System.out.println(swim.getClass().getSimpleName() + " is swimming!");
        }

    }

    @Override
    public void checkVehicles() {
        for (Swimmable vehicle : traffic){
            if(vehicle instanceof  Vehicle) {
                System.out.println(vehicle.getClass().getSimpleName() + "is being driven");
            }
        }
    }
}
