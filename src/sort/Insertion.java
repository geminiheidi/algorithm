package sort;

public class Insertion {
    public static void sort(Comparable[] a){
        int N=a.length;
        for (int i=1; i<N ; i++){
            for(int j= i; j>0 && less(a[j],a[j-1]);j--)
                exch(a,j,j-1);
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

    public static void main(String[] args){
        String[] test={"heidi","bb","luke"};
        Insertion.sort(test);
        int N=test.length;
        for (int i=0; i<N; i++){
           System.out.println(test[i] +",");
        }
    }


}
