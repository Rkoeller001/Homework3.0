package RidingBike;

//Create a Bicycle Class
//        instance variable/property : cadence;
//        instance variable/property : gear;
//        instance variable/property : speed;
//
//        method1: applyBrake, takes in a speed amount and reduces the current speed by the speed amount inputed into your method when used
//
//        method2: speedUp, takes in a speed amount and increases the current speed by the speed amount inputed into your method when used
//
//        Create a Bike object and use each method on it
public class BikeRide {
    public String cadence;
    public double gear;
    public double speed;

    public BikeRide(String cadence, double gear, double speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBrake(){
        System.out.println(speed - gear);

    }
    public void speedUp(){
        System.out.println(speed + speed);

    }

    @Override
    public String toString() {
        return "BikeRide{" +
                "cadence='" + cadence + '\'' +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
