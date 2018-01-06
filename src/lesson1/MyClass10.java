package lesson1;

public class MyClass10 {
    public static void main(String[] args){
        int score=80;
        switch(score){
            case 90:
                System.out.println("Very good");
                break;
            case 60:
            case 80:
                System.out.println("Fair good");
                break;
            case 40:
                System.out.println("Not good");
                break;
            default:
                System.out.println("The grades are not defined");
                break;
        }
    }
}
