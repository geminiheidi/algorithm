package lesson1;

import java.util.*;

public class MyClass35 {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<String> ();
        name.add("Heidi");
        name.add("Luke");
        name.add("Jackson");

        Iterator<String> itr = name.iterator();

        while(itr.hasNext())
            System.out.println(itr.next());

    }
}
