package RidingBike;

public class BikeRideTest {
    public static void main(String[] args) {
    BikeRide BikeRide1 = new BikeRide ("speed up",8.00,40.00);
        System.out.println(BikeRide1);
        BikeRide1.speedUp();
     BikeRide Bikeride2 = new BikeRide("Slow Down",1.00,15.00);
        System.out.println(Bikeride2);
        Bikeride2.applyBrake();

    }
}
