package areaOfSquare;
//Square class with the following instance variables and methods
//instance variable/property : length;
//method: calculateArea
//Create a square object in main and call the method on it

public class SquareArea {
    public double length;
    public double width;

    public  SquareArea(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void CalculateArea() {
        System.out.println(length * width);
    }

    @Override
    public String toString() {
        return "SquareArea{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
