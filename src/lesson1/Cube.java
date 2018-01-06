package lesson1;

public class Cube {
    int length;
    int bredth;
    int height;

    public int getCubeVolume(){
        return(length*bredth*height);
    }

    // Cube() is a constructor, it never returns any value.
    Cube(){
        length=10;
        bredth=20;
        height=30;

    }

    Cube(int l, int b, int h){
        length=l;
        bredth=b;
        height=h;
    }
}
