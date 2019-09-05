/**
 * CS 272 - Fall 2019
 * H01-Sequence.java
 */
package occ.cs272.h01;

/**
 * @author cyoungberg2
 * @version 08302019
 *
 */
public class Sequence
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "cyoungberg2";
    public static final String ASSIGNMENT = "H01-D";
    
    private int[] array;
    
    /**
     * Constructs a sequence of integers.
     * @param array the array to initialize the sequence.
     */
    public Sequence(int[] array)
    {
        this.array = array.clone();
    }
    
   public Sequence slice(int start) {
    	int[] result = new int[array.length-start];
    	int increment = 0;
       	
    	if(start < 0) {
    		for(int i = result.length-1; i > 0; i--) {
    			System.out.println(i);
    			result[increment] = array[i];
    			increment++;
    			}
    	}
    	else if(start >= 0) {
    		for(int i = start; i < array.length; i++) {
    			result[increment] = (array[i]);
    			increment++;
    		}
    	}
    	    	
    return new Sequence(result);}
   
    	
    public Sequence slice(int start, int end) {

    	 int[] slice = new int[end - start];
    	 int increment = 0;
    	for(int i = start; i<end; i++) 
    	{
    		slice[increment] = array[i];
    		increment++;
    	}
    	
    	  return new Sequence(slice);}
    	
    
   public Sequence slice(int start, int end, int step) {
	 
  	 int[] slice = new int[end - step];
  	 int increment = 0;
  	for(int i = start; i<end;) 
  	{
  		slice[increment] = array[i];
  		increment++;
  		i += step;
  	}
  	
    return new Sequence(slice);}
  	
   @Override
    public String toString()
    {
        String result = "{";
        if (array.length > 0)
        {
            result += array[0];
            for (int i = 1; i < array.length; i++)
            {
                result += ", " + array[i];
            }
        }
        return result + "}";
    }
    
    public static void main(String[] args)
    {
        Sequence a = new Sequence(new int[]{1, 2, 3, 4, 5});
        // some informal testing
       System.out.println("a.slice(0)->" + a.slice(0));
       System.out.println("a.slice(1)->" + a.slice(1));
       System.out.println("a.slice(-1)->" + a.slice(-1));
       //System.out.println("a.slice(-2)->" + a.slice(-2));
       System.out.println("a.slice(5)->" + a.slice(5));
      // System.out.println("a.slice(-5)->" + a.slice(-5));
       System.out.println("a.slice(0, 5, 2)->" + a.slice(0, 5, 2));
       System.out.println("a.slice(1, 5, 2)->" + a.slice(1, 5, 2));
       System.out.println("a.slice(1, 5, 3)->" + a.slice(1, 5, 3));
       System.out.println("a.slice(2, 5, 3)->" + a.slice(2, 5, 3));
      // System.out.println("a.slice(-1, -6, -1)->" + a.slice(-1, -6, -1));
    }
}
