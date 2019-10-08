public class recursePractice

{

   public static void main(String[] args)

   { 

      System.out.println(recurse(3)); 
      System.out.println(fib(6));
      System.out.println(newCalc(15));
      System.out.println("new fib " +newFib(6));
      
      
     System.out.println("strange " +strangeCalc(2,3)); 
     System.out.println("new calc2 " +newCalc2(5)); 
     System.out.println("aquare " + square(7)); 
     System.out.println("fib4 " + fib3(4)); 
      
   }

 

   public static int recurse(int n)

   { 
      int total = 0;    

      if (n == 0)   

      {
    	
         return 0;

      }

      else    

      {
    	  
         total = 3 + recurse(n - 1);

      }

 
      return total;     

   } 

   
   
   
   public static long fib(int n)

   {
	    int count = 0;
      if (n <= 2) 

      {
    	  count++;
         return 1;

      }
  
      long fold = 1;

      long fold2 = 1;

      long fnew = 1;

      for (int i = 3; i <= n; i++)

      {
    	  count++;
         fnew = fold + fold2;

         fold2 = fold;

         fold = fnew;

      }
      System.out.println("count: " +count);
      return fnew;

   }
   
   public static int newCalc(int n)

   {

      if (n < 0)

      {

         return -1;

      }

      else if (n < 10)

      {

         return n;

      }

      else

      {

         return (1 + newCalc(n / 10));

      }

   }
   
   public static long newFib(int n)

   {

      if (n <= 3) 

      {

         return 1;

      }

      else 

      {

         return newFib(n - 1) + newFib(n - 2) + newFib(n - 3);

      }

   }
   
   
   public static int strangeCalc(int bottom, int top)

   {

      if (bottom > top)

      {

         return -1;

      }

      else if (bottom == top)

      {

         return 1;

      }

      else

      {

         return bottom * strangeCalc(bottom + 1, top);

      }

   }
   
   public static int newCalc2(int n)

   {

      if (n < 0)

      {

         return -1;

      }

      else if (n < 10)

      {

         return n;

      }

      else

      {

         return (n % 10) + newCalc(n / 10);

      }

   }
   
   
   public static int square(int n)

   {

      return square(n, n);

   }

    

   public static int square(int c, int n) 

   {

      if (c == 1)

      {

         return n;

      }

      else 

      {

         return square(c - 1, n);

      }

   }
   
   
   public static long fib3(int n)

   {

      if (n <= 2) 

      {

         return 1;  // line #1

      }

       

    	  else { return 2 * fib(n - 1) + 2 * fib(n - 2); }

   }
   
}