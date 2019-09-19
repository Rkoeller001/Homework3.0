package TrianglePerimeter;

public class TrianglePer {
    private float a;
    private float b;
    private float c;

    public TrianglePer(float a,float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void CalculatePerimeter(){
        System.out.println(a + b + c);
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setA(float a) {
        this.a = a;
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
