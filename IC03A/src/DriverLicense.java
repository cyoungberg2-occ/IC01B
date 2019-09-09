
public class DriverLicense extends Card{

	private int expirationYear;
	
	public DriverLicense(String n, int expYear){
		super(n);
		expirationYear = expYear;
		
	}
	   public String format()
	   {
	      return "Card holder: " + super.getName();
	   }
}
