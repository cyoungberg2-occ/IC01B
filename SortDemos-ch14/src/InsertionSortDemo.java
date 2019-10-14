import java.util.Arrays;

/**
   This program demonstrates the insertion sort algorithm.
 */
public class InsertionSortDemo
{  
    public static void sort(int[] a)
    {  
        int[] z = ArrayUtil.randomIntArray(20, 100);
        System.out.println(Arrays.toString(z));

        InsertionSorter.sort(z);

        System.out.println(Arrays.toString(z));
    }
}
