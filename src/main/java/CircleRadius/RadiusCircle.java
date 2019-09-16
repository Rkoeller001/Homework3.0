package CircleRadius;
//Circle class with the following instance variables and methods
//instance variable/property : radius;
//method: calculateArea
//Create a circle object in main and call the method on it

public class RadiusCircle {
    public double PI;
    public double Radius;



    public RadiusCircle(double PI,double Radius){
    this.PI = Math.PI;
    this.Radius = Radius;

    }

    public void CalculateRadius(){

        System.out.println(PI * Radius * Radius);


    }

    @Override
    public String toString() {
        return "RadiusCircle{" +
                "PI=" + PI +
                ", Radius=" + Radius +
                '}';
    }
}
