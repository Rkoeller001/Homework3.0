package CircleRadius;
//Circle class with the following instance variables and methods
//instance variable/property : radius;
//method: calculateArea
//Create a circle object in main and call the method on it

public class RadiusCircle {
    private double PI;
    private double Radius;



    public RadiusCircle(double PI,double Radius){
    this.PI = Math.PI;
    this.Radius = Radius;

    }

    public void CalculateRadius(){

        System.out.println(PI * Radius * Radius);


    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    @Override
    public String toString() {
        return "RadiusCircle{" +
                "PI=" + PI +
                ", Radius=" + Radius +
                '}';
    }
}
