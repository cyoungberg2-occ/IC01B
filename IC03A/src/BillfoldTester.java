
public class BillfoldTester {

	
	public static void main(String[] args){
		DriverLicense d = new DriverLicense("John Doe", 2007);
		CallingCard c = new CallingCard("Omega Card", "01234567", "1234");
		BillFold b = new BillFold(d, c);
		System.out.println(b.formatCards());
				
		
	}
}
