package occ.cs272.h04;

public class StringUtil {

	public static boolean find(String text, String str)
	{
		//text = Mississippi 
		//str = substring
		// TODO: Complete recursive method find, which
		// tests whether a given text contains a string str
		// Hint: If the text starts with the string you want to match, then you are done.
		//       If not, consider the text that you obtain by removing the first character. 

		int length = text.length();

		if(text.isEmpty() || str.isEmpty()) {
			return true;
		}
		if(str.length() > text.length()) {
			return true;
		}
		if (text.length() == str.length()) {
			return text.equals(str);}

		else {return find(text.substring(1, length-1) , str);
		}


	}

}
