package lesson1;
import java.util.ArrayList;
import java.util.LinkedList;
public class MyClass31 {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer> (5);

        myList.add(1);
        myList.add(76);
        myList.add(21);


        for (int x: myList)
            System.out.println(x);

        System.out.println("size = "+ myList.size());
        myList.remove(2);

        for (int x: myList)
            System.out.println(x);

        System.out.println("size = "+ myList.size());

        myList.set(0,177);

        for (int x: myList)
            System.out.println(x);

        LinkedList<String> name = new LinkedList<String>();
        name.add("Heidi");
        name.add("tom");
        name.add("john");

        for(String x:name)
            System.out.println(x);

        //deletion and insertion: LinkedList is better
        //search:ArrayList is better


    }
}
