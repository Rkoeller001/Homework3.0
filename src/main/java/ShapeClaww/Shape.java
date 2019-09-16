package ShapeClaww;

public class Shape {
    public double Length;
    public double Width;

    public Shape(double Length, double Width){
        this.Length = Length;
        this.Width = Width;
    }
    public void calculateAreaMethod(){
        System.out.println(Length * Width);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "Length=" + Length +
                ", Width=" + Width +
                '}';
    }
}
