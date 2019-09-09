// TODO: implement toString

public class LabeledPoint
{
   private double x;
   private double y;
   private String label;

   /**
      Constructs a labeled point with a given position and label.
      @param anX the x-coordinate of the point
      @param aY the y-coordinate of the point
      @param aLabel the label of the point
   */
   public LabeledPoint(double anX, double aY, String aLabel)
   {
      x = anX;
      y = aY;
      label = aLabel;
   }

   public static boolean check(double x1, double y1, String s1, double x2, double y2, String s2)
   {
      LabeledPoint lp1 = new LabeledPoint(x1, y1, s1);
      LabeledPoint lp2 = new LabeledPoint(x2, y2, s2);
      return lp1.equals(lp2);
   }
   
   public boolean equals() {
	   if(lp1.equals(lp2) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   
   public String toString(){
      return "LabeledPoint[x=" + x + ",y=" + y + ",label=" + label + "]";
   }

   public static String check(double x, double y, String s)
   {
      LabeledPoint lp = new LabeledPoint(x, y, s);
      return lp.toString();
   }
}