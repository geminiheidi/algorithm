package sort;

public class Merge {
    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];

        for (int k = lo; k<=hi; k++) {
            if (i>mid) {
                a[k] = aux[j++];


            } else if (j>hi)  {
                a[k]=aux[i++];

            } else if (aux[i].compareTo(aux[j])<=0){
                 a[k]=aux[i];
                 i++;

            }
              else {
                 a[k]=aux[j];
                 j++;

            }

        }
    }

    public static void main (String[] args){
        String[] test={"M","E","R","G","E","S","O","R","T","E","X","A","M","P","L","E"};
        Merge.sort(test);
        for (String i : test) {
            System.out.print(i + ",");
        }
    }
}