
package lesson1;
import java.io.*;
import java.io.PrintWriter;
public class MyClass38 {
    public static void main(String[] args) {

        try{
        File file = new File("fileName.txt");

        if(!file.exists()) {

            file.createNewFile();
        }

        PrintWriter pw = new PrintWriter(file);
        pw.println("this is my file content");
        pw.println(100000);
        pw.close();
            System.out.println("Done");


            } catch (IOException e) {
                e.printStackTrace();
            }




    }
}
