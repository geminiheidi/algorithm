package sort;

public class Quick3way {
    private static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi<=lo) return;
        int lt=lo, i=lo+1, gt=hi;
        Comparable v=a[lo];
        while (i<=gt){
            int cmp=a[i].compareTo(v);
            if(cmp<0) SortUtil.exch(a, lt++, i++);
            else if (cmp>0) SortUtil.exch(a,i,gt--);
            else i++;
        }
        sort(a, lo, lt-1);
        sort(a, gt+1, hi);
    }
    public static void main (String[] args) {
        String[] test = {"R", "B", "W", "W", "R", "W", "B", "R", "R", "W", "B", "R"};
        Quick3way.sort(test,0,test.length-1);
        for (String i : test) {
            System.out.print(i + ",");
        }
    }
}
