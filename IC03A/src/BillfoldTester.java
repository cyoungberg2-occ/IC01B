
public class BillfoldTester {

	
	public static void main(String[] args){
		DriverLicense d = new DriverLicense("John Doe", 2007);
		CallingCard c = new CallingCard("Omega Card", "01234567", "1234");
		BillFold b = new BillFold(d, c);
		System.out.println(b.formatCards());
		
		Card test = new Card("Courtney Y");
		Card pest = new Card("Courtney");
		System.out.println(test.equals(pest));
		
		IDCard cat = new IDCard("Courtney Y", "12345");
		IDCard tat = new IDCard("Courtney Y", "1234");
		System.out.println(cat.equals(tat));
				
		
	}
}
