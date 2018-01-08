package lesson1;

public class MyClass22 {
    public static void main(String[] args){
        Student mark = new Student();
        System.out.println(mark.getNoOfStudents());

        Student tom = new Student();
        System.out.println(tom.getNoOfStudents());
        System.out.println(Student.getNoOfStudents());

        Hello hel = new Hello();
        //hel.number = 20;
        // A final variable can only be initialized once

    }

}
