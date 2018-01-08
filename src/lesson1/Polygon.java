package lesson1;

abstract public class Polygon {
    protected int height;
    protected int width;

    public void set_values(int a, int b){
        height = a;
        width = b;
    }

    abstract public double area();
}
