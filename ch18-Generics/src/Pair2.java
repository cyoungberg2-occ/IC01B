/**
   This class currently collects a pair of elements of different types.
   
   TODO:
   1) Modify this class so that it collects a pair or elements of the same type.
   2) Add a swap() function that swaps the first and the second.
*/
public class Pair2<T, S>
{
   private T first;
   private S second;

   /**
      Constructs a pair containing two given elements.
      @param firstElement the first element
      @param secondElement the second element
   */
   public Pair2(T firstElement, S secondElement)
   {
      first = firstElement;
      second = secondElement;
   }

   /**
      Gets the first element of this pair.
      @return the first element
   */
   public T getFirst() { return first; }

   /**
      Gets the second element of this pair.
      @return the second element
   */
   public S getSecond() { return second; }


   /**
    * Swaps the two elements of the pair   
    */
   public void swap()
   {
      //TODO: complete method 
      
   }
   
   public String toString() { return "(" + first + ", " + second + ")"; }
}
