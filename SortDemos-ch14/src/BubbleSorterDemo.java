
public class BubbleSorterDemo {

	public static void main(String[] args) {

	
	
		for(int size = 1; size <= 9; ++size) {
			int[] y = ArrayUtil.randomIntArray(size*10000, size*100);
		BubbleSorter.sort(y);

		System.out.println("Sorted array"); 
		//printArray(y); 
		
		System.out.println(y.length + " Elemetns. Comparisons made: " 
				+ BubbleSorter.getcCount());
		}
	}

	private static void printArray(int[] y) {
		int length = y.length; 
		for (int i=0; i<length; ++i) 
			System.out.print(y[i] + " "); 
		System.out.println(); 
	}
}

