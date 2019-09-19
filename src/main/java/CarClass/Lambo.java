package CarClass;

public class Lambo {
    private String name;
    private double speed;

    public Lambo(String name, double speed){
        this.name = name;
        this.speed = speed;
    }

    public static double whatsTheSpeed(){
        System.out.println();
        return 50.00;
    }

    private static String whatsTheCarName(){
        System.out.println(whatsTheSpeed());
        return whatsTheCarName();
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lambo{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
