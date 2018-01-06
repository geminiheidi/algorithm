package sort;

public class SortUtil {
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

}
