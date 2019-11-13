import java.util.Scanner;

/**
   This program measures how long it takes to sort an
   array of a user-specified size with the selection
   sort algorithm for multiple instances 

 */
public class SelectionSourceCountDemo
{  
	public static void main(String[] args)
	{  
		
		Scanner in = new Scanner(System.in);
		//System.out.print("Enter array size: ");
	    //int n = in.nextInt();
	    int size = 1;
		//for(int size = 1; size <= 9; ++size) {
			int[] a = ArrayUtil.randomIntArray(size*10000, size*100);

			// Use stopwatch to time selection sort
			

	        StopWatch timer = new StopWatch();

	        timer.start();
	    	        
			SelectionSorter.restcCount();

			SelectionSorter.sort(a);
			timer.stop();

			System.out.println(a.length + " Elements. Comparisons made: " 
				+ SelectionSorter.getcCount());
			//System.out.println(timer.getElapsedTime());
			//timer.reset();
	//	}
	}
}


