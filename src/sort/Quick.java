package sort;

public class Quick {
    public static void sort(Comparable[] a) {
        //StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable [] a, int lo, int hi) {
        int i = lo + 1;
        int j = hi;
        while (true) {
            while (SortUtil.less(a[++i],a[lo]))  if(i==hi) break;
            while (SortUtil.less(a[lo],a[--j])) if(j==lo) break;
            if(i>=j) break;
            exch(a,i,j);
        }
        exch(a, lo, j);
        return j;
    }

    public static void exch(Comparable[] a, int x, int y) {
        Comparable z = a[x];
        a[x] = a[y];
        a[y] = z;

    }

    public static void main (String[] args) {
        String[] test = {"Q", "U", "I", "C", "K", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        Quick.sort(test);
        for (String i : test) {
            System.out.print(i + ",");
        }
    }
    /*
    This is my practice for comment.
     */
}