package CircleRadius;

public class RadiusTest {
    public static void main(String[] args) {
        RadiusCircle circle1 = new RadiusCircle(3.14,12.00);
        System.out.println(circle1);
        circle1.setPI(Math.PI);
        circle1.setRadius(9.00);
        circle1.CalculateRadius();
    }
}
