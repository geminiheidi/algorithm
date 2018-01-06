package lesson1;

public class MyClass13 {
    public static void main(String[] args) {
        int[] myintarray = {1, 3, 2, 4, 5};
        int index = 0;
        while (index < myintarray.length) {
            System.out.println(myintarray[index++]);
        }

        System.out.println("..........................");

        for (int element:myintarray){
            System.out.println(element);
        }
    }
}
