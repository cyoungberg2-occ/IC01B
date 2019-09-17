public class Card
{
   private String name;

   public Card()
   {
      name = "";
   }

   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {
      return false;
   }

   public String format()
   {
      return "Card holder: " + name;
   }
   
   //@override
   public boolean equals(Object otherObject)
   {
      Card other = (Card) otherObject;
      return name.equals(other.name) && getClass() == otherObject.getClass();
   }

}
