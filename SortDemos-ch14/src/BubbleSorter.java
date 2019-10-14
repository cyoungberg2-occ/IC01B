/**
   The sort method of this class sorts an array,
   using the bubble sort algorithm.
 */
public class BubbleSorter
{

	/**
       Sorts an array, using bubble sort.
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
		int length = a.length; 
		for (int i = 0; i < length-1; i++) {

			for (int j = 0; j < length-i-1; j++) {
				cCountInc();
				if (a[j] > a[j+1]) 
				{ 
					int temp = a[j]; 
					a[j] = a[j+1]; 
					a[j+1] = temp; 
				} 
			}
		}
	}

}

