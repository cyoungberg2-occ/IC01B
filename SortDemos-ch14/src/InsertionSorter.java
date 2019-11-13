/**
   The sort method of this class sorts an array, using the insertion 
   sort algorithm.
 */
public class InsertionSorter
{
    /**
      Sorts an array, using insertion sort.
      @param a the array to sort
     */
	
	public static long cCount=0;
	public static void restcCount() {
		cCount = 0;
	}
	public static long getcCount() {
		return cCount;
	}
	public static void cCountInc() {
		cCount++;
	}
		
	
    public static void sort(int[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            int next = a[i];
            // Move all larger elements up
            int j = i;
        
            while (j > 0 && a[j - 1] > next)
            {
                a[j] = a[j - 1];
                j--;
                cCountInc();
            }
            // Insert the element
            a[j] = next;
        }
    }
}
