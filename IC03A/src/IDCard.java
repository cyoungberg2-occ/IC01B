
public class IDCard extends Card{

	private String idNumber;
	
	public IDCard(String n, String id) {
		super(n);
		idNumber = id;
	}
	
	   public String format()
	   {
	      return super.format() + " ID Number: " + idNumber;	
	      
	   }
	   
	   public String getId(){
		   return idNumber;
	   }
	   
	   public boolean equals(Object otherObject)
	   {
	      IDCard other = (IDCard) otherObject;
	      return super.equals(otherObject) && getClass() == otherObject.getClass() && idNumber == other.getId();
	   }

	
}
