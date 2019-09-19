package TrianglePerimeter;

public class TrianglePerTest {
    public static void main(String[] args) {
    TrianglePer triangle1 = new TrianglePer(3.0f,12.0f,2.0f);
        System.out.println(triangle1);
        triangle1.setA(30.0f);
        triangle1.setB(12.0f);
        triangle1.setC(20.0f);
        triangle1.CalculatePerimeter();
    }

}
