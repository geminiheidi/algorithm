package lesson1;

import java.util.ArrayList;
import java.util.ListIterator;

public class MyClass34 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Heidi");
        names.add("Jackson");
        names.add("Luke");

        ListIterator<String> itr = names.listIterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        while(itr.hasPrevious())
            System.out.println(itr.previous());
    }
}
