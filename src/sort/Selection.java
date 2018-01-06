package sort;

public class Selection
{

    public static void sort(Comparable[] a)
    {
        int N = a.length;
        for (int i=0; i<N; i++)
        {
            int min=i;
            for(int j=i+1; j<N; j++) {
                if (SortUtil.less(a[j], a[min])) min = j;
            }
            SortUtil.exch(a,i,min);

        }
    }

    public static void main(String[] args)
    {
        Integer[] test={7,2,1,7,93,386};
        Selection.sort(test);
        for (int i : test) {
            System.out.print(i + ",");
        }
    }
}
