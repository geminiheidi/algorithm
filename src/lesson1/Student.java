package lesson1;

public class Student {

    static int NoOfStudents=0;

    Student (){
        NoOfStudents++;
    }

    public static int getNoOfStudents(){
        return NoOfStudents;
    }


        int id;

        public int getId(){
            return id;
        }

        public void setId(int id){
            this.id=id;
        }

        String name;

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name= name;
        }

        int age;

        public int getAge(){
            return age;
        }

        public void setAge(int age){
            this.age=age;
        }


}
