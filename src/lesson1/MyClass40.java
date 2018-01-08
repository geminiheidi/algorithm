package lesson1;
import java.util.Date;
import java.text.*;
public class MyClass40 {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());
        System.out.println(date.getMonth());
        System.out.println(date.getDay());

        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH-mm-ss");
        System.out.println(sdf.format(date));
    }

}
