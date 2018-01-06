package lesson1;

public class MyClass17 {
    public static void main(String[] args) {
        sayHello("Heidi");
        Add(5,26);
        int result=AddOn(1,2,4);
                System.out.println(result);
    }

    public static void sayHello(String name){
        System.out.println("Hello "+name);
    }

    public static void Add(int a, int b ){
        System.out.println(a+b);
    }

    public static int AddOn(int a, int b, int c){
        return (a+b+c);
    }
}
