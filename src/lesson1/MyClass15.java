package lesson1;

public class MyClass15 {
    public static void main(String[] args){
        String myString ="Hello World";
        String myStringinLowerCase= myString.toLowerCase();
        String myStringinUpperCase= myString.toUpperCase();

        System.out.println(myStringinLowerCase);
        System.out.println(myStringinUpperCase);
        System.out.println(myString.replace('e','a'));
    }

}
