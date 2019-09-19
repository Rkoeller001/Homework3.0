package areaOfSquare;
//Square class with the following instance variables and methods
//instance variable/property : length;
//method: calculateArea
//Create a square object in main and call the method on it

public class SquareArea {
    private double length;
    private double width;

    public  SquareArea(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void CalculateArea() {
        System.out.println(length * width);
    }


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "SquareArea{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
