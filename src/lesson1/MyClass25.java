package lesson1;

public class MyClass25 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();
        Polygon rec1 = new Rectangle();

        rec.set_values(10,20);
        tri.set_values(15,19);
        rec1.set_values(60,2);

        System.out.println("Area of Rectangle =" +rec.area());
        System.out.println("Area of Triangle =" +tri.area());
        System.out.println("Area of Rectangle =" +rec1.area());
    }
}
