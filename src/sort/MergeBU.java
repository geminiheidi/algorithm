package sort;

public class MergeBU {
    private static Comparable[] aux;
    public static void sort(Comparable[] a){
        int N=a.length;
        aux=new Comparable[N];
        for (int sz=1; sz<N; sz=sz+sz)
            for (int lo=0; lo<N-sz; lo+=sz)
                merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1,N-1));

    }

    public static void merge(Comparable[] a, int lo, int mid, int hi){
        for (int k=lo; k<=hi; k++ ){
            aux[k]=a[k];
        }
        int i=lo; int j=mid+1;
        for (int k=0; k<=hi; k++) {
            if (i>mid) a[k]=aux[j++];
            else if (j>hi) a[k]=aux[i++];
            else if (aux[i].compareTo(aux[j])<=0) {a[k]=aux[i]; i++;}
            else {a[k]=aux[j];j++;}

        }
    }

    public static void main (String[] args) {
        String[] test = {"M", "E", "R", "G", "E", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        Merge.sort(test);
        for (String i : test) {
            System.out.print(i + ",");
        }
    }
}