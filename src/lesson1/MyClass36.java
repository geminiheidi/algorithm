package lesson1;

public class MyClass36 {


    public static void main(String[] args) {
        int b[] = new int[2];

        try {

            //int a = 100/0;
            //System.out.println("value of b =" + b[3]);
            System.exit(1);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e){
            System.out.println("Catch called");
            System.out.println(e);
        } finally{

            System.out.println("finally called");
        }
    }
}