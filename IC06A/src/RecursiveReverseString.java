
public class RecursiveReverseString {

	public static void main(String[] args) {
		
		

		String str1 = "Hello!";
		String str2 = "Orange Coast College";
		String str3 = "go";
		String str4 = "x";

		System.out.println("The reversed string of " + str1 + ": " + reverse(str1));
		System.out.println("The reversed string of " + str2 + ": " + reverse(str2));
		System.out.println("The reversed string of " + str3 + ": " + reverse(str3));
		System.out.println("The reversed string of " + str4 + ": " + reverse(str4));
		System.out.println("");
		
		System.out.println("The reversed string helper of " + str1 + ": " + reverse2(str2));
		System.out.println("The reversed string helper of " + str2 + ": " + reverse2(str2));
		System.out.println("The reversed string helper of " + str3 + ": " + reverse2(str3));
		System.out.println("The reversed string helper of " + str4 + ": " + reverse2(str4));
		System.out.println("");
		
		System.out.println("The reversed string of iteration " + str1 + ": " + reverse3(str2));
		System.out.println("The reversed string3 of iteration" + str2 + ": " + reverse3(str2));
		System.out.println("The reversed string3 of iteration" + str3 + ": " + reverse3(str3));
		System.out.println("The reversed string3 of iteration" + str4 + ": " + reverse3(str4));	
	}

	
	public static String reverse(String text) 
	{
		if(text.length() <= 1) {
			return text;
		}
		char first = text.charAt(0);
		return reverse(text.substring(1)) + first;
	}
	
	
	
	public static String reverse2(String text) 
	{
		
		return reverse(text, 0, text.length()-1);
		
	}
	
	//@overloading
	public static String reverse(String text, int start, int end) 
	{
		if(start > end) return ""; 
		if(start == end) return "" + text.charAt(start);
		
		char first = text.charAt(start);
		char last = text.charAt(end);
		
		return last + reverse(text, start +1, end -1) + first;
		
	}
	
	public static String reverse3(String text) {
		
		String ans = "";
		for(int i = text.length()-1; i >= 0; i--) {
			ans += text.charAt(i);
				
		}
		return ans;
	}
	
	
	
	
	
	public static String recursiveReverse(String input) {
		if(input.isEmpty()) 
		{
			return input;
		}
		else {
			return recursiveReverse(input.substring(1)) + input.charAt(0);
		}

	}
	
	public static String recursiveReverse2(String input, int start, int end) {
		
		
		return recursiveReverse(input.substring(1)) + input.charAt(start);
		
	}
}
