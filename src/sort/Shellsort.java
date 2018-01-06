package sort;

public class Shellsort {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {

                    exch(a, j, j - h);


                }
                h = h / 3;
            }
        }

    }
    public static boolean less(Comparable a, Comparable b){
        if (a.compareTo(b)<0)
            return true;
        else return false;
    }

    public static void exch(Comparable[] a, int x, int y){
        Comparable z= a[x];
        a[x]=a[y];
        a[y]=z;
    }

    public static void main(String[] args)
    {
        String[] test={"S","O","R","T","E","X","A","M","P","L","E"};
        Shellsort.sort(test);
        for (String i : test) {
            System.out.print(i + ",");
        }
    }

}

