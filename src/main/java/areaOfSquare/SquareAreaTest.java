package areaOfSquare;


import ShapeClaww.ShapeTest;

public class SquareAreaTest {
    public static void main(String[] args) {
        SquareArea firstSquare = new SquareArea(20.00,30.00);
        System.out.println(firstSquare);
        firstSquare.setLength(30);
        firstSquare.setWidth(40);
        firstSquare.CalculateArea();
    }



}
