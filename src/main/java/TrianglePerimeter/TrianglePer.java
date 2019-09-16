package TrianglePerimeter;

public class TrianglePer {
    public float a;
    public float b;
    public float c;

    public TrianglePer(float a,float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void CalculatePerimeter(){
        System.out.println(a + b + c);
    }

    @Override
    public String toString() {
        return "TrianglePer{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
