
public class DriverLicense extends Card{

	private int expirationYear;
	
	public DriverLicense(String n, int expYear){
		super(n);
		expirationYear = expYear;
		
	}
	   public String format()
	   {
	      return super.format() + " Expiration year: " + expirationYear;
	      
	   }
	   
	   public int getExpiration() {
		   return expirationYear;
	   }
	   
	   public boolean equals(Object otherObject)
		{
		   DriverLicense other = (DriverLicense) otherObject;
			return super.equals(otherObject) && getClass() == otherObject.getClass() && expirationYear == other.getExpiration();
		}
}
